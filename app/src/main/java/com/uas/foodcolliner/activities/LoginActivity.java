package com.uas.foodcolliner.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uas.foodcolliner.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void postLogin(View view) {
        Intent intent = new Intent(this, SuccesLoginActivity.class);
        startActivity(intent);
    }
}
