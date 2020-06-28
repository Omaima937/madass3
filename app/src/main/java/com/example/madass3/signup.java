package com.example.madass3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;


public class signup extends AppCompatActivity {
    EditText pname;
    EditText pemail;

    Button cc;
    Button signin;
    AwesomeValidation awesomeValidation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        pname = (EditText) findViewById(R.id.password);
        pemail = (EditText) findViewById(R.id.email);
        signin=(Button)findViewById(R.id.signin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(signup.this, MainActivity.class);
                startActivity(i2);
            }
        });


        cc = (Button) findViewById(R.id.reg);
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        View editText;
        awesomeValidation.addValidation(this, R.id.name, RegexTemplate.NOT_EMPTY, R.string.invalid_name);

        awesomeValidation.addValidation(this, R.id.email, Patterns.EMAIL_ADDRESS, R.string.invalid_email);
        awesomeValidation.addValidation(this, R.id.password, RegexTemplate.NOT_EMPTY, R.string.invalid_password);

        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (awesomeValidation.validate()) {
                    Toast.makeText(getApplicationContext(), "Signup Successful", Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(getApplicationContext(), "Signup Failed", Toast.LENGTH_SHORT).show();
                }
            }


        });

    }
    }





