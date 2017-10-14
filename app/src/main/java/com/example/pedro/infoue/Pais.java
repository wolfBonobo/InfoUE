package com.example.pedro.infoue;

/**
 * Created by Pedro on 12/10/2017.
 */

public enum Pais {
    Union_Europea("Bruselas","https://es.wikipedia.org/wiki/Uni%C3%B3n_Europea",R.drawable.uebandera),
    Alemania("Berlín","https://es.wikipedia.org/wiki/Alemania",R.drawable.alemania),
    Austria("Viena","https://es.wikipedia.org/wiki/Austria",R.drawable.austria),
    Belgica("Bruselas","https://es.wikipedia.org/wiki/B%C3%A9lgica",R.drawable.belgica),
    Bulgaria("Sofía","https://es.wikipedia.org/wiki/Bulgaria",R.drawable.bulgaria),
    Chipre("Nicosia","https://es.wikipedia.org/wiki/Chipre",R.drawable.chipre),
    Croacia("Zagred","https://es.wikipedia.org/wiki/Croacia",R.drawable.croacia),
    Dinamarca("Copenhague","https://es.wikipedia.org/wiki/Dinamarca",R.drawable.dinamarca),
    Eslovaquia("Bratislava","https://es.wikipedia.org/wiki/Eslovaquia",R.drawable.eslovaquia),
    Eslovenia("Liubliana","https://es.wikipedia.org/wiki/Eslovenia",R.drawable.eslovenia),
    España("Madrid", "https://es.wikipedia.org/wiki/Espa%C3%B1a",R.drawable.espana),
    Estonia("Tallin","https://es.wikipedia.org/wiki/Estonia",R.drawable.estonia),
    Finlandia("Helsinki","https://es.wikipedia.org/wiki/Finlandia",R.drawable.finlandia),
    Francia("París","https://es.wikipedia.org/wiki/Francia",R.drawable.francia),
    Grecia("Atenas","https://es.wikipedia.org/wiki/Grecia",R.drawable.grecia),
    Hungría("Budapest","https://es.wikipedia.org/wiki/Hungr%C3%ADa",R.drawable.hungria),
    Irlanda("Dublín","https://es.wikipedia.org/wiki/Irlanda",R.drawable.irlanda),
    Italia("Roma","https://es.wikipedia.org/wiki/Italia",R.drawable.italia),
    Letonia("Rega","https://es.wikipedia.org/wiki/Letonia",R.drawable.letonia),
    Lituania("Vilna","https://es.wikipedia.org/wiki/Lituania",R.drawable.lituania),
    Luxemburgo("Ciudad de Luxemburgo","https://es.wikipedia.org/wiki/Luxemburgo",R.drawable.luxemburgo),
    Malta("La valeta","https://es.wikipedia.org/wiki/Malta",R.drawable.malta),
    Paises_Bajos("Ámsterdam","https://es.wikipedia.org/wiki/Reino_de_los_Pa%C3%ADses_Bajos",R.drawable.paisesbajos),
    Polonia("Varsovia","https://es.wikipedia.org/wiki/Polonia",R.drawable.polonia),
    Portugal("Lisboa","https://es.wikipedia.org/wiki/Portugal",R.drawable.portugal),
    República_Checa("Praga","https://es.wikipedia.org/wiki/Rep%C3%BAblica_Checa",R.drawable.repulicacheca),
    Rumania("Bucarest","https://es.wikipedia.org/wiki/Rumania",R.drawable.rumania),
    Suecia("Estocolmo","https://es.wikipedia.org/wiki/Suecia",R.drawable.suecia);


    private String capital;
    private String url;
    private int bandera;
//Constructor
    private Pais(String capital, String url,int bandera) {
        this.capital = capital;
        this.url = url;
        this.bandera=bandera;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getBandera() {
        return bandera;
    }
    public void setBandera(int bandera) {
        this.bandera = bandera;
    }
}
