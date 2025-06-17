package com.example.clubdeportivo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ArbitroActivity extends AppCompatActivity {

    Button btnPartidos, btnChat, btnHistorial, btnReportar, btnPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.arbitro);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Enlazar botones con sus IDs
        btnPartidos = findViewById(R.id.btnPartidos);
        btnChat = findViewById(R.id.btnChat);
        btnHistorial = findViewById(R.id.btnHistorial);
        btnReportar = findViewById(R.id.btnReportar);
        btnPerfil = findViewById(R.id.btnPerfil);

        // Acciones de cada botón
        btnPartidos.setOnClickListener(v ->
                startActivity(new Intent(ArbitroActivity.this, PartidosActivity.class)));

        btnChat.setOnClickListener(v ->
                startActivity(new Intent(ArbitroActivity.this, ChatActivity.class)));

        btnHistorial.setOnClickListener(v ->
                startActivity(new Intent(ArbitroActivity.this, HistorialActivity.class)));

        btnReportar.setOnClickListener(v ->
                startActivity(new Intent(ArbitroActivity.this, ReportarProblemaActivity.class)));

        btnPerfil.setOnClickListener(v ->
                startActivity(new Intent(ArbitroActivity.this, PerfilAjustesActivity.class)));
    }
}
