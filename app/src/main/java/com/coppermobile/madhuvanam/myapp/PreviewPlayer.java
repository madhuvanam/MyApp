package com.coppermobile.madhuvanam.myapp;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;

/**
 * Created by madhuvanam on 10/9/15.
 */
public class PreviewPlayer extends Activity {
    String previewUrl;
    MediaPlayer mediaPlayer;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview_player);
        Bundle bundle = getIntent().getExtras();
        previewUrl = bundle.getString("previewUrl");
        mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mediaPlayer.setDataSource(previewUrl);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
