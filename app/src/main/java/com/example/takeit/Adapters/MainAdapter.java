package com.example.takeit.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.takeit.DetailActivity;
import com.example.takeit.Models.Mainmodel;
import com.example.takeit.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder> {

    ArrayList<Mainmodel> list;
    Context context;

    public MainAdapter(ArrayList<Mainmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_mainfood,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        final Mainmodel model = list.get(position);
        holder.foodImage.setImageResource(model.getImage());
        holder.mainName.setText(model.getName());
        holder.mainDate.setText(model.getUpdate());
        holder.mainQuantity.setText(model.getQuantity());
        holder.mainPrice.setText(model.getPrice());
        holder.mainRate.setText(model.getRating());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("image",model.getImage());
                intent.putExtra("name",model.getName());
                intent.putExtra("price",model.getPrice());
                intent.putExtra("update",model.getUpdate());

               context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView mainName,mainQuantity,mainPrice,mainDate,mainRate;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            foodImage=itemView.findViewById(R.id.imageView);
            mainDate=itemView.findViewById(R.id.date);
            mainPrice=itemView.findViewById(R.id.orderPrice);
            mainRate=itemView.findViewById(R.id.rating);
            mainQuantity=itemView.findViewById(R.id.quantity);
            mainName=itemView.findViewById(R.id.name);
        }
    }
}
