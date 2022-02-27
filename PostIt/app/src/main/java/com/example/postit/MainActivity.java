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

//TODO: Implement the AdapterNote Interface, that was declared in the AdapterNote class to override the method inside it.
public class MainActivity extends AppCompatActivity implements AdapterNote.ItemClickListener{


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

        /*
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
*/

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapterNote = new AdapterNote(this,nota);
        recyclerView.setAdapter(adapterNote);


        //TODO: Initialize the interface listener from the AdapterNote in onCreate, to get the context for the listener, so that it won't return null in the AdapterNote class
        adapterNote.addItemClick(this);



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
                {
                  Intent intent = new Intent(MainActivity.this, EditNote.class);
                  startActivity(intent);
                  return true;
                }
            default:
                return super.onOptionsItemSelected(item);
        }
        
    }


    //TODO: Added the Toast and intent code here, so it can be handled from here. after overriding the method inside the interface.
    //Please note: When you implement an interface in a fragment or activity, you are forced to implement the method from the interface
    //to use it, if the Interface has more than one method, you must implement everything, it is like a contract from business,
    // just like you must override the OnCreate method in your activity.
    //If, you have more questions concerning this, my dm is open anytime.
    @Override
    public void onItemClick(int position) {
        //Show Item Position
        Toast.makeText(this, "position"+position, Toast.LENGTH_SHORT).show();

        //Start NoteActivity
        Intent intent = new Intent(this , NoteActivity.class);
        startActivity(intent);
    }
}
