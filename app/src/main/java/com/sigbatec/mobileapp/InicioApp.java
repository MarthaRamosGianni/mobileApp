package com.sigbatec.mobileapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.sigbatec.mobileapp.Activitys.ActivityUserPerfil;
import com.sigbatec.mobileapp.Activitys.ContenedorInstruccionesActivity;
import com.sigbatec.mobileapp.Activitys.QrActivity;
import com.sigbatec.mobileapp.fragments.AyudaFragment;
import com.sigbatec.mobileapp.fragments.FinalAyudaFragment;
import com.sigbatec.mobileapp.fragments.InicioAyudaFragment;
import com.sigbatec.mobileapp.fragments.InicioFragment;
import com.sigbatec.mobileapp.fragments.InstruccionQrFragment;
import com.sigbatec.mobileapp.fragments.InstruccionServiciosFragment;
import com.sigbatec.mobileapp.interfaces.IComunicaFragments;


public class InicioApp extends AppCompatActivity implements IComunicaFragments, InicioFragment.OnFragmentInteractionListener, AyudaFragment.OnFragmentInteractionListener, FinalAyudaFragment.OnFragmentInteractionListener, InicioAyudaFragment.OnFragmentInteractionListener, InstruccionQrFragment.OnFragmentInteractionListener, InstruccionServiciosFragment.OnFragmentInteractionListener {

    Fragment FragmentInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_app);
        FragmentInicio = new InicioFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,FragmentInicio).commit();
    }



    @Override
    public void onFragmentInteraction(Uri uri) {


    }

    @Override
    public void CrearQR() {

        Toast.makeText(getApplicationContext(), "Generando Codigo QR", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , QrActivity.class);
        startActivity(intent);


    }

    @Override
    public void InstruccionAyuda() {


        Intent intent = new Intent(this , ContenedorInstruccionesActivity.class);
        startActivity(intent);


    }

    @Override
    public void Servicios() {
        Intent intent = new Intent(this , ContenedorInstruccionesActivity.class);
        startActivity(intent);

    }

    @Override
    public void ListaPasajeros(){

            Intent intent = new Intent(this, ContenedorInstruccionesActivity.class);
            startActivity(intent);
        }



    @Override
    public void Gps() {
        Toast.makeText(getApplicationContext(), "GPS", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void Perfil() {

        Intent intent = new Intent(this , ActivityUserPerfil.class);
        startActivity(intent);

    }
}
