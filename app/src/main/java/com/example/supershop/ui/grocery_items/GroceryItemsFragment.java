package com.example.supershop.ui.grocery_items;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.supershop.AdapterItems;
import com.example.supershop.Items;
import com.example.supershop.R;

import java.util.ArrayList;
import java.util.List;

public class GroceryItemsFragment extends Fragment {

    RecyclerView recyclerView;
    AdapterItems adapterItems;
    List<Items> itemsList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_grocery_items, container, false);

        itemsList = new ArrayList<>();
        recyclerView = root.findViewById(R.id.recyclerView_grocery_items);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        itemsList.add(new Items(
                R.drawable.icons8_bread_64px,
                "Bread", "Well baked bread, large pieces", "$1.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_egg_64px,
                "Egg", "Chicken eggs, 4x", "$0.50"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_milk_bottle_64px,
                "Milk", "Cow milk, 1 litre bottle", "$1.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_rice_64px,
                "Rice", "Basmati rice, 1 kg packet", "$2.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_butter_64px,
                "Butter", "Cow milk butter", "$2.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_honey_64px_1,
                "Honey", "Sweet honey from sundarban", "$2.00"
        ));

        adapterItems = new AdapterItems(getActivity(), itemsList);
        recyclerView.setAdapter(adapterItems);

        return root;
    }
}