package com.iboddington.demoappthree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonClick(View view) {

        EditText nameField = (EditText) findViewById(R.id.nameField);
        String nameValue = nameField.getText().toString();
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setImageResource(R.drawable.monkey);

        Toast.makeText(MainActivity.this, "Hi " + nameValue + "!", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
