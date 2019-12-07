package com.example.supershop.ui.vegetables_and_fruits;

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

public class VegetablesAndFruitsFragent extends Fragment {

    RecyclerView recyclerView;
    AdapterItems adapterItems;
    List<Items> itemsList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_vegetables_and_fruits, container, false);

        itemsList = new ArrayList<>();
        recyclerView = root.findViewById(R.id.recyclerView_vegetables_and_fruits);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        itemsList.add(new Items(
                R.drawable.icons8_tomato_64px,
                "Tomato", "Red beautiful tomato", "$2.00"
        ));
        itemsList.add(new Items(
                R.drawable.icons8_broccoli_64px,
                "Broccoli", "Healthy broccoli", "$2.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_cabbage_64px,
                "Cabbage", "Fresh and large cabbage", "$2.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_carrot_64px,
                "Carrot", "Sweet and healthy carrots", "$2.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_pumpkin_64px,
                "Pumpkin", "A big pumpkin", "$2.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_eggplant_64px,
                "Eggplat", "Mmmmm... healthy", "$2.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_mushroom_64px,
                "Mushroom", "Tasty mushrooms", "$2.00"
        ));


        itemsList.add(new Items(
                R.drawable.icons8_mushroom_64px,
                "Farabi", "Tasty mushrooms", "$2.00"
        ));

        adapterItems = new AdapterItems(getActivity(), itemsList);
        recyclerView.setAdapter(adapterItems);

        return root;
    }
}