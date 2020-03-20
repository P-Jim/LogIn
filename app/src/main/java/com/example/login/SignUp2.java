package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
        textView = (TextView) findViewById(R.id.TextView);
        Bundle bundle = getIntent().getExtras();
        String Input = bundle.getString("name");
        textView.setText("Hi " + Input + "!");
    }

    public void clickFunction (View view){
        Bundle bundle = getIntent().getExtras();
        String Input = bundle.getString("name");
        EditText myText = (EditText) findViewById(R.id.editText);
        String str = myText.getText().toString();
        boolean Validity = validatePhoneNumber(str);
        if (Validity){
            goToNext(str, Input);
        }
        else {
            Toast.makeText(SignUp2.this, "Please input a phone number", Toast.LENGTH_LONG).show();
            return;
        }
    }

    public void goToNext (String phone, String name){
        Intent intent = new Intent(this, SignUp3.class);
        intent.putExtra("phone", phone);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    private static boolean validatePhoneNumber(String phoneNo) {
        //validate phone numbers of format "1234567890"
        if (phoneNo.matches("\\d{10}")) return true;
            //validating phone number with -, . or spaces
        else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
            //validating phone number with extension length from 3 to 5
        else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
            //validating phone number where area code is in braces ()
        else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
            //return false if nothing matches the input
        else return false;
    }
}
