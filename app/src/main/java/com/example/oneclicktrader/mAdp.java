package com.example.oneclicktrader;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class mAdp extends RecyclerView.Adapter<mAdp.ViewHolder> {
    private ArrayList<cell_item_c> cell_item_cs;

    public  static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView iv;
        public TextView  brandT;
        public TextView  condT;
        public TextView  priceT;



        public ViewHolder(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.cell_image);
            brandT = itemView.findViewById(R.id.cell_brand);
            condT = itemView.findViewById(R.id.cell_condition);
            priceT = itemView.findViewById(R.id.cell_price);
        }
    }

    public mAdp(ArrayList<cell_item_c> cell_item_cs) {
        this.cell_item_cs = cell_item_cs;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        cell_item_c ci = cell_item_cs.get(position);
        holder.iv.setImageResource(ci.cell_imagesource);
        holder.priceT.setText(Double.toString(ci.cell_price) + "$");
        holder.condT.setText(ci.cell_condition);
        holder.brandT.setText(ci.cell_brand);

    }

    @Override
    public int getItemCount() {
        return cell_item_cs.size();
    }
}
