package seccion_01.certificacion.axl.seccion_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private final String GREETER =  "Hello from the other side";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.buttonMain1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Acceder al 2do Activity y mandarle un string

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("greeter", GREETER);
                startActivity(intent);

            }
        });
    }


}
