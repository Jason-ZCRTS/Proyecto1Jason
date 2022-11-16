package app.android.proyecto1jason;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyecto1jason.R;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;

public class map extends AppCompatActivity {

    ImageView btn3;


    MapView mapView;
    MapboxMap mapboxMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        mapView = findViewById(R.id.mapView);
        mapView.getMapboxMap().loadStyleUri(Style.MAPBOX_STREETS);

        btn3 = (ImageView) findViewById(R.id.Volviendo);


        btn3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Regresando", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(map.this, pantalla_de_seleccion.class);
                startActivity(intent);
            }


        });
    }
}