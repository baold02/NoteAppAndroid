package com.example.noteapp.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.noteapp.R;

public class AddNoteActivity extends AppCompatActivity {
     private EditText edtTitle,edtContent;
     private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        initUi();
    }

    private void initUi(){
        edtTitle = findViewById(R.id.edt_title);
        edtContent = findViewById(R.id.edt_content);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    addNote();
            }
        });
    }

    private void addNote() {
        String strTitle = edtTitle.getText().toString().trim();
        String strContent = edtTitle.getText().toString().trim();
    }
}