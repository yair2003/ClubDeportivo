package com.example.clubdeportivo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class CanchaDetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cancha_detalle);

        // Botón "Siguiente"
        Button btnSiguiente = findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir al layout de jugadores (jugadores_canchas.xml)
                Intent intent = new Intent(CanchaDetalleActivity.this, JugadoresCanchasActivity.class);
                startActivity(intent);
            }
        });

        // Flecha atrás (mismo comportamiento que el botón back del sistema)
        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
    }
}

