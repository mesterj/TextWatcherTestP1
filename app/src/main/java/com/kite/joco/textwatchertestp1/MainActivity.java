package com.kite.joco.textwatchertestp1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    EditText etChars,etChars2;
    TextView tvNums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etChars = (EditText) findViewById(R.id.etChars);
        etChars2 = (EditText) findViewById(R.id.etChars2);

        tvNums = (TextView) findViewById(R.id.tvNums);
        etChars.addTextChangedListener(this);
//        etChars2.addTextChangedListener(this);

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            int s = etChars.getText().length() ;
            tvNums.setText("A szöveg hossza: " + s);
            etChars2.setText(etChars.getText());
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
