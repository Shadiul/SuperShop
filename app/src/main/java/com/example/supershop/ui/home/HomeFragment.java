package com.example.supershop.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.example.supershop.AdapterCategories;
import com.example.supershop.AdapterItems;
import com.example.supershop.Categories;
import com.example.supershop.Items;
import com.example.supershop.MainActivity;
import com.example.supershop.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    GridView gridView;
    AdapterCategories adapterCategories;
    List<Categories> categoriesList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        categoriesList = new ArrayList<>();
        gridView = root.findViewById(R.id.gridView_categories);

        for (int i = 0; i < 4; i++) {
            categoriesList.add(new Categories(
                    R.drawable.icons8_broccoli_96px, "Vegetables and Fruits", null
            ));

            categoriesList.add(new Categories(
                    R.drawable.icons8_chicken_96px_1, "Meats and Fishes", null
            ));

            categoriesList.add(new Categories(
                    R.drawable.icons8_grocery_bag_96px, "Grocery Items", null
            ));
        }

        adapterCategories = new AdapterCategories(getActivity(), categoriesList);
        gridView.setAdapter(adapterCategories);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String category_name = categoriesList.get(position).getCategory();

                if (category_name.equals("Vegetables and Fruits")) {
                    Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.nav_vegetable_and_fruit);
                    Toast t = Toast.makeText(getActivity(), "Welcome to Vegetable and Fruits category", Toast.LENGTH_LONG);
                    t.show();

                } else if (category_name.equals("Meats and Fishes")) {
                    Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.nav_meat_and_fish);
                    Toast t = Toast.makeText(getActivity(), "Welcome to Meats and Fishes category", Toast.LENGTH_LONG);
                    t.show();
                } else if (category_name.equals("Grocery Items")) {
                    Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.nav_grocery_items);
                    Toast t = Toast.makeText(getActivity(), "Welcome to Grocery items category", Toast.LENGTH_LONG);
                    t.show();
                }


            }
        });

        return root;
    }
}