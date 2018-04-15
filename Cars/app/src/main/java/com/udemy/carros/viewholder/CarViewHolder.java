package com.udemy.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.udemy.carros.R;
import com.udemy.carros.entities.Car;
import com.udemy.carros.listeners.OnListClickInteractionListener;

public class CarViewHolder extends RecyclerView.ViewHolder{

    private TextView mTextModel;

    public CarViewHolder(View itemView) {
        super(itemView);

        this.mTextModel = (TextView) itemView.findViewById(R.id.text_model);
    }


    public void bindData(final Car car, final OnListClickInteractionListener mOnListClickInteractionListener) {

        this.mTextModel.setText(car.model);
        this.mTextModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // change activity
                mOnListClickInteractionListener.onClick(car.id);

            }
        });

    }
}
