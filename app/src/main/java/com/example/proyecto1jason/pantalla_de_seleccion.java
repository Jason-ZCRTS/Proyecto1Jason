package com.example.proyecto1jason;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class pantalla_de_seleccion extends AppCompatActivity {

    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_de_seleccion);

        btn1 = (Button) findViewById(R.id.button);


        btn1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Vuelve a ingresar", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(pantalla_de_seleccion.this, pantalla1.class);
                startActivity(intent);
            }


        });
        btn2 = (Button) findViewById(R.id.button2);


        btn2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Explora la ubicacion ", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(pantalla_de_seleccion.this, mapaJJ.class);
                startActivity(intent);
            }

        });
    }
}