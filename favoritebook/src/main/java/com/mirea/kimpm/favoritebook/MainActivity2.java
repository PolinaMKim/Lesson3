package com.mirea.kimpm.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void Add_book(View view) {
        EditText editText = findViewById(R.id.editText2);
        String text = "Название вашей любимой книги: " + editText.getText().toString();
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_BOOK, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}