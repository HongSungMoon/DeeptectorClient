package com.example.baeksubuntu.deepstreaming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RtspPlayView playView = new RtspPlayView(getApplicationContext(), "rtsp://192.168.0.19:8089/test1.mp4");
        setContentView(playView);
    }
}