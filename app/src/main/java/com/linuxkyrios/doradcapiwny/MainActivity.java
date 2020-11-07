package com.linuxkyrios.doradcapiwny;

import android.app.Activity; //imported Activity class
import android.os.Bundle; //imported Bundle class
import android.view.View; //imported View class
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){
        //Downloads the TextView component reference
        TextView brands = (TextView) findViewById(R.id.brands);
        // Downloads the Spinner component reference
        Spinner color = (Spinner) findViewById(R.id.color);
        // Downloads selected value from Spinner component
        String beerType = String.valueOf(color.getSelectedItem());
        // Displaying selected value
        brands.setText(beerType);

    }
}