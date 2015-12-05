package com.example.android.mynanodegreeapps;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button mSpotifyButton, mScoresButton, mLibraryButton,
            mBuildBiggerButton, mBaconButton, mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSpotifyButton = (Button) findViewById(R.id.button_spotify_streamer);
        mScoresButton = (Button) findViewById(R.id.button_scores_app);
        mLibraryButton = (Button) findViewById(R.id.button_library_app);
        mBuildBiggerButton = (Button) findViewById(R.id.button_build_bigger);
        mBaconButton = (Button) findViewById(R.id.button_bacon_reader);
        mCapstoneButton = (Button) findViewById(R.id.button_capstone);

        mSpotifyButton.setOnClickListener(this);
        mScoresButton.setOnClickListener(this);
        mLibraryButton.setOnClickListener(this);
        mBuildBiggerButton.setOnClickListener(this);
        mBaconButton.setOnClickListener(this);
        mCapstoneButton.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"In Development!",Toast.LENGTH_SHORT).show();

    }
}
