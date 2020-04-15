package com.example.oreillypractise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.main_firstLesson)
    Button firstLessonBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        firstLessonBtn.setOnClickListener(v -> {
            Intent firstLessonIntent = new Intent(this, FirstActivity.class);
            startActivity(firstLessonIntent);
        });
    }


}
