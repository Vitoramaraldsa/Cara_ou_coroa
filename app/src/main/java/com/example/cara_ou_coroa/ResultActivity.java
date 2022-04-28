package com.example.cara_ou_coroa;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class ResultActivity extends AppCompatActivity {

    private ImageView imageResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        imageResult = findViewById(R.id.imageView3);

        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("i");
        if(numero == 0){
        imageResult.setImageResource(R.drawable.moeda_cara);
        }else{
        imageResult.setImageResource(R.drawable.moeda_coroa);
        }
    }

    public void OnClickVoltar(View view){
        finish();
    }
}