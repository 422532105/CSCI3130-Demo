package com.example.acme.csci3130_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.acme.csci3130_demo.TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendText(View view){
        EditText editText = (EditText) findViewById(R.id.editText3);
        TextView textView1 = (TextView) findViewById(R.id.textView);
        String text = editText.getText().toString();
        textView1.setText(text);

    }
}
