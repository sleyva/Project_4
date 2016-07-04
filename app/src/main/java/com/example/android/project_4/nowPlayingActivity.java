package com.example.android.project_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class nowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
    }

    public void buttonClickHome(View view){
        Intent buttonIntent = new Intent(nowPlayingActivity.this, MainActivity.class);
        startActivity(buttonIntent);
    }

    public void buttonClickNowPlaying(View view){
        Intent buttonIntent = new Intent(nowPlayingActivity.this, nowPlayingActivity.class);
        startActivity(buttonIntent);
    }

    public void buttonClickSongs(View view) {
        Intent buttonIntent = new Intent(nowPlayingActivity.this, songsActivity.class);
        startActivity(buttonIntent);
    }
    public void buttonClickAlbums(View view) {
        Intent buttonIntent = new Intent(nowPlayingActivity.this, albumsActivity.class);
        startActivity(buttonIntent);
    }
    public void buttonClickArtists(View view) {
        Intent buttonIntent = new Intent(nowPlayingActivity.this, artistsActivity.class);
        startActivity(buttonIntent);
    }
}
