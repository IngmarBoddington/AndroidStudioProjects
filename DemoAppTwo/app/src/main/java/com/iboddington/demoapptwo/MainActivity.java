package com.iboddington.demoapptwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view) {

        EditText usernameField = (EditText) findViewById(R.id.username);
        EditText passwordField = (EditText) findViewById(R.id.password);

        String usernameValue = usernameField.getText().toString();
        String passwordValue = passwordField.getText().toString();

        Toast.makeText(MainActivity.this, "Hi " + usernameValue + "!", Toast.LENGTH_SHORT).show();

        Log.i("Info", "Username = " + usernameValue + ", Password = " + passwordValue);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
