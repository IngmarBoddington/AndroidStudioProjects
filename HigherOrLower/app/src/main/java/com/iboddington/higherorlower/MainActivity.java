package com.iboddington.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static Integer theNumber;

    public void guessAction(View view) {

        if (theNumber == null) {
            this.resetNumber();
        }

        EditText numberField = (EditText) findViewById(R.id.numberField);
        Integer guessNumber = Integer.parseInt(numberField.getText().toString());
        System.out.println("Guess is " + guessNumber.toString());

        if (guessNumber == this.theNumber) {
            Toast.makeText(MainActivity.this, "Well Done! Try Again :)", Toast.LENGTH_LONG).show();
            System.out.println("Win!");
            this.resetNumber();
        } else if (guessNumber > this.theNumber) {
            Toast.makeText(MainActivity.this, "Too High!", Toast.LENGTH_SHORT).show();
        } else if (guessNumber < this.theNumber) {
            Toast.makeText(MainActivity.this, "Too Low!", Toast.LENGTH_SHORT).show();
        }
            
    }

    private void resetNumber() {
        Random generator = new Random();
        this.theNumber = generator.nextInt(19) + 1;
        System.out.println("Reset the Number to" + theNumber.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
