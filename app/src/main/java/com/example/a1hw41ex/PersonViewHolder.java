package com.example.a1hw41ex;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder  {

    private TextView     person;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        person=itemView.findViewById(R.id.tv_person);
    }
    public void bind(String name){
        person.setText(name);
    }
}
