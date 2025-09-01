package com.example.vocales;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
        Toast.makeText(this, "as " + objetito.vocala(), Toast.LENGTH_SHORT).show();
    }
}