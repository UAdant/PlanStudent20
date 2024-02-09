package com.example.studyplan20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Кнопка для переходу до активності створення розкладу
        Button scheduleButton = findViewById(R.id.scheduleButton);
        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MySchedule.class);
                startActivity(intent);
            }
        });

        // Кнопка для переходу до активності відстеження прогресу
        Button progressButton = findViewById(R.id.progressButton);
        progressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Progress.class);
                startActivity(intent);
            }
        });

        // Кнопка для переходу до активності обліку екзаменаційних сесій
        Button examButton = findViewById(R.id.examButton);
        examButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExamActivity.class);
                startActivity(intent);
            }
        });

        // Кнопка для переходу до активності майбутніх іспитів
        Button futureExamsButton = findViewById(R.id.futureExamsButton);
        futureExamsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FutureExamsActivity.class);
                startActivity(intent);
            }
        });

        // Кнопка для переходу до активності введення та відстеження оцінок
        Button gradesButton = findViewById(R.id.gradesButton);
        gradesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Grades.class);
                startActivity(intent);
            }
        });
    }
}
