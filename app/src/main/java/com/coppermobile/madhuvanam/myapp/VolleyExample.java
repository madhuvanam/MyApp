package com.coppermobile.madhuvanam.myapp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by madhuvanam on 10/2/15.
 */
public class VolleyExample extends Activity {
    @Bind(R.id.textId)
    TextView volleyText;

    @Bind(R.id.imageId)
    ImageView volleyImage;

    @Bind(R.id.image2Id)
    ImageView volleyImage2;

    private static final String TAG = VolleyExample.class.getSimpleName();

    String url = "https://ksqphotography.files.wordpress.com/2011/05/sample-with-dx-crop-factor.jpg";
    String url2 = "http://pngimg.com/upload/water_PNG3290.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_layout);
        ButterKnife.bind(this);
        Picasso picasso = new Picasso.Builder(this).listener(new Picasso.Listener() {
            @Override
            public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                exception.printStackTrace();
            }
        }).build();

        picasso.load(url).into(volleyImage, new Callback() {
            @Override
            public void onSuccess() {
                Log.d(TAG, "Success");
            }

            @Override
            public void onError() {
                Log.d(TAG, "Error loading the image");
            }
        });

        //Picasso.with(this).load(url2).into(volleyImage2);
    }
}
