package com.example.desafio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "aaa";
    public EditText editNameUser;
    private Button buttonProceed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        iniciarComponentes();

        buttonProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeUsuario = editNameUser.getText().toString();

                Intent intent = new Intent(MainActivity.this, ProceedScreen.class);
                intent.putExtra("nome", nomeUsuario);
                startActivity(intent);
            }
        });

    }
    private void iniciarComponentes(){
        editNameUser = findViewById(R.id.textViewNomeUsuario);
        buttonProceed = findViewById(R.id.buttonProceed);
    }

}