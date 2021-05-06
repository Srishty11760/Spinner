package com.example.q4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner s;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = findViewById(R.id.spinner);
        img = findViewById(R.id.imageView);
        ArrayAdapter<CharSequence>
                ad = ArrayAdapter.createFromResource(this, R.array.flowerimages, android.R.layout.simple_dropdown_item_1line);
        s.setAdapter(ad);
        s.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0)
            img.setImageResource(R.drawable.lily);
        else if (position == 1)
            img.setImageResource(R.drawable.lotus);
        else if (position == 2)
            img.setImageResource(R.drawable.tulip);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}