package com.udemy.carros.helpers.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udemy.carros.R;
import com.udemy.carros.viewholder.CarViewHolder;

public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder> {


    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // get context and inflate layout
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View carView = inflater.inflate(R.layout.row_car_list, parent, false
        );

        return new CarViewHolder(carView);

    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return 0;
    }
}
