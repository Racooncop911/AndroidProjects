package com.example.axl.ejemplo_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {


    /*declaracion de los objetos que se vincularan con los elementos visuales*/
    TextView texto1;
    ImageView imagen1;
    Button btn1, btn2, btn3, btn4;

    Intent llamada1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Vinculacion de los objetos con los elementos de la interfaz visual*/
        texto1 = (TextView) findViewById(R.id.textView1);
        imagen1 = (ImageView) findViewById(R.id.imageView1);
        btn1 = (Button) findViewById(R.id.buttonAMain);
        btn2 = (Button) findViewById(R.id.buttonBMain);
        btn3 = (Button) findViewById(R.id.buttonCMain);
        btn4 = (Button) findViewById(R.id.buttonDMain);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen1.setImageResource(R.mipmap.geo);
                texto1.setText("Hola Android");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen1.setImageResource(R.mipmap.tatto);
                texto1.setText("Hola Profe");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen1.setImageResource(R.mipmap.tec);
                texto1.setText("Hola Alumno");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamada1 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(llamada1);
            }
        });
    }
}
