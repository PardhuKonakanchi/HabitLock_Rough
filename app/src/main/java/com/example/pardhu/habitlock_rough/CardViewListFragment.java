package com.example.pardhu.habitlock_rough;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;

public class CardViewListFragment extends Fragment {

    GraphView HabitPlot;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.graph_listview, container, false);

        HabitPlot = (GraphView) v.findViewById(R.id.graph_picture);


        return v;
    }
}
