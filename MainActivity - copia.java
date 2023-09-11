package com.example.mytruefirstapp;

import static java.lang.Character.getNumericValue;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        class ConversorRadianes {
            public void convertirADecimalARadianes(double numeroDecimal) {

                double resultadoRadianes = Math.toRadians(numeroDecimal);


                Log.d("Conversión", numeroDecimal + " grados en radianes es igual a " + resultadoRadianes);
            }
        }

        TextView Resultado;
        EditText Distancia;
        EditText Carne;
        EditText Marisco;
        EditText Pizza;



        Resultado = (TextView) findViewById(R.id.Resultado);
        Distancia =(EditText) findViewById(R.id.Distancia);
        Carne =(EditText) findViewById(R.id.Carne);
        Marisco =(EditText) findViewById(R.id.Marisco);
        Pizza =(EditText) findViewById(R.id.Pizza);


        //botones
        Button btn = findViewById(R.id.button2);
        Button btn2 = findViewById(R.id.button3);


        //calculo
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int CarneC = Integer.parseInt(Carne.getText().toString());
                int MariscoC = Integer.parseInt(Marisco.getText().toString());
                int PizzaC = Integer.parseInt(Pizza.getText().toString());
                int DistanciaC = Integer.parseInt(Distancia.getText().toString());
                int suma = (CarneC*10000)+(MariscoC*15000)+(PizzaC*5000);
                if (DistanciaC <= 20){
                    if(suma>=50000){
                        Resultado.setText("El coste es $"+ suma+" mas el envio de $"+0);
                    } else if (suma<50000 && suma >= 25000) {
                        DistanciaC = DistanciaC *150;
                        Resultado.setText("El coste es $"+ suma+" mas el envio de $"+DistanciaC);
                    }else {
                        DistanciaC = DistanciaC *300;
                        Resultado.setText("El coste es $"+ suma+" mas el envio de $"+DistanciaC);
                    }
                }else {
                    Resultado.setText("Distancia mayor a 20 KM!!!");
                }


                Toast.makeText(getApplicationContext(),"papaitas", Toast.LENGTH_LONG).show();

            }
        });


        //registro gmail
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Usuario registrado", Toast.LENGTH_LONG).show();
            }
        });





        }




    }

