package com.hackathon.droncall;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class ReminderCard extends RecyclerView.Adapter<RecyclerViewHolder> {

    private Random random;

    public ReminderCard(int seed) {
        this.random = new Random(seed);
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.getView().setText(String.valueOf(random.nextInt()));
    }

    @Override
    public int getItemCount() {
        return 100;
    }

}
