package com.coppermobile.madhuvanam.myapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by madhuvanam on 10/5/15.
 */
public class PicassoExample extends Activity {
    ImageView sampleImage;
    public String url = "http://www.queness.com/resources/images/png/apple_ex.png";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picasso_layout);
        sampleImage = (ImageView)findViewById(R.id.picasso_image);
        Picasso.with(this).load(url).into(sampleImage);
    }
}
