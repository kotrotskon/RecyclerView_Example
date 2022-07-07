package com.example.recyclerview_example;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter {

    ArrayList<Product> products;
    Context context;

    public ProductAdapter(Context context, ArrayList<Product> products){
        this.context = context;
        this.products = products;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View row = layoutInflater.inflate(R.layout.product_row, parent, false);
        MyViewHolder myHolder = new MyViewHolder(row);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((MyViewHolder)holder).txtVw_id.setText(String.valueOf(products.get(position).getId()));
        ((MyViewHolder)holder).txtVw_title.setText(products.get(position).getTitle());
        ((MyViewHolder)holder).txtVw_description.setText(products.get(position).getDescription());
        ((MyViewHolder)holder).txtVw_price.setText(String.valueOf(products.get(position).getPrice()));
        Picasso.get().load(products.get(position).getImage()).into(((MyViewHolder)holder).imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtVw_title = view.findViewById(R.id.txtVw_title);
                txtVw_title.setTextColor(Color.RED);
                Toast.makeText(context, "You Click "+txtVw_title.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        ((MyViewHolder)holder).btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = ((MyViewHolder)holder).txtVw_title.getText().toString();
                Toast.makeText(context, "Edit "+title, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.products.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtVw_id;
        TextView txtVw_title;
        TextView txtVw_description;
        TextView txtVw_price;
        ImageView imageView;

        Button btn_edit;
        Button btn_delete;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtVw_id = itemView.findViewById(R.id.txtVw_id);
            txtVw_title = itemView.findViewById(R.id.txtVw_title);
            txtVw_description = itemView.findViewById(R.id.txtVw_description);
            txtVw_price = itemView.findViewById(R.id.txtVw_price);
            imageView = itemView.findViewById(R.id.imageView);

            btn_edit = itemView.findViewById(R.id.btn_edit);
            btn_delete = itemView.findViewById(R.id.btn_delete);
        }
    }
}
