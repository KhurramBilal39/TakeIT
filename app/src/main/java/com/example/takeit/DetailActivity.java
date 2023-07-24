package com.example.takeit;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.takeit.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);

        setContentView(binding.getRoot());

        int image = getIntent().getIntExtra("image",0);



        try {

            int Prrice = Integer.parseInt(getIntent().getStringExtra("price"));
            int date = Integer.parseInt(getIntent().getStringExtra("update"));
            String name = getIntent().getStringExtra("Name");




            binding.detailfoodname.setText(name);
            binding.detaildate.setText(String.format("%d",date));
            binding.detailPrice.setText(String.format("%d",Prrice));
        }
        catch (NumberFormatException e){

        }
        //String date = getIntent().getStringExtra("date");
        binding.detailImage.setImageResource(image);



    }
}