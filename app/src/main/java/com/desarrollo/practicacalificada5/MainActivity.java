package com.desarrollo.practicacalificada5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int numberone = 0;
    private int numbertwo = 0;
    private double result = 0;

    Button buttonSuma, buttonResta, buttonDivision, buttonMultiplicar, buttonCalcular;
    EditText number1, number2;
    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSuma = findViewById(R.id.btn_suma);
        buttonResta = findViewById(R.id.btn_resta);
        buttonDivision = findViewById(R.id.btn_division);
        buttonMultiplicar = findViewById(R.id.btn_multiplicar);
        buttonCalcular = findViewById(R.id.btn_calcular);
        number1 = findViewById(R.id.edit_number1);
        number2 = findViewById(R.id.edit_number2);
        textResultado = findViewById(R.id.text_resultado);

        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                numberone = Integer.parseInt(num1);
                numbertwo = Integer.parseInt(num2);

                if(isNumeric(num1) && isNumeric(num2)){
                    Calcular(1);
                }else {
                    Toast.makeText(MainActivity.this, "Ingrese valores numericos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                numberone = Integer.parseInt(num1);
                numbertwo = Integer.parseInt(num2);

                if(isNumeric(num1) && isNumeric(num2)){
                    Calcular(2);
                }else {
                    Toast.makeText(MainActivity.this, "Ingrese valores numericos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                numberone = Integer.parseInt(num1);
                numbertwo = Integer.parseInt(num2);

                if(isNumeric(num1) && isNumeric(num2)){
                    Calcular(3);
                }else {
                    Toast.makeText(MainActivity.this, "Ingrese valores numericos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                numberone = Integer.parseInt(num1);
                numbertwo = Integer.parseInt(num2);

                if(isNumeric(num1) && isNumeric(num2)){
                    Calcular(4);
                }else {
                    Toast.makeText(MainActivity.this, "Ingrese valores numericos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if(isNumeric(num1) && isNumeric(num2)){
                    textResultado.setText(String.valueOf(result));
                }else {
                    Toast.makeText(MainActivity.this, "Ingrese valores numericos.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean isNumeric(String strNum){
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private void Calcular(int index){
        switch (index){
            case 1: result = numberone + numbertwo; break;
            case 2: result = numberone - numbertwo; break;
            case 3: result = numberone / numbertwo; break;
            case 4: result = numberone * numbertwo; break;
        }
    }
}
