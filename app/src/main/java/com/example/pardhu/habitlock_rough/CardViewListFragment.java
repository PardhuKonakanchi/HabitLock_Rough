package com.example.pardhu.habitlock_rough;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;

import java.util.ArrayList;

//This class is meant to create a list view that intakes the cardviews as a fragment to be loaded on the HomeScreen

public class CardViewListFragment extends Fragment {

    GraphView habitPlot;
    TextView habitName;
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Because we inflate in the layout rather than setting it in, we need to define the view for future functions
        View v = inflater.inflate(R.layout.graph_listview, container, false);

        habitPlot = (GraphView) v.findViewById(R.id.graph_picture);
        habitName = (TextView) v.findViewById(R.id.info_text);
        listView = (ListView)v.findViewById(R.id.list_view);


        //TODO: create functionality to direct to new habit if no current habits being tracked(empty list)
        ArrayList<Cards> list = new ArrayList<>();
        list.add(new Cards("Add graph points", "Add habit name", "Add any more info needed"));

        CustomListAdapter adapter = new CustomListAdapter(this.getContext(),R.layout.graph_listview, list);
        listView.setAdapter(adapter);

        return v;
    }
}
