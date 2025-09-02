package com.example.vocales;

public class Clasesita {
    private String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int vocala() {
        int cuantas = texto.length();
        int as = 0;
        for (int i = 0; i < cuantas; i++)
            if (texto.charAt(i) == 'a')
                ++as;
        return as;
    }

    public int vocale() {
        int cuantas = texto.length();
        int es = 0;
        for (int i = 0; i < cuantas; i++)
            if (texto.charAt(i) == 'e')
                ++es;
        return es;
    }

    public int vocali() {
        int cuantas = texto.length();
        int is = 0;
        for (int i = 0; i < cuantas; i++)
            if (texto.charAt(i) == 'i')
                ++is;
        return is;
    }

    public int vocalo() {
        int cuantas = texto.length();
        int os = 0;
        for (int i = 0; i < cuantas; i++)
            if (texto.charAt(i) == 'o')
                ++os;
        return os;
    }

    public int vocalu() {
        int cuantas = texto.length();
        int us = 0;
        for (int i = 0; i < cuantas; i++)
            if (texto.charAt(i) == 'u')
                ++us;
        return us;
    }
}

