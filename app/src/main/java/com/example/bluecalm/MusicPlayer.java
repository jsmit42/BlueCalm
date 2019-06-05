package com.example.bluecalm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MusicPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
    }

    public void onPlayClick(View v) {
        Toast.makeText(this, "No saved scripture found.", Toast.LENGTH_SHORT).show();
    }

    public void onBackClick(View v) {

    }
}

