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
public class SitesFragment extends Fragment {


    public SitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.word_list, container, false);

        Slot slots[]= new Slot[]{
                new Slot("Purana Quila", "I love it", R.drawable.purana_qila),
                new Slot("Amar Jawan Jyoti", "It is the place to pay the respect to dead soldiers every year.", R.drawable.amar_jawan_jyoti),
                new Slot("Agrasen Ki Baoli", "I love it", R.drawable.agrasen_ki_baoli),
                new Slot("Jama Masjid", "A Mosque where a big crowd gathers in Eid for Namaz(Worship Allah) and a beauty to visit.", R.drawable.jama_masjid),
                new Slot("Atgha khan Tomb", "It is memorable", R.drawable.atgha_khan_tomb),
                new Slot("Red Fort", "It has great history about being red. It' said that Freedom fighters hid there to " +
                        "save themselves from British government.", R.drawable.red_fort),
                new Slot("Qutub Minar", "It was damaged after a while due to an earthquake and its size reduced to 1/3rd of its original." +
                        "Otherwise this would have been the tallest monument in the world.", R.drawable.qutub_minar),
                new Slot("Alai Darwaja", "I love it", R.drawable.alai_darwaja),
                new Slot("India Gate", "It is a beautiful place to visit.", R.drawable.india_gate),
        };

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        SlotAdapter adapter = new SlotAdapter(slots, R.color.category_sites);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
