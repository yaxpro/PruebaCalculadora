package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,button2,button3,button4;
    TextView msg;
    EditText ET1,ET2;

    btn1=(Button)findViewById(R.id.button);
    btn2=(Button)findViewById(R.id.button2);
    btn3=(Button)findViewById(R.id.button3);
    btn4=(Button)findViewById(R.id.button4);
    msg=(TextView) findViewById(R.id.)
    ET1=(EditText)findViewById(R.id.E1);
    ET2=(EditText)findViewById(R.id.E2);


    n1.intParse()
    n2.intParse



    @Override
    protected void onCreate(View view) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (view.getId()==R.id.btnsuma){
            Intent siguiente = new Intent (this,suma.class) ;
        } else if (view.getId() == btnresta)
         {
            Intent siguiente = new Intent (this,resta.class);
        }
        else if (view.getId() == btnmulti)
        {
            msg.setText("");
        }
        else if (view.getId() == btndividir)
        {
            Toast.makeText(this,"el resultado de la division es:",Toast.LENGTH_LONG);
        }
    }
}
