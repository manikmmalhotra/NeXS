package com.example.nexs.Adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nexs.R;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderHolder> {

    Context context;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public SliderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.particular_slider,parent,false);
        return new SliderHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    class SliderHolder extends RecyclerView.ViewHolder{

        public SliderHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
