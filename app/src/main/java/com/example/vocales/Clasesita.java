package com.example.vocales;

public class Clasesita {
    private String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public int vocala(){
        int cuantas = texto.length();
        int as =0;
        for (int i =0; i< cuantas; i++)
            if (texto.charAt(i) == 'a')
                ++as;
        return as;
    }
}
