package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void clickFunction (View view){
        EditText myText = (EditText) findViewById(R.id.editText);
        String str = myText.getText().toString();
        boolean Validity = str.matches("^.*[^a-zA-Z ]{2,20}.*$");
        if (Validity){
            goToNext(str);
        }
        else {
            Toast.makeText(SignUp.this, "Invalid input, please only input 20 valid characters", Toast.LENGTH_LONG).show();
            return;
        }
    }

    public void goToNext (String s){
        Intent intent = new Intent(this, SignUp2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}
