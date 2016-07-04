package com.example.android.project_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
    }

    public void buttonClickHome(View view){
        Intent buttonIntent = new Intent(albums.this, MainActivity.class);
        startActivity(buttonIntent);
    }

    public void buttonClickNowPlaying(View view){
        Intent buttonIntent = new Intent(albums.this, nowPlaying.class);
        startActivity(buttonIntent);
    }

    public void buttonClickSongs(View view) {
        Intent buttonIntent = new Intent(albums.this, songs.class);
        startActivity(buttonIntent);
    }
    public void buttonClickAlbums(View view) {
        Intent buttonIntent = new Intent(albums.this, albums.class);
        startActivity(buttonIntent);
    }
    public void buttonClickArtists(View view) {
        Intent buttonIntent = new Intent(albums.this, artists.class);
        startActivity(buttonIntent);
    }
}
