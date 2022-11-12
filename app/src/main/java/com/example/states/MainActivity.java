package com.example.states;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.states.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ArrayList<Country> country = new ArrayList<>();
        country.add(new Country("Arunachal Pradesh"));
        country.add(new Country("Assam"));
        country.add(new Country("Bihar"));
        country.add(new Country("Chhattisgarh"));
        country.add(new Country("Goa"));
        country.add(new Country("Gujarat"));
        country.add(new Country("Haryana"));
        country.add(new Country("Himachal Pradesh"));
        country.add(new Country("Jammu and Kashmir"));
        country.add(new Country("Jharkhand"));
        country.add(new Country("Karnataka"));
        country.add(new Country("Kerala"));
        country.add(new Country("Madhya Pradesh"));
        country.add(new Country("Maharashtra"));
        country.add(new Country("Manipur"));
        country.add(new Country("Meghalaya"));
        country.add(new Country("Mizoram"));
        country.add(new Country("Nagaland"));
        country.add(new Country("Odisha"));
        country.add(new Country("Punjab"));
        country.add(new Country("Rajasthan"));
        country.add(new Country("Sikkim"));
        country.add(new Country("Tamil Nadu"));
        country.add(new Country("Telangana"));
        country.add(new Country("Tripura"));
        country.add(new Country("Uttar Pradesh"));
        country.add(new Country("Uttarakhand"));
        country.add(new Country("West Bengal"));

        StatesAdapter statesAdapter= new StatesAdapter(country);
        //StatesAdapter.setDataToAdapter(country);
        mBinding.view.setAdapter(statesAdapter);
    }
}