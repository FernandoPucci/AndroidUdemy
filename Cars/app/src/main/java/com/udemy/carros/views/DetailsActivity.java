package com.udemy.carros.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.udemy.carros.R;
import com.udemy.carros.entities.Car;
import com.udemy.carros.helpers.constants.CarsConstants;
import com.udemy.carros.helpers.mock.CarMock;

import java.text.NumberFormat;


public class DetailsActivity extends AppCompatActivity {


    private DetailsViewHolder mDetailsViewHolder = new DetailsViewHolder();
    private CarMock mCarMock;

    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Adjust icon
        getSupportActionBar().setDisplayShowTitleEnabled(false); // don't show title in action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true); // show icon
        getSupportActionBar().setIcon(R.mipmap.ic_launcher); // icon to show

        this.mCarMock = new CarMock(this);

        this.mDetailsViewHolder.textModel = (TextView) this.findViewById(R.id.text_car_model);
        this.mDetailsViewHolder.textHorsePower = (TextView) this.findViewById(R.id.text_horse_power);
        this.mDetailsViewHolder.textPrice = (TextView) this.findViewById(R.id.text_price);
        this.mDetailsViewHolder.textManufacturer = (TextView) this.findViewById(R.id.text_manufacturer);

        this.mDetailsViewHolder.imgCarPicture = (ImageView) this.findViewById(R.id.img_car_pic);


        this.getDataFromActivity();
        this.setData();

    }

    private void setData() {
        this.mDetailsViewHolder.textModel.setText(this.mCar.model);
        this.mDetailsViewHolder.textHorsePower.setText(String.valueOf(this.mCar.horsePower));
        this.mDetailsViewHolder.textPrice.setText(decimalCurrencyFormatter(this.mCar.price));

        this.mDetailsViewHolder.imgCarPicture.setImageDrawable(this.mCar.picture);
    }

    // Load Data coming from another activity, from Bundle amd set
    private void getDataFromActivity() {

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            this.mCar = this.mCarMock.get(extras.getInt(CarsConstants.CAR_ID));
        }
    }

    private String decimalCurrencyFormatter(double value) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        return numberFormat.format(value);

    }

    private static class DetailsViewHolder {

        TextView textModel;
        TextView textHorsePower;
        TextView textPrice;
        TextView textManufacturer;

        ImageView imgCarPicture;


    }

}