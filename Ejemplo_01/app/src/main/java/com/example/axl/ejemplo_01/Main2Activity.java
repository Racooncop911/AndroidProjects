package com.example.axl.ejemplo_01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;


public class Main2Activity extends AppCompatActivity {

    Spinner combo1;
    ImageView imagen;
    ArrayAdapter<String> adaptador1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        combo1 = (Spinner) findViewById(R.id.spinnerMain2);
        imagen = (ImageView) findViewById(R.id.ImagenviewMain2);
        //adaptador1 = new ArrayAdapter<>(Main2Activity.this,android.R.layout.simple_spinner_item);
        //adaptador1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        //adaptador1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Opciones,android.R.layout.simple_selectable_list_item);
        combo1.setAdapter(adapter);


    }

}


