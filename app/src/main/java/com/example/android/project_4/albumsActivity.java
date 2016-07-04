package com.example.android.project_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class albumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
    }

    public void buttonClickHome(View view){
        Intent buttonIntent = new Intent(albumsActivity.this, MainActivity.class);
        startActivity(buttonIntent);
    }

    public void buttonClickNowPlaying(View view){
        Intent buttonIntent = new Intent(albumsActivity.this, nowPlayingActivity.class);
        startActivity(buttonIntent);
    }

    public void buttonClickSongs(View view) {
        Intent buttonIntent = new Intent(albumsActivity.this, songsActivity.class);
        startActivity(buttonIntent);
    }
    public void buttonClickAlbums(View view) {
        Intent buttonIntent = new Intent(albumsActivity.this, albumsActivity.class);
        startActivity(buttonIntent);
    }
    public void buttonClickArtists(View view) {
        Intent buttonIntent = new Intent(albumsActivity.this, artistsActivity.class);
        startActivity(buttonIntent);
    }
}
