package com.example.pedro.infoue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PaginaWeb extends AppCompatActivity {
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_web);
        webView1=(WebView)findViewById(R.id.webView1);

        //RECUPERO URL ENVIADA DESDE WikiEU.java
        Bundle bundle =getIntent().getExtras();
        webView1.loadUrl(bundle.getString("direccion"));
    }
}
