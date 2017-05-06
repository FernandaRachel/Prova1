package com.example.arqdsis.prova1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by arqdsis on 05/05/2017.
 */

// Fernanda Rachel - 201501934
public class DetalheDoPais extends AppCompatActivity {

    TextView textNome, textCapital, textArea, textPopulacao,textMoeda;
    ImageView imagemBandeira;
    Pais pais;

    // Fernanda Rachel - 201501934

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        textNome = (TextView) findViewById(R.id.txt_pais_nome);
        textCapital = (TextView) findViewById(R.id.txt_pais_capital);
        textArea = (TextView) findViewById(R.id.txt_pais_area);
        textPopulacao = (TextView) findViewById(R.id.txt_pais_populacao);
        textMoeda = (TextView) findViewById(R.id.txt_pais_moeda);
        imagemBandeira = (ImageView) findViewById(R.id.pais_bandeira);
        Intent intent = getIntent();
        //cliente = (Cliente)intent.getSerializableExtra(ListarClientesActivity.CLIENTE);
        textNome.setText(pais.getNome());
        textCapital.setText(pais.getCapital());
        textArea.setText(pais.getArea());
        textPopulacao.setText(pais.getPopulacao());
        textMoeda.setText(pais.getMoeda());
        imagemBandeira.setImageBitmap(pais.getBandeira());




    }
