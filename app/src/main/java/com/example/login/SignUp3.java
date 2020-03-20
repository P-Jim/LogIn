package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up3);
    }
    public void clickFunction (View view){
        Bundle bundle = getIntent().getExtras();
        String Input = bundle.getString("name");
        EditText myText = (EditText) findViewById(R.id.editText);
        String str = myText.getText().toString();
        //check if str is a valid code
        //if (Validity){
            goToNext(str, Input);
        //}
        //else {
        //    Toast.makeText(SignUp3.this, "Please input a valid code", Toast.LENGTH_LONG).show();
        //   return;
        //}
    }

    public void goToNext (String phone, String name){
        Intent intent = new Intent(this, SignUp3.class);
        intent.putExtra("phone", phone);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
