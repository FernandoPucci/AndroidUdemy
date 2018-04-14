package com.udemy.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.udemy.carros.R;

public class CarViewHolder extends RecyclerView.ViewHolder{

    private TextView mTextModel;

    public CarViewHolder(View itemView) {
        super(itemView);

        this.mTextModel = (TextView) itemView.findViewById(R.id.text_model);
    }


}
