package com.example.arqdsis.prova1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by arqdsis on 05/05/2017.
 */

// Fernanda Rachel - 201501934

public class ListarPaisActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_pais);
        listView = (ListView)findViewById(R.id.lista_de_pais);
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        lista = buscarPais(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        listView.setAdapter(adapter);
    }

// Fernanda Rachel - 201501934
    private ArrayList<String> listaDePaises(){
        ArrayList<String> paises =  new ArrayList<>();
        paises.add("Africa");
        paises.add("Americas");
        paises.add("Asia");
        paises.add("Europe");
        paises.add("Oceania");

        return paises;
    }


// Fernanda Rachel - 201501934
    private ArrayList<String> buscarPais(String chave){
        ArrayList<String> paises = listaDePaises();
        ArrayList<String> resultado =  new ArrayList<>();

        if(chave == null || chave.length() == 0){
            return paises;
        }
        for(String nome:paises){
            if(nome.toUpperCase().contains(chave.toUpperCase())){
                resultado.add(nome);
            }
        }
        return resultado;
    }
}
