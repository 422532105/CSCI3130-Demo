package com.example.acme.csci3130_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.acme.csci3130_demo.TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendText(View view){
        Intent intent = new Intent(this, DisplayTextActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText3);
        String text = editText.getText().toString();
        intent.putExtra(EXTRA_TEXT, text);
        startActivity(intent);
    }
}
