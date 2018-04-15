package com.udemy.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.udemy.carros.R;
import com.udemy.carros.entities.Car;
import com.udemy.carros.listeners.OnListClickInteractionListener;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextCarModel;
    private TextView mTextViewDetails;
    private ImageView mImgCarPicture;


    public CarViewHolder(View itemView) {
        super(itemView);

        this.mTextCarModel = (TextView) itemView.findViewById(R.id.text_car_model);
        this.mImgCarPicture = (ImageView) itemView.findViewById(R.id.img_car_pic);
        this.mTextViewDetails = (TextView) itemView.findViewById(R.id.img_car_text_view_details);

    }


    public void bindData(final Car car, final OnListClickInteractionListener mOnListClickInteractionListener) {

        this.mTextCarModel.setText(car.model);
        this.mImgCarPicture.setImageDrawable(car.picture);

        this.mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // change activity
                mOnListClickInteractionListener.onClick(car.id);

            }
        });

    }
}
