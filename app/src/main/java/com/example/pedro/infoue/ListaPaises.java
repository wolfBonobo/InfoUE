package com.example.pedro.infoue;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaPaises extends AppCompatActivity {

    ListView listaPaises;
    ImageView bandera;
    ArrayList<Pais> paises;//TIPO ENUM PAIS
    ArrayAdapter<Pais> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);
        listaPaises=(ListView)findViewById(R.id.listaPaises);
        bandera=(ImageView) findViewById(R.id.ivBandera);
        paises=( ArrayList<Pais>)getIntent().getSerializableExtra("listaPaises");//recuperamos arraylist
        //ADAPTADOR CON ARRAYLIST DE TIPO ENUM PAIS, COGE DIRECTAMENTE .name()
        adapter=new ArrayAdapter<Pais>(this, android.R.layout.simple_selectable_list_item, paises);
        listaPaises.setAdapter(adapter);

        listaPaises.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView vistaAdaptador, View view, int  i, long k){
                //RECUPERO BANDERA POR POSICION DE ELEMENTO SELECCIONADO DE LA LISTVIEW
                bandera.setImageResource(paises.get(i).getBandera());
            }
        });
    }


}
