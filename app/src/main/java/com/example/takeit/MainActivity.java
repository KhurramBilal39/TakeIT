package com.example.takeit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.takeit.Adapters.MainAdapter;
import com.example.takeit.Models.Mainmodel;
import com.example.takeit.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        ArrayList<Mainmodel> list = new ArrayList<>();
        list.add(new Mainmodel(R.drawable.b,"Burger","22,April,2034","3.00","5.00","421gr"));
        list.add(new Mainmodel(R.drawable.bbb,"largerBurger","22,April,2034","3.00","5.00","421gr"));
        list.add(new Mainmodel(R.drawable.bb,"Pizza","22,May,2034","3.00","5.00","421gr"));
        list.add(new Mainmodel(R.drawable.bbb,"Burger","22,April,2034","3.00","5.00","421gr"));
        list.add(new Mainmodel(R.drawable.bb,"Burger","22,April,2034","3.00","5.00","421gr"));
        list.add(new Mainmodel(R.drawable.bbb,"Burger","22,April,2034","3.00","5.00","421gr"));
        list.add(new Mainmodel(R.drawable.bb,"Burger","22,April,2034","3.00","5.00","421gr"));

        MainAdapter adapter = new MainAdapter(list,this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager  = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }
}