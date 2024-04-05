package com.mirea.kimpm.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SecondActivity extends AppCompatActivity {
    static private final int MyNumber = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final String text = String.format("КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ " +
                        "СОСТАВЛЯЕТ %d, а текущее время %s",
                MyNumber * MyNumber, getIntent().getStringExtra("formatted-date"));
        ((TextView)findViewById(R.id.text1)).setText(text);
    }
}