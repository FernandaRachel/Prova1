package com.example.arqdsis.prova1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


// Fernanda Rachel - 201501934
public class MainActivity extends AppCompatActivity {

    public static final String SERVIDOR = "https://restcountries.eu/rest/v2/region/";
    public static final String LISTA = "br.usjt.ftce.desmob.clientev1.lista";

    //Spinner nomePais;
    EditText nomePais;
    public static final String CHAVE = "com.example.arqdsis.prova1.busca";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomePais = (EditText)findViewById(R.id.buscar_pais);

    }

// Fernanda Rachel - 201501934
    public void buscarPais(View view){
        Intent intent =  new Intent(this, ListarPaisActivity.class);
        String nome = nomePais.getText().toString();
        intent.putExtra(CHAVE, nome);
        startActivity(intent);
    }
}
