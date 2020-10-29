package com.example.checklove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main2);
        super.onCreate(savedInstanceState);
        TextView txt1= (TextView)findViewById(R.id.textView);
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        Bundle extras=getIntent().getExtras();

        String str = extras.getString("result");
        txt1.setText(str);


        Toast.makeText(getApplicationContext(),"Result Is:"+str,Toast.LENGTH_SHORT);


    }
}

