package com.example.android.project_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class songsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
    }

    public void buttonClickHome(View view){
        Intent buttonIntent = new Intent(songsActivity.this, MainActivity.class);
        startActivity(buttonIntent);
    }

    public void buttonClickNowPlaying(View view){
        Intent buttonIntent = new Intent(songsActivity.this, nowPlayingActivity.class);
        startActivity(buttonIntent);
    }

    public void buttonClickSongs(View view) {
        Intent buttonIntent = new Intent(songsActivity.this, songsActivity.class);
        startActivity(buttonIntent);
    }
    public void buttonClickAlbums(View view) {
        Intent buttonIntent = new Intent(songsActivity.this, albumsActivity.class);
        startActivity(buttonIntent);
    }
    public void buttonClickArtists(View view) {
        Intent buttonIntent = new Intent(songsActivity.this, artistsActivity.class);
        startActivity(buttonIntent);
    }
}
