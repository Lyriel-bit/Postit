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


    public AdapterNote(Context context, ArrayList<Nota> nota)
    {
        this.nota = nota;
        this.context = context;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        TextView title;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.id_itemList);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Toast.makeText(itemView.getContext(), "position"+position, Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(context,NoteActivity.class);
            //context.startActivity(intent);
        }
    }




    @NonNull
    @Override
    public AdapterNote.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
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
}
