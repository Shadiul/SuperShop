package com.example.supershop.ui.meat_and_fish;

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

public class MeatAndFishFragment extends Fragment {

    RecyclerView recyclerView;
    AdapterItems adapterItems;
    List<Items> itemsList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_meat_and_fish, container, false);

        itemsList = new ArrayList<>();
        recyclerView = root.findViewById(R.id.recyclerView_meat_and_fish);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        itemsList.add(new Items(
                R.drawable.icons8_steak_64px,
                "Steak", "Fresh cow steak", "$20.00"
        ));
        itemsList.add(new Items(
                R.drawable.icons8_mutton_64px,
                "Mutton", "Fresh and healthy mutton", "$22.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_chicken_64px,
                "Chicken", "Fresh native chicken", "$3.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_hilsha_fish_64px,
                "Hilsha Fish", "Large hilsa fish from padma", "$20.00"
        ));

        itemsList.add(new Items(
                R.drawable.icons8_prawn_64px,
                "Prawn", "Large sized prawns", "$2.00"
        ));

        adapterItems = new AdapterItems(getActivity(), itemsList);
        recyclerView.setAdapter(adapterItems);

        return root;
    }
}