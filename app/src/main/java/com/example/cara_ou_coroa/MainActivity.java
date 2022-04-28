package com.example.cara_ou_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton ButtonJogar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonJogar = findViewById(R.id.Button_Jogar);
    }

    public void OnClickJogar(View view){
        Intent intent = new Intent(getApplicationContext(), ResultActivity.class);

        //gerar numero randomico e passar para outra tela
        int i = new Random().nextInt(2);//0-1*
        intent.putExtra("i" , i);
        startActivity(intent);

    }
}