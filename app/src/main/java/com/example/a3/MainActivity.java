package com.example.a3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login (View View) {
        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.usernameEditText);
        Log.i("Info", "Button Pressed");
        Log.i("Username", usernameEditText.getText().toString());
        Log.i("Password",passwordEditText.getText().toString());
        Toast.makeText(this,"Login successfull " + usernameEditText.getText().toString(),
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}