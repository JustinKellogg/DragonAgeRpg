package com.example.DragonAgeRpg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Justin on 7/29/2014.
 */
public class DisplayMessageActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(HelloWorld.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        setContentView(textView);
        //todo: handle possibility of null pointer exception
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}