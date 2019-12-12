package com.sigbatec.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button siguiente;

        siguiente = (Button) findViewById(R.id.buttonEnt);
        siguiente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent siguiente = new Intent(MainActivity.this, InicioApp.class);
                startActivity(siguiente);



            }
        });
        /*

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            Recupe siguiente2;

            siguiente2 = (Recupe) findViewById(R.id.Recuperar);
            siguiente2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, Main3ActivityR.class);
                    startActivity(i);
                }
            });

        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            Button siguiente3;

            siguiente3 = (Button) findViewById(R.id.button7);
            siguiente3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent siguiente3 = new Intent(MainActivity.this, MainActivity4.class);
                    startActivity(siguiente3);

                }
            });

    }

         */

    }
}
