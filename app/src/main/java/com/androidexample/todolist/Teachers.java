package com.androidexample.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Teachers extends RecyclerView.Adapter<Teachers.TViewHolder> {

    ArrayList<String> list;

    public Teachers(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public TViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater li= (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView= li.inflate(R.layout.card_list,parent,false);


        return new TViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TViewHolder tViewHolder, int i) {
                tViewHolder.tvElement.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }





    public class TViewHolder extends RecyclerView.ViewHolder{
        TextView tvElement;
        public TViewHolder(@NonNull View itemView) {

            super(itemView);
            tvElement=itemView.findViewById(R.id.tvElement);

        }
    }

}
