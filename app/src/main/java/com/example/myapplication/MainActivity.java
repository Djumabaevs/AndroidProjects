package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.model.Question;

public class MainActivity extends AppCompatActivity {

    private final Question[] questionBank = new Question[]{
            new Question(R.string.question_declaration, true),
            new Question(R.string.question_foo, false),
            new Question(R.string.question_boo, false)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}