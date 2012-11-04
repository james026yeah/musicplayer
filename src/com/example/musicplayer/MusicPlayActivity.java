package com.example.musicplayer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MusicPlayActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicplay);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.musicplay, menu);
        return true;
    }
}
