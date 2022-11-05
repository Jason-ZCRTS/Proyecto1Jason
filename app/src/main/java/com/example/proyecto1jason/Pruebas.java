package com.example.proyecto1jason;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pruebas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebas);
    }
    public void openProximity(View view) {
        startActivity(new Intent(Pruebas.this, ProximityActivity.class));
    }
    public void openGyroscope(View view) {
        startActivity(new Intent(Pruebas.this, GyroscopeActivity.class));
    }
    public void openRotationVector(View view) {
        startActivity(new Intent(Pruebas.this, RotationVectorActivity.class));
    }

}
