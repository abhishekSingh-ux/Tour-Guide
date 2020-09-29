package com.example.tourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.word_list, container, false);

        Slot slots[]= new Slot[]{
                new Slot("Red Fort", "It has great history about being red. It' said that Freedom fighters hid there to " + "save themselves from British government.", R.drawable.red_fort),
                new Slot("Qutub Minar", "It was damaged after a while due to an earthquake and its size reduced to 1/3rd of its original." +
                        "Otherwise this would have been the tallest monument in the world. ", R.drawable.qutub_minar),
                new Slot("Humayun Tomb", "Humayun was a great muslim Emperor. This tomb was built in his memory.", R.drawable.humayun_tomb),
                new Slot("India Gate", "It is a beautiful place to visit. ", R.drawable.india_gate),
                new Slot("Lotus Temple", "The whole temple built like a lotus was a fantastic idea. ", R.drawable.lotus_temple),
                new Slot("Rastrapati Bhawan", "The office of president of India.", R.drawable.rashtrapati_bhavan),
                new Slot("Laxminarayan Temple", "It is a memorable and wonderful place to visit", R.drawable.laxminarayan_temple),
                new Slot("Chattarpur Temple", "This reminds me of Jagannath Themple in Puri, Odissa. Design very much resembels.", R.drawable.chattarpur_temple),
                new Slot("Akshardham", "I just love this temple and everything about it.", R.drawable.akshardham)
        };


        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        SlotAdapter adapter = new SlotAdapter(slots, R.color.category_attractions);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
