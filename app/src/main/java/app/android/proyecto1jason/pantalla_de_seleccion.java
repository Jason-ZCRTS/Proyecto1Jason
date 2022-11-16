package app.android.proyecto1jason;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.proyecto1jason.R;

public class pantalla_de_seleccion extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

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
                Intent intent = new Intent(pantalla_de_seleccion.this, map.class);
                startActivity(intent);
            }

        });

        btn3 = (Button) findViewById(R.id.button5);

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Explora las opciones ", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(pantalla_de_seleccion.this, Pruebas.class);
                startActivity(intent);
            }

        });

        btn4 = findViewById(R.id.button6);
        String URL = "https://walink.co/7aab33";
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(URL);

                Intent i = new Intent(Intent.ACTION_VIEW,link);
                startActivity(i);
            }
        });
    }
}
