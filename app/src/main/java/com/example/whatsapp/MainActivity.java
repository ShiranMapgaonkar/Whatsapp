package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtusername, edtemail, edtpw;
    private Button btnsignup, btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtusername = findViewById(R.id.edtusername);
        edtemail = findViewById(R.id.edtemail);
        edtpw = findViewById(R.id.edtpw);

        btnsignup= findViewById(R.id.btnsignup);
        btnlogin = findViewById(R.id.btnlogin);

        btnsignup.setOnClickListener(this);
        btnlogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnsignup:

                final ParseUser appUser = new ParseUser();
                appUser.setUsername(edtusername.getText().toString());
                appUser.setEmail(edtemail.getText().toString());
                appUser.setPassword(edtpw.getText().toString());

                appUser.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e == null) {
                            Toast.makeText(MainActivity.this,"Signed up succesfully",Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();

                        }
                    }
                });

                break;

            case R.id.btnlogin:
                break;
        }
    }
}