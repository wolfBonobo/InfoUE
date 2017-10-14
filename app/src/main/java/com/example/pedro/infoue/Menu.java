package com.example.pedro.infoue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    ArrayList<Pais> paises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        paises=new ArrayList();
        for(Pais p:Pais.values()){//creamos ArrayList recuperando datos del Enum
            paises.add(p);
        }
    }

    public void lanzarUE(View view){

        Intent e = new Intent(this, WikiEU.class );
        e.putExtra("listaPaises",paises);//enviamos arraylist a WikiEU.class
        startActivity(e);
    }

    public void lanzarListaBanderas(View view){

        Intent lp = new Intent(this, ListaPaises.class );
        lp.putExtra("listaPaises",paises);//enviamos arraylist a ListaPaises.class
        startActivity(lp);
    }

    public void lanzarTrivialBanderas(View view){

        Intent tv= new Intent(this, TrivialBanderas.class );
        tv.putExtra("listaPaises",paises);//enviamos arraylist a TrivialBanderas.class
        startActivity(tv);
    }

    public void lanzarTrivialCapitales(View view){

        Intent tc= new Intent(this, TrivialCapitales.class );
        tc.putExtra("listaPaises",paises);//enviamos arraylist a TrivialCapitales.class
        startActivity(tc);
    }
}
