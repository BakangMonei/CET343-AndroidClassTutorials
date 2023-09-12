package com.neizatheedev.classtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Monday September 2023
 * @Time: 10:09 PM
 */
public class MainActivity extends AppCompatActivity {

    private EditText emailInput, passwordInput;
    private CheckBox rememberMe;
    private MaterialButton loginBtn;
    private ImageView facebookIcon, githubIcon, twitterIcon;
    private TextView forgotPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailInput = (EditText) findViewById(R.id.emailInput);
        passwordInput = (EditText) findViewById(R.id.passwordInput);

        rememberMe = (CheckBox) findViewById(R.id.rememberMe);

        loginBtn = (MaterialButton) findViewById(R.id.loginBtn);

        facebookIcon = (ImageView) findViewById(R.id.facebookIcon);
        githubIcon = (ImageView) findViewById(R.id.githubIcon);
        twitterIcon = (ImageView) findViewById(R.id.twitterIcon);

        forgotPass = (TextView) findViewById(R.id.forgotPass);

    }
}