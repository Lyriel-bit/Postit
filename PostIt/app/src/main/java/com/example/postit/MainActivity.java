package com.example.postit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView ;
    RecyclerView.LayoutManager layoutManager;
    AdapterNote adapterNote;
    ArrayList<Nota>nota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.id_recycler);



        /**
         * Popolo gli elementi della recyclerView
         */
        nota = new ArrayList<>();

        nota.add(new Nota("Prima nota","contenuto prima nota"));
        nota.add(new Nota("Seconda nota","contenuto seconda nota"));
        nota.add(new Nota("Terza nota","contenuto terza nota"));
        nota.add(new Nota("Quarta nota","contenuto seconda nota"));
        nota.add(new Nota("Prima nota","contenuto prima nota"));
        nota.add(new Nota("Seconda nota","contenuto seconda nota"));
        nota.add(new Nota("Prima nota","contenuto prima nota"));
        nota.add(new Nota("Seconda nota","contenuto seconda nota"));
        nota.add(new Nota("Prima nota","contenuto prima nota"));
        nota.add(new Nota("Seconda nota","contenuto seconda nota"));
        nota.add(new Nota("Terza nota","contenuto terza nota"));
        nota.add(new Nota("Quarta nota","contenuto seconda nota"));
        nota.add(new Nota("Prima nota","contenuto prima nota"));
        nota.add(new Nota("Seconda nota","contenuto seconda nota"));
        nota.add(new Nota("Prima nota","contenuto prima nota"));
        nota.add(new Nota("Seconda nota","contenuto seconda nota"));
        nota.add(new Nota("Prima nota","contenuto prima nota"));
        nota.add(new Nota("Seconda nota","contenuto seconda nota"));
        nota.add(new Nota("Terza nota","contenuto terza nota"));
        nota.add(new Nota("Quarta nota","contenuto seconda nota"));


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapterNote = new AdapterNote(this,nota);
        recyclerView.setAdapter(adapterNote);



    }



    /**
     * Gestione tasto menu add
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        
        switch (item.getItemId())
        {
            case R.id.id_add:
                Toast.makeText(getApplicationContext(), "hey this is my add", Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
        
    }


}