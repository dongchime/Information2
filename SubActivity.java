package com.chaeeun.information2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView textView_pn = (TextView) findViewById(R.id.textView_pn);

        Intent intent_01 = getIntent();

        String pn = intent_01.getStringExtra("Phone Number");

        textView_pn.setText(String.valueOf(pn));
    }

    public void onClick_back(View v)
    {
        finish();
    }
}
