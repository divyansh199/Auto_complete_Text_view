package com.example.auto_complete_text_view;

public class CountryItem {
    private String countryName;
    private int flagImage;

    public CountryItem(String countryName, int flagImage)


    {
        this.countryName = countryName;
        this.flagImage= flagImage;

    }
public String getCountryName(){

        return countryName;

}

public int getFlagImage(){

        return  flagImage;
}

}
