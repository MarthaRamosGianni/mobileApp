package com.sigbatec.mobileapp.Activitys;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sigbatec.mobileapp.Activitys.ui.main.SectionsPagerAdapter;
import com.sigbatec.mobileapp.R;
import com.sigbatec.mobileapp.fragments.AyudaFragment;
import com.sigbatec.mobileapp.fragments.FinalAyudaFragment;
import com.sigbatec.mobileapp.fragments.InicioAyudaFragment;
import com.sigbatec.mobileapp.fragments.InstruccionQrFragment;
import com.sigbatec.mobileapp.fragments.InstruccionServiciosFragment;

public class ContenedorInstruccionesActivity extends AppCompatActivity implements AyudaFragment.OnFragmentInteractionListener, FinalAyudaFragment.OnFragmentInteractionListener, InstruccionServiciosFragment.OnFragmentInteractionListener, InstruccionQrFragment.OnFragmentInteractionListener, InicioAyudaFragment.OnFragmentInteractionListener {

    private LinearLayout linearPuntos;//linearLayout de Puntos
    private TextView[] puntosSlide;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_instrucciones);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        //Se instancia el linearLayout de puntos
        linearPuntos=findViewById(R.id.idLinearPuntos);
        agregaIndicadorPuntos(0);
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(sectionsPagerAdapter);

        mViewPager.addOnPageChangeListener(viewListener);

    }

    public void agregaIndicadorPuntos(int pos){
        puntosSlide =new TextView[5];
        linearPuntos.removeAllViews();

        for (int i=0; i< puntosSlide.length; i++){
            puntosSlide[i]=new TextView(this);
            puntosSlide[i].setText(Html.fromHtml("&#8226;"));
            puntosSlide[i].setTextSize(35);
            puntosSlide[i].setTextColor(getResources().getColor(R.color.colorBlank));
            linearPuntos.addView(puntosSlide[i]);
        }

        if(puntosSlide.length>0){
            puntosSlide[pos].setTextColor(getResources().getColor(R.color.colorAccent));
        }

    }

    ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            agregaIndicadorPuntos(i);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}