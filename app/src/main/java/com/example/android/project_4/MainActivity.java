package com.example.android.project_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Store each view in a variable
        TextView category_1 = (TextView) findViewById(R.id.category_1);
        TextView category_2 = (TextView) findViewById(R.id.category_2);
        TextView category_3 = (TextView) findViewById(R.id.category_3);
        TextView category_4 = (TextView) findViewById(R.id.category_4);

        //Set on click listeners
        category_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, nowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
        category_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, songsActivity.class);
                startActivity(songsIntent);
            }
        });
        category_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, albumsActivity.class);
                startActivity(albumsIntent);
            }
        });
        category_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, artistsActivity.class);
                startActivity(artistIntent);
            }
        });

    }
}
