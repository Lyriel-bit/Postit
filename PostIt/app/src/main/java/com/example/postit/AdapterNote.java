package com.example.postit;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterNote extends RecyclerView.Adapter<AdapterNote.ViewHolder> {


    ArrayList<Nota> nota;
    Context context;

    //TODO: Declare your Interface here, so that you can use it to get click events in AdapterNote.
    private ItemClickListener mItemClick;


    //TODO: Add an ItemClickListener to get the context of the activity you want to use the interface from, it must be a public method.
    public void addItemClick(ItemClickListener listener) {
        mItemClick = listener;
    }


    public AdapterNote(Context context, ArrayList<Nota> nota) {
        this.nota = nota;
        this.context = context;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.id_itemList);
            //TODO: Initialize on click listener to the TextView, not the itemView.
            title.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();

           //TODO: Check the Id for the TextView from the view, before adding click event.
            if (view.getId() == R.id.id_itemList) {
                //TODO: Check if the listener is null, before using it to prevent NullPointerException
                if (mItemClick != null) {

                    //TODO: get click event using the interface you declared below in the AdapterNote class.
                    mItemClick.onItemClick(position);
                }
            }
        }


    }


    @NonNull
    @Override
    public AdapterNote.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;

    }


    @Override
    public void onBindViewHolder(@NonNull AdapterNote.ViewHolder holder, int position) {

        holder.title.setText(nota.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return nota.size();
    }

    //TODO: Declare your interface in your AdapterNote class, to get click events.
    public interface ItemClickListener {
        //TODO: Add a method to get click events.
        void onItemClick(int position);
    }
}
