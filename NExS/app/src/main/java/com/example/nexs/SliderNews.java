package com.example.nexs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.nexs.Adpter.SliderAdapter;

public class SliderNews extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_news);

        recyclerView = findViewById(R.id.sliderlist);

        recyclerView.setHasFixedSize(true);
        SliderAdapter sliderAdapter = new SliderAdapter(this);
        recyclerView.setAdapter(sliderAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    }
}