package com.example.checklove;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.Settings;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button;


    EditText male, female;
    TextView tv;
    String result;
    String a;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MediaPlayer player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();


    }

    public void showResult(View v) {
        {


            setContentView(R.layout.activity_main);
            male = (EditText) findViewById(R.id.editText);
            female = (EditText) findViewById(R.id.editText2);

            String f = female.getText().toString();
            String m = male.getText().toString();
            String sum = m + f;
            sum = sum.toLowerCase();
            int value = sum.hashCode();

            Random random = new Random(value);
            result = ((random.nextInt(100-30)+1) + "%").toString();

            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
            intent.putExtra("result", result);
            startActivity(intent);

        }


    }
}








