package com.sigbatec.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sigbatec.mobileapp.Activitys.ValidateUserNumber;
import com.sigbatec.mobileapp.model.ResObj;
import com.sigbatec.mobileapp.remote.ApiUtils;
import com.sigbatec.mobileapp.remote.UserService;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView Registar;
    EditText edtUsername;
    EditText edtPassword;
    Button btnLogin;
    UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtUsername = (EditText) findViewById(R.id.Usuario);
        edtPassword = (EditText) findViewById(R.id.Password);
        btnLogin = (Button) findViewById(R.id.Inicio);
        Registar = (TextView) findViewById(R.id.Registro);
        userService = ApiUtils.getUserService();

        Button siguiente;

        siguiente = (Button) findViewById(R.id.Inicio);
        siguiente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();
                //validate form
                if (validateLogin(username, password)) {
                    //do login
                    doLogin(username, password);
                }


            }
        });


        Registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ValidateUserNumber.class);
                startActivity(intent);

            }
        });


    }

    private void doLogin(final String username, final String password) {

        retrofit2.Call<ResObj> call = userService.login(username, password);
        call.enqueue(new Callback<ResObj>() {
            @Override
            public void onResponse(retrofit2.Call<ResObj> call, Response<ResObj> response) {
                if (response.isSuccessful()) {
                    ResObj ResObj = (com.sigbatec.mobileapp.model.ResObj) response.body();
                    if (ResObj.getMessage().equals("true")) {
                        //login start main activity
                        Intent intent = new Intent(MainActivity.this, InicioApp.class);
                        intent.putExtra("username", username);
                        startActivity(intent);

                    } else {
                        Toast.makeText(MainActivity.this, "El usuario o Contraseña es Incorrecto", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Error! Favor Reintentar", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<ResObj> call, Throwable t) {

                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    private boolean validateLogin(String username, String password) {

        if (username == null || username.trim().length() == 0) {
            Toast.makeText(this, "Email es requerido", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (password == null || password.trim().length() == 0) {
            Toast.makeText(this, "Password es requerido", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;


    }

}
