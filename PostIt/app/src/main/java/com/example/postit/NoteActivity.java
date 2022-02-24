package com.example.postit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NoteActivity extends AppCompatActivity {



    TextView title,text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);


        title = findViewById(R.id.id_titleTxtView);
        text = findViewById(R.id.id_noteTextView);




    }
}