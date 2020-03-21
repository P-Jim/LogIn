package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickFunction (View view){
        goToActivityLogin();
    }
    public void clickFunction2 (View view){
        goToActivitySignUp();
    }
    public void goToActivityLogin (){
        //Intent intent = new Intent(this, SignIn.class);
        Intent intent = new Intent(this, AccountPage.class);
        startActivity(intent);
    }
    public void goToActivitySignUp (){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}
