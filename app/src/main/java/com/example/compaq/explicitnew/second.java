package com.example.compaq.explicitnew;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Compaq on 12/14/2015.
 */
public class second extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(getIntent().getExtras().getString("theText"));
    }
}
