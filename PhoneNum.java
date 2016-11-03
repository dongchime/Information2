package com.chaeeun.information2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class PhoneNum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_num);
    }

    public void onClick_login(View v)
    {
        EditText text_pn = (EditText) findViewById(R.id.editText_pn);
        String pn = text_pn.getText().toString();

        Intent intent_01 = new Intent(getApplicationContext(), SubActivity.class);

        intent_01.putExtra("Phone Number", pn);

        startActivity(intent_01);
    }
}

