package com.example.states;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.states.databinding.ActivityAndhraPradeshPlaceBinding;
import com.example.states.databinding.ActivityMainBinding;

public class AndhraPradeshPlace extends AppCompatActivity {

    private ActivityAndhraPradeshPlaceBinding andhraPradeshPlaceBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        andhraPradeshPlaceBinding=ActivityAndhraPradeshPlaceBinding.inflate(getLayoutInflater());
        setContentView(andhraPradeshPlaceBinding.getRoot());


        andhraPradeshPlaceBinding.text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(AndhraPradeshPlace.this, ArakuValley.class);
                startActivity(send);
                finish();
            }
        });


        andhraPradeshPlaceBinding.text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(AndhraPradeshPlace.this, LordVenkateswaraTemple.class);
                startActivity(send);
                finish();
            }
        });


        andhraPradeshPlaceBinding.text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(AndhraPradeshPlace.this, NagarjunaKonda.class);
                startActivity(send);
                finish();
            }
        });


        andhraPradeshPlaceBinding.text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(AndhraPradeshPlace.this, Amaravati.class);
                startActivity(send);
                finish();
            }
        });





    }

}
