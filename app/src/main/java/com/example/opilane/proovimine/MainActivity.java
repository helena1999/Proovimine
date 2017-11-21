package com.example.opilane.proovimine;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Vanalinn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vanalinn=(Button)findViewById(R.id.Vanalinnlink);

        Vanalinn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.tallinn.ee/";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
    public void Pildid(View view) {
            Intent intent = new Intent(MainActivity.this, PildidActivity.class);
            startActivity(intent);
        }

    public void Tutvustus(View view) {
        Intent intent = new Intent(MainActivity.this, TutvustusMain2Activity.class);
        startActivity(intent);

    }
}