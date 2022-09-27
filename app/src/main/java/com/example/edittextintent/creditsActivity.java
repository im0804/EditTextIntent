package com.example.edittextintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class creditsActivity extends AppCompatActivity {

    TextView tv;
    Intent gi;
    double result;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        gi = getIntent();
        result = gi.getDoubleExtra("n",-128349.0);
        tv = findViewById(R.id.textView);
        String st = "coder: Inbar Menahem,16 y/o." + "\n" + "תודה לאלברט התותח שלימד אותנו הכל וגילה לנו את כל התשובות.";
        tv.setText( st + "" + "\n" + "result = "+ result);
    }

    public void close(View view) {
        finish();
    }
}