package com.mihrinurgrn.gelecegiyazankadnlarfirstweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class newActivity extends AppCompatActivity {

    ImageView imageView;
    public static final int IMAGE_REQUEST_CODE=21;

    VideoView videoView;
    public static final int VIDEO_REQUEST_CODE=22;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new);

        Button buttonPhoto=findViewById(R.id.buttonPhoto);
        Button buttonVideo=findViewById(R.id.buttonVideo);
        Button buttonPlay=findViewById(R.id.buttonPlay);

        imageView=findViewById(R.id.imageView);
        videoView=findViewById(R.id.videoView);

        setContentView(R.layout.activity_new);
















    }
}
