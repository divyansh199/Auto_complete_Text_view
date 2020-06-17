package com.example.auto_complete_text_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<CountryItem> countryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillCountryList();
        AutoCompleteTextView editText = findViewById(R.id.actv);
        AutoCompleteCountryAdapter adapter = new  AutoCompleteCountryAdapter(this,countryList);
        editText.setAdapter(adapter);
    }

    private void fillCountryList(){
        countryList= new ArrayList<>();

        countryList.add(new CountryItem("India",R.drawable.download));
        countryList.add(new CountryItem("America",R.drawable.download1));
        countryList.add(new CountryItem("Japan",R.drawable.download2));
        countryList.add(new CountryItem("Russia",R.drawable.download3));
    }


}


