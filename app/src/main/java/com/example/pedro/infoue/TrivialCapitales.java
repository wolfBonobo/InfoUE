package com.example.pedro.infoue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TrivialCapitales extends AppCompatActivity {

    //Atributos vistas
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button respuesta;
    Button btnSiguiente;
    TextView tvResult;
    ImageView bandera;
    TextView tvPais;

    //atributos necesarios para funcinamiento de la app
    ArrayList<Pais> paises;
    int aleatorio;
    Pais paisOK;//Contiene el pais preguntado
    ArrayList<String> opcionCapitales;//Debe contener 4 opciones diferentes.
    boolean esta;//Utilizada para meter Paises en un arrayList y verificar que no este repetidos
    int nPreguntas=0,nAciertos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivial_banderas);//reutilizo Layout
        paises=(ArrayList<Pais>)getIntent().getSerializableExtra("listaPaises");
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btnSiguiente=(Button)findViewById(R.id.btnSiguiente);
        tvResult=(TextView) findViewById(R.id.tvResult);
        bandera=(ImageView)findViewById(R.id.bandera);
        tvPais=(TextView) findViewById(R.id.tvPais);
        paises=( ArrayList<Pais>)getIntent().getSerializableExtra("listaPaises");
        tvPais.setVisibility(View.INVISIBLE);
        btnInisibles();
    }

    public void generarPregunta(View view){
        btnVisibles();
        tvPais.setVisibility(View.VISIBLE);
        aleatorio=(int)(Math.random()*paises.size());//numero aletorio de 0 a numero de paises en enum/ArrayList
        paisOK=paises.get(aleatorio);//saco el Pais a contestar con numero aleatorio.
        opcionCapitales=new ArrayList();
        opcionCapitales.add(paisOK.getCapital());//meto La CAPITAL correcta en ArrayList
        bandera.setImageResource(paisOK.getBandera());//añado la bandera a la vista
        tvResult.setVisibility(View.INVISIBLE);
        tvPais.setText(paisOK.name());// muestro el pais a preguntar

        for (int i = 1; i < 4; i++)//for para rellenar 3 opciones mas sin que se repitan
        {
            esta = true;
            while (esta)
            {
                aleatorio= (int) (Math.random() * paises.size());//saco pais aleatorio de toda la lista
                if (!opcionCapitales.contains(paises.get(aleatorio).getCapital()))//si no esta, se añade elemento
                {
                    opcionCapitales.add(paises.get(aleatorio).getCapital());
                    esta = false;//sale de bucle while
                }
            }
        }
        //for para colocar las opciones de manera aleatoria en los botones
        for (int i = 0; i < 4; i++)
        {
            aleatorio= (int) (Math.random() * opcionCapitales.size());//numero aleatorio de 0 numero de elementos

            switch (i)
            {
                case 0:
                    btn1.setText(opcionCapitales.get(aleatorio)); //añado texto a btn1
                    opcionCapitales.remove(aleatorio);//saco elemento opcionPaises para numero aleatorio de 0 a 2
                    break;
                case 1:
                    btn2.setText(opcionCapitales.get(aleatorio)); //añado texto a btn2
                    opcionCapitales.remove(aleatorio);//saco elemento opcionPaises para numero aleatorio de 0 a 1
                    break;
                case 2:
                    btn3.setText(opcionCapitales.get(aleatorio)); //añado texto a btn3
                    opcionCapitales.remove(aleatorio);//saco elemento, numero aleatorio solo puede ser 0
                    break;
                case 3:
                    btn4.setText(opcionCapitales.get(aleatorio)); //añado texto a btn4
            }
        }
        btnSiguiente.setVisibility(View.INVISIBLE);
    }

    public void comprobar(View view){
        btnInisibles();
        tvResult.setVisibility(View.VISIBLE);
        respuesta=(Button)view;
        nPreguntas++;

        if(respuesta.getText().equals(paisOK.getCapital())){
            Toast.makeText(getApplicationContext(),"Correcto! :)" , Toast.LENGTH_LONG).show();
            nAciertos++;
        }
        else {
            Toast.makeText(getApplicationContext(), "Error! :(", Toast.LENGTH_LONG).show();
        }

        btnSiguiente.setVisibility(View.VISIBLE);
        tvResult.setText(String.valueOf((100*nAciertos)/nPreguntas)+" % ");

    }
    public void btnVisibles(){
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }
    public void btnInisibles(){
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
    }
}
