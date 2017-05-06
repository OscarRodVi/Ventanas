package com.example.rv_od.ventanas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //con este se abre la ventana de Bienvenida
                //Intent intencion = new Intent(getBaseContext(), Bienvenida.class);
                //startActivity(intencion);

                Intent navegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nba.com"));
                startActivity(navegador);
            }
        });
    }
}
