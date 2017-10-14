package com.example.pedro.infoue;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class WikiEU extends AppCompatActivity {
    //ATRIBUTOS
    ListView listaPaises;
    ArrayList<Pais> paises;
    ArrayAdapter<Pais> adapter;
    Intent e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);//Reutilizo Layout  activity_lista_paises



        listaPaises=(ListView)findViewById(R.id.listaPaises);

       //listaPaises.setBackgroundColor(Color.BLUE);
        paises=( ArrayList<Pais>)getIntent().getSerializableExtra("listaPaises");//recuperamos arraylist Enum ENVIA MENU

        adapter=new ArrayAdapter<Pais>(this, android.R.layout.simple_gallery_item, paises);
        listaPaises.setAdapter(adapter);
        //Creo la Nueva actividad PaginaWeb.class para abrir navegador web
        //se necesitan permisos, hay que añadir permiso em AndroidManifest.xml
        e = new Intent(this,PaginaWeb.class);

        listaPaises.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView vistaAdaptador, View view, int  i, long k){
                //Envio a la nueva actividad  la url del Objeto Enum Pais seleccionado en la ListView
                e.putExtra("direccion",paises.get(i).getUrl());
                startActivity(e);
            }
        });
    }
}
