package com.example.calculadoramodo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //atributes
    private TextView campo;
    //variables para operar
    public double a = 0;
    public double b = 0;
    //variable que almacena cadena para numeros
    String cadena = "";
    //muestra resultados anteriores
    String historial = "";
    boolean bandera = false;
    //int para un switch, case of, we do an operation.
    int signo = 0;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume (){
        super.onResume();
        Toast.makeText(this, "Bienvenido de vuelta", Toast.LENGTH_SHORT).show();
    }


    public void button5(View view){
        TextView campo = findViewById(R.id.textView);
        cadena += "5";
        campo.setText(cadena);
        if(bandera == false){
            a = Double.parseDouble(cadena);
        }else {
            b = Double.parseDouble(cadena);
        }
    }

    public void button6 (View view){
        TextView campo = findViewById(R.id.textView);
        cadena += "6";
        campo.setText(cadena);
        if(bandera == false){
            a = Double.parseDouble(cadena);
        }else {
            b = Double.parseDouble(cadena);
        }
    }
    public void button1 (View view){
        TextView campo = findViewById(R.id.textView);
        cadena += "1";
        campo.setText(cadena);
        if(bandera == false){
            a = Double.parseDouble(cadena);
        }else {
            b = Double.parseDouble(cadena);
        }
    }
    public void button2 (View view){
        TextView campo = findViewById(R.id.textView);
        cadena += "2";
        campo.setText(cadena);
        if(bandera == false){
            a = Double.parseDouble(cadena);
        }else {
            b = Double.parseDouble(cadena);
        }
    }
    public void button3 (View view){
        TextView campo = findViewById(R.id.textView);
        cadena += "3";
        campo.setText(cadena);
        if(bandera == false){
            a = Double.parseDouble(cadena);
        }else {
            b = Double.parseDouble(cadena);
        }
    }
    public void button4 (View view){
        TextView campo = findViewById(R.id.textView);
        cadena += "4";
        campo.setText(cadena);
        if(bandera == false){
            a = Double.parseDouble(cadena);
        }else {
            b = Double.parseDouble(cadena);
        }
    }
    public void button7 (View view){
        TextView campo = findViewById(R.id.textView);
        cadena += "7";
        campo.setText(cadena);
        if(bandera == false){
            a = Double.parseDouble(cadena);
        }else {
            b = Double.parseDouble(cadena);
        }
    }
    public void button8 (View view){
        TextView campo = findViewById(R.id.textView);
        cadena += "8";
        campo.setText(cadena);
        if(bandera == false){
            a = Double.parseDouble(cadena);
        }else {
            b = Double.parseDouble(cadena);
        }
    }
    public void button9 (View view){
        TextView campo = findViewById(R.id.textView);
        cadena += "9";
        campo.setText(cadena);
        if(bandera == false){
            a = Double.parseDouble(cadena);
        }else {
            b = Double.parseDouble(cadena);
        }
    }
    public void button0 (View view){
        TextView campo = findViewById(R.id.textView);
        cadena += "0";
        campo.setText(cadena);
        if(bandera == false){
            a = Double.parseDouble(cadena);
        }else {
            b = Double.parseDouble(cadena);
        }
    }

    //botones de operaciones, llamados por el metodo escrito en el xml tag
    public void suma(View view){
        TextView campo = findViewById(R.id.textView);   //textview tomara valor del signo correspondiente
        campo.setText("+"); //igualamos el text a el signo
        signo = 1;  //switch value for operation
        bandera = true;     //bandera prendida para llenar valor b
        cadena = "";    //limpiamos el valor cadena para que no se acumulen los numeros ya puestos./
    }
    public void resta (View view){
        TextView campo = findViewById(R.id.textView);
        campo.setText("-");
        signo = 2;
        cadena = "";
        bandera = true;
    }
    public void multiplicacion (View view){
        TextView campo = findViewById(R.id.textView);
        campo.setText("x");
        signo = 3;
        cadena = "";
        bandera = true;
    }
    public void division(View view){
        TextView campo = findViewById(R.id.textView);
        campo.setText("/");
        signo = 4;
        cadena = "";
        bandera = true;
    }
    public void enter (View view){
        TextView campo = findViewById(R.id.textView);
        double temp = 0;
        switch (signo){
            case 1:
                temp = a+b;
                campo.setText(String.valueOf(temp));
                bandera = false;
                //historial += String.valueOf(temp); por si se almacena el historial este compita ira guardando esos datos. Estaria mas chido si tuvieramos 2 pantallas/
            break;
            case 2:
                temp = a-b;
                campo.setText(String.valueOf(temp));
                bandera = false;
            break;
            case 3:
                temp = a*b;
                campo.setText(String.valueOf(temp));
                bandera = false;
            break;
            case 4:
                if (a!=0 && b!=0) {
                    temp = a / b;
                    campo.setText(String.valueOf(temp));
                    bandera = false;
                }else{
                    campo.setText("0");
                    Toast.makeText(this, "Division con 0", Toast.LENGTH_SHORT).show();
                }
            break;
        }
        signo = 0;
        a=0;
        b=0;
        cadena = "";
    }
}
