package com.example.tourguide;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.word_list, container, false);

        Slot slots[]= new Slot[]{
                new Slot("Indian Accent", "As you can see this picture says it all.", R.drawable.indian_accent),
                new Slot("Farzi Cafe", "All types of fast foods.", R.drawable.farzi_cafe),
                new Slot("Bukhara", "Veg and Non-veg hub.", R.drawable.bukhara),
                new Slot("Olive Bar", "It's surrounding where people eat is very beautiful and besides they have best food.", R.drawable.olive_bar),
                new Slot("Balluchi", "This is also a good restaurant to choose based on their 3500 menus and large fame.", R.drawable.balluchi),
                new Slot("Naivedyam", "Mostly South indian is served here but a great Veg place to eat.", R.drawable.naivedyam),
                new Slot("Moti Mahal", "They serve the most delicious food.", R.drawable.moti_mahal),
                new Slot("Berco", "Go and see. There are no words describe to describe it's beauty.", R.drawable.berco)
        };

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        SlotAdapter adapter = new SlotAdapter(slots, R.color.category_restaurants);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
        recyclerView.setAdapter(adapter);
        return rootView;
    }

}
