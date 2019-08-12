package com.example.atvpersonagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {
    Button entrar, sair;
    EditText txtlogin, txtpass;

    public static final String EXTRA_MESSAGE = "br.sp.senac.atvpersonagens.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);


        txtlogin = (EditText) findViewById(R.id.txtlogin);
        txtpass = (EditText) findViewById(R.id.txtpass);

    }


}
