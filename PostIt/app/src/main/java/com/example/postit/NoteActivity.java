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
btnSend = findViewById(R.id.id_buttonsend);

        btnSend.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mytitle = title.getText().toString();
                String mynote = textNote.getText().toString();

                Nota nota = new Nota();
                nota.setTitle(mytitle);
                nota.setNota(mynote);

                SharedPref.save(getApplicationContext(),nota);

                Intent intent= new Intent(EditNote.this, MainActivity.class);
                startActivity(intent);

            }
        }));



    }
}
