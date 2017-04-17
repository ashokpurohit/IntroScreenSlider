package com.gadgetcreek.introscreenslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_play_again).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // We normally won't show the welcome slider again in real app
                // but this is for testing
                LaunchManager LaunchManager = new LaunchManager(getApplicationContext());

                // make first time launch TRUE
                LaunchManager.setFirstTimeLaunch(true);

                startActivity(new Intent(MainActivity.this, IntroSlider.class));
                finish();
            }
        });
    }
}
