package com.linuxkyrios.doradcapiwny;

import android.app.Activity; //imported Activity class
import android.os.Bundle; //imported Bundle class
import android.view.View; //imported View class
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {
    //Assigning new BeerExpert class object to the expert variable as private class field
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        // Downloading recommendation from BeerExpert class
        List<String> brandsList = expert.getBrands(beerType);
        //Creating string for displaying every type of beer in the new line
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
        // Displaying selected types of beer
        brands.setText(brandsFormatted);
    }
}