package com.example.clubdeportivo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText inputUsuario, inputPassword;
    private Button btnLoginGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);  // Asegúrate que este es el nombre correcto del layout

        inputUsuario = findViewById(R.id.inputUsuario);
        inputPassword = findViewById(R.id.inputPassword);
        btnLoginGo = findViewById(R.id.btnLoginGo);

        btnLoginGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = inputUsuario.getText().toString().trim();
                String password = inputPassword.getText().toString().trim();

                if (usuario.equals("tom") && password.equals("1234")) {
                    // Login correcto, abrir CanchasActivity
                    Intent intent = new Intent(LoginActivity.this, CanchasActivity.class);
                    startActivity(intent);
                    finish(); // cierra LoginActivity para que no regrese con back
                } else {
                    // Login incorrecto, mostrar mensaje
                    Toast.makeText(LoginActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
