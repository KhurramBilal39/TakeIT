package com.example.takeit.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.takeit.Models.OrderModels;
import com.example.takeit.R;

import java.util.ArrayList;

public class OrderAdapaters extends RecyclerView.Adapter<OrderAdapaters.viewHolder> {

    ArrayList<OrderModels> list;
    Context context;

    public OrderAdapaters(ArrayList<OrderModels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_order,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    final OrderModels model = list.get(position);
    holder.orderImage.setImageResource(model.getOrder_image());
    holder.orderPPrice.setText(model.getOrder_price());
    holder.orderName.setText(model.getIteam_name());
    holder.orderNumber.setText(model.getOrder_number());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView orderImage;
        TextView orderPPrice,orderNumber,orderName;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            orderImage=itemView.findViewById(R.id.order_image);
            orderPPrice=itemView.findViewById(R.id.order_Price);
            orderName=itemView.findViewById(R.id.iteam_name);
            orderNumber=itemView.findViewById(R.id.order_number);
        }
    }
}
