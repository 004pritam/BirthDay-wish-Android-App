package com.example.birthdayofshivani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.text.LineBreaker;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    //TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //textView = findViewById(R.id.textView2);
        //textView.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
    }
    public void toThird(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }
}