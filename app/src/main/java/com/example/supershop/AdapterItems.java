package com.example.supershop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterItems extends RecyclerView.Adapter<AdapterItems.ItemsViewHolder> {


    private Context context;
    private List<Items> itemsList;

    public AdapterItems(Context context, List<Items> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_items, null);
        ItemsViewHolder holder = new ItemsViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
        Items items = itemsList.get(position);

        holder.image.setImageResource(items.getImage());
        holder.item_name.setText(items.getItem_name());
        holder.description.setText(items.getDescription());
        holder.price.setText(items.getPrice());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    class ItemsViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView item_name, description, price;

        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            item_name = itemView.findViewById(R.id.item_name);
            description = itemView.findViewById(R.id.description);
            price = itemView.findViewById(R.id.price);
        }

    }
}
