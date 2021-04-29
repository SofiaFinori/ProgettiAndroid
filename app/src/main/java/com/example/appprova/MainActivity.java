package com.example.appprova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Dichiarati globali
    EditText txtUsername;
    EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("prova", "chiamata onCreate");

        //Recupero le due istanze dei due oggetti grafici
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);

        //Recupero il bottone
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("prova", "cliccato Login");
                //Recupero cosa ha scritto l'utente
                String user = txtUsername.getText().toString();
                String pwd = txtPassword.getText().toString();

                if(user.equals("admin") && pwd.equals("1234")){
                    Log.d("prova", "login corretto");
                    //Voglio saltare all'altra activity
                    //sto preparando un intent (una classe che rappresenta un'intenzione, qualcosa che voglio fare)
                    Intent i = new Intent(getApplicationContext(), AltraActivity.class);
                    startActivity(i);
                    i.putExtra("KEY", "Ciao"); //gli passo anche un valore

                    finish(); //non ho più l'activity main, distruggo questa activity quando passo all'altra


                } else {
                    Log.d("prova", "login sbagliato");
                    Toast.makeText(getApplicationContext(), "Username o password errati!", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("prova", "chiamata onPause");
    }
}