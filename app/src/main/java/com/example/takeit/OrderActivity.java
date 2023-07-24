package com.example.takeit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.takeit.Adapters.OrderAdapaters;
import com.example.takeit.Models.OrderModels;
import com.example.takeit.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrderModels> list = new ArrayList<>();
        list.add(new OrderModels(R.drawable.bb,"5.23","12232","Chesse Burger"));
        list.add(new OrderModels(R.drawable.bb,"9.23","12285","Chesse Burger"));
        list.add(new OrderModels(R.drawable.no,"50.73","1223235","Noodles"));
        list.add(new OrderModels(R.drawable.bbb,"8.23","1223695","Medium Burger"));
        list.add(new OrderModels(R.drawable.fries,"4.23","12234","Fries"));
        list.add(new OrderModels(R.drawable.b,"3.23","12287","Small Burger"));
        list.add(new OrderModels(R.drawable.bb,"1.23","1222342","Large Burger"));


        OrderAdapaters adapaters = new OrderAdapaters(list,this);
        binding.orderRecycelerView.setAdapter(adapaters);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecycelerView.setLayoutManager(layoutManager);
    }
}