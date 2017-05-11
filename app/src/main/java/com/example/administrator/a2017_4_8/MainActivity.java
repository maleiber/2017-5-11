package com.example.administrator.a2017_4_8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button LoginButton=null;
    Intent LoginIntent=null;
    Intent RegistIntent=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onClick(View arg)
    {
        if(arg.equals(LoginButton))
        {

        }
    }
}
