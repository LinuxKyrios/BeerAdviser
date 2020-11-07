package com.linuxkyrios.doradcapiwny;
import java.util.ArrayList;
import java.util.List;

//Java class with beers list for displaying in main activity
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        //Using switch instead of eCorrected typo commentlse if ladder
        switch (color) {
            case "bursztynowe":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                break;
            case "jasne":
                brands.add("Pilzner");
                brands.add("Pale Lager");
                brands.add("Mild Lager");
                break;
            case "brązowe":
                brands.add("Koźlak");
                brands.add("Dunkelweizen");
                break;
            case "ciemne":
                brands.add("Porter Bałtycki");
                brands.add("Stout");
                brands.add("Russian Stout");
                break;
        }
        return brands;
    }
}