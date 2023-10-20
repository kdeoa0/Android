package com.example.projecto_final;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class CheckoutActivity extends AppCompatActivity {
    private EditText Nombre1, Cantidad1, Distancia1;
    private TextView Precioss;
    private Double Empanadas_total=0.0, PC_total=0.0, Cazuela_total=0.0, Total=0.0;

    private Double  Distancia=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        TextView textView =findViewById(R.id.textViewTotal1);

    };

    public void Calculo(View view) {
        Nombre1 = findViewById(R.id.editTextQuantity);
        String Nombres = Nombre1.getText().toString();

            Cantidad1 = findViewById(R.id.editTextQuantity2);
            String Cantidadt = Cantidad1.getText().toString();
            double Cantidad = Double.parseDouble(Cantidadt);

            Distancia1 = findViewById(R.id.editTextQuantity3);
            String Distanciat = Distancia1.getText().toString();
            double Distancia = Double.parseDouble(Distanciat);


        if (Cantidad < 999) {
            if (Nombres.equals("Empanada") == true) {
                Empanadas_total = Empanadas_total + (Cantidad * 2500);
            } else if (Nombres.equals("Pastel de choclo") == true) {
                PC_total = PC_total + (Cantidad * 3500);
            } else if (Nombres.equals("Cazuela") == true) {
                Cazuela_total = Cazuela_total + (Cantidad * 5000);
            } else {
            Toast.makeText(this, "Cantidad no válida", Toast.LENGTH_SHORT).show();
        }

        Total= Empanadas_total+ PC_total+ Cazuela_total;

        String nuevoTextos = ""+Total+" + Envio";
        TextView textView = findViewById(R.id.textViewTotal1);
        textView.setText(nuevoTextos);

    };};
    public void Precio_Final(View view) {
        if (Total <= 24999 && Distancia <= 20) {
            Total = (Distancia * 300) + Total;
        } else if (Total <= 49999 && Distancia <= 20) {
            Total = (Distancia * 150) + Total;
        } else if (Total >= 50000 && Distancia <= 20) {
            Total = (Distancia * 0) + Total;
        }else {System.out.println("Distancia mayor a 20 Kilometros");}

        Total= Empanadas_total+ PC_total+ Cazuela_total;
        String nuevoTextos = "EL total es de "+Total+" \nMuchas Gracias por su compra";
        TextView textView = findViewById(R.id.editTextQuantity4);
        textView.setText(nuevoTextos);


    };
};





