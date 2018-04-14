package com.udemy.carros.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.udemy.carros.R;
import com.udemy.carros.helpers.adapters.CarListAdapter;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 1 - Get Recycler view
        this.mViewHolder.recyclerCars = (RecyclerView) this.findViewById(R.id.recycler_cars);

        // 2 - Define adapter between Recycler view and items list
        CarListAdapter carListAdapter = new CarListAdapter();
        this.mViewHolder.recyclerCars.setAdapter(carListAdapter);

        // 3 - Define Recycler View Layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);
    }

    private static class ViewHolder {

        RecyclerView recyclerCars;

    }
}
