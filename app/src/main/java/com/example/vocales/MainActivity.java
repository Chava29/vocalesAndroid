package com.example.vocales;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editadito;
    Button botoncito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editadito = findViewById(R.id.texto);
        botoncito = findViewById(R.id.voc);
        botoncito.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Clasesita objetito = new Clasesita();
        objetito.setTexto(editadito.getText().toString());

        if (objetito.vocala()==1){
            Toast.makeText(this, "Tiene: " + objetito.vocala() + " a", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Tiene " + objetito.vocala() + " aes",Toast.LENGTH_SHORT).show();
        }

        if (objetito.vocale()==1){
            Toast.makeText(this, "Tiene: " + objetito.vocale() + " e", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Tiene " + objetito.vocale() + " es",Toast.LENGTH_SHORT).show();
        }

        if (objetito.vocali()==1){
            Toast.makeText(this, "Tiene: " + objetito.vocali() + " i", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Tiene " + objetito.vocali() + " is",Toast.LENGTH_SHORT).show();
        }

        if (objetito.vocalo()==1){
            Toast.makeText(this, "Tiene: " + objetito.vocalo() + " o", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Tiene " + objetito.vocalo() + " os",Toast.LENGTH_SHORT).show();
        }

        if (objetito.vocalu()==1){
            Toast.makeText(this, "Tiene: " + objetito.vocalu() + " u", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Tiene " + objetito.vocalu() + " úes",Toast.LENGTH_SHORT).show();
        }
    }
}