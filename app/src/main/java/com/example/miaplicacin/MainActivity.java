package com.example.miaplicacin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.miaplicacin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contadorP;
    int contador1;
    int contador2;
    int contador3;
    int contador4;
    int contador5;

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        binding.augmentarElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorP++;
                binding.contadorDeClics.setText(contadorP+contador1);
            }
        });

        binding.augmentarElContador1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                contador1++;
                binding.contadorDeClics.setText( contador1);
            }
        });

        binding.augmentarElContador1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                contador2++;
                binding.contadorDeClics.setText( contador2);
            }
        });

        binding.augmentarElContador1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                contador3++;
                binding.contadorDeClics.setText( contador3);
            }
        });

        binding.augmentarElContador1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                contador4++;
                binding.contadorDeClics.setText( contador4);
            }
        });

        binding.augmentarElContador1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                contador5++;
                binding.contadorDeClics.setText( contador5);
            }
        });
    }
}
