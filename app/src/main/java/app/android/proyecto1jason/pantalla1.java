package app.android.proyecto1jason;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.proyecto1jason.R;

public class pantalla1 extends AppCompatActivity {

    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button) findViewById(R.id.Ingresar);


        btn1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Bienvenido usuario Spender", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(pantalla1.this, pantalla_de_seleccion.class);
                startActivity(intent);
            }


        });

    }
    public void sendRegistro(View view) {
        Toast.makeText(getApplicationContext(), "Explora la ubicacion", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }

}