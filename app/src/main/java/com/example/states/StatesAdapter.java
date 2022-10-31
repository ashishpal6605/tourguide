package com.example.states;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StatesAdapter extends RecyclerView.Adapter<StatesAdapter.statesViewHolder>{

    ArrayList<Country> country = new ArrayList<>();

    public static void setDataToAdapter(ArrayList<Country> country) {
    }

    class statesViewHolder extends RecyclerView.ViewHolder {
        TextView stateName;
        public statesViewHolder(@NonNull View itemView) {
            super(itemView);
            stateName = itemView.findViewById(R.id.view2);
        }
        public void bindDataToUI(Country stateName) {
            this.stateName.setText(stateName.getName());
        }
    }
    @NonNull
    @Override
    public statesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycleview_row, parent, false);
        return new statesViewHolder(view) ;
    }
    @Override
    public void onBindViewHolder(@NonNull statesViewHolder holder, int position) {
        Country stateName = this.country.get(position);
        holder.bindDataToUI(stateName);
    }
    public void SetDataAdapter(ArrayList<Country> country){
        this.country= country;
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount()
    {
        return country.size();
    }
}
