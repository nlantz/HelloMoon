package com.nlantz.app;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Nick Lantz on 5/27/14.
 */
public class AudioPlayer {

    private MediaPlayer mPlayer;

    public void stop() {
        if(mPlayer!=null){
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c){
        //it is good practice to only have one media player active at a time
        //embedding stop() here assures this
        stop();

        mPlayer = MediaPlayer.create(c, R.raw.one_small_step);

        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });

        mPlayer.start();
    }


}
