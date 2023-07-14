package com.example.desafio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class ProceedScreen extends AppCompatActivity {
    public EditText editNameUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed);

        Intent intent = getIntent();
        String nomeUsuario = intent.getStringExtra("nome");

        TextView textViewNomeUsuario = findViewById(R.id.textViewNomeUsuario);
        String mensagemPadrao = "Bem-vindo ";
        String mensagemCompleta = mensagemPadrao + nomeUsuario;
        textViewNomeUsuario.setText(mensagemCompleta);

        Toast.makeText(ProceedScreen.this, nomeUsuario, Toast.LENGTH_SHORT).show();
    }

}
