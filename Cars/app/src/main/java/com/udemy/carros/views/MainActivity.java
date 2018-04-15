package com.udemy.carros.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.udemy.carros.R;
import com.udemy.carros.helpers.adapters.CarListAdapter;
import com.udemy.carros.helpers.constants.CarsConstants;
import com.udemy.carros.helpers.mock.CarMock;
import com.udemy.carros.listeners.OnListClickInteractionListener;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adjust icon
        getSupportActionBar().setDisplayShowTitleEnabled(false); // don't show title in action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true); // show icon
        getSupportActionBar().setIcon(R.mipmap.ic_launcher); // icon to show

        this.mContext = this;


        // Load mock
        CarMock carMock = new CarMock(this);


        // 1 - Get Recycler view
        this.mViewHolder.recyclerCars = (RecyclerView) this.findViewById(R.id.recycler_cars);


        OnListClickInteractionListener listener = new OnListClickInteractionListener() {
            @Override
            public void onClick(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(CarsConstants.CAR_ID, id);

                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        };

        // 2 - Define adapter between Recycler view and items list
        CarListAdapter carListAdapter = new CarListAdapter(carMock.getListCars(), listener);
        this.mViewHolder.recyclerCars.setAdapter(carListAdapter);

        // 3 - Define Recycler View Layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);
    }

    private static class ViewHolder {

        RecyclerView recyclerCars;

    }
}
