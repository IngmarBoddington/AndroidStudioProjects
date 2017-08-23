package com.iboddington.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertAction(View view) {

        EditText numbersTextField = (EditText) findViewById(R.id.numbersTextField);
        Double dollars = Double.parseDouble(numbersTextField.getText().toString());

        Double pounds = dollars / 1.3;

        Toast.makeText(MainActivity.this, "£" + String.format("%.2f", pounds), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
