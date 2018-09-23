package com.example.axl.ejemplo_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    /*declaracion de los objetos que se vincularan con los elementos visuales*/
    TextView texto1;
    ImageView imagen1;
    Button btn1, btn2, btn3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Vinculacion de los objetos con los elementos de la interfaz visual*/
        texto1 = findViewById(R.id.textView1);
        imagen1 = findViewById(R.id.imageView1);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen1.setImageResource(R.mipmap.star);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen1.setImageResource(R.mipmap.ic_launcher_round);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen1.setImageResource(R.mipmap.ic_launcher);
            }
        });

    }
}
