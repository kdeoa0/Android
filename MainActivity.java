package com.example.mytruefirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        }*/

        FusedLocationProviderClient fusedLocationProviderClient;
        TextView Resultado;
        EditText Distancia;
        EditText Carne;
        EditText Marisco;
        EditText Pizza;
        double longitude = 0.0;
        double latitude = 0.0;
        Resultado = (TextView) findViewById(R.id.Resultado);
        Distancia =(EditText) findViewById(R.id.Distancia);
        Carne =(EditText) findViewById(R.id.Carne);
        Marisco =(EditText) findViewById(R.id.Marisco);
        Pizza =(EditText) findViewById(R.id.Pizza);
        int PERMISSION_REQUEST_CODE = 100;
        //botones
        Button btn = findViewById(R.id.button2);
        Button btn2 = findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                double longitude = location.getLongitude();
                double latitude = location.getLatitude();*/

                int CarneC = Integer.parseInt(Carne.getText().toString());
                int MariscoC = Integer.parseInt(Marisco.getText().toString());
                int PizzaC = Integer.parseInt(Pizza.getText().toString());
                int DistanciaC = Integer.parseInt(Distancia.getText().toString());
                int suma = (CarneC * 10000) + (MariscoC * 15000) + (PizzaC * 5000);

                if (DistanciaC <= 20) {
                    if (suma >= 50000) {
                        Resultado.setText("El coste es $" + suma + " mas el envio de $" + 0);
                    } else if (suma < 50000 && suma >= 25000) {
                        DistanciaC = DistanciaC * 150;
                        Resultado.setText("El coste es $" + suma + " mas el envio de $" + DistanciaC);
                    } else {
                        DistanciaC = DistanciaC * 300;
                        Resultado.setText("El coste es $" + suma + " mas el envio de $" + DistanciaC + "  =" + longitude);
                    }
                } else {
                    Resultado.setText("Distancia mayor a 20 KM!!!");
                }
                Toast.makeText(getApplicationContext(), "papaitas", Toast.LENGTH_LONG).show();
            }
        });

    } // Closing brace for onCreate method

    class ConversorRadianes {
        public void convertirADecimalARadianes(double numeroDecimal) {
            double resultadoRadianes = Math.toRadians(numeroDecimal);
            Log.d("Conversión", numeroDecimal + " grados en radianes es igual a " + resultadoRadianes);
        }
    }
}
