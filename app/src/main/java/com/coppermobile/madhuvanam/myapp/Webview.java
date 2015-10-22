package com.coppermobile.madhuvanam.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by madhuvanam on 10/7/15.
 */
public class Webview extends Activity{

    SelenaGomezSongs selenaSongs;
    Bundle bundle;
    @Bind(R.id.collection_name)
    TextView collectionName;
    @Bind(R.id.collection_price)
    TextView collectionPrice;
    @Bind(R.id.track_price)
    TextView trackPrice;
    @Bind(R.id.radio_station_url)
    TextView radioStationUrl;
    @Bind(R.id.web_view)
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additional_details);
        ButterKnife.bind(this);
        bundle = getIntent().getExtras();
        collectionName.setText("Collection Name: " + bundle.getString("collectionName"));
        collectionPrice.setText("Collection Price: " + bundle.getDouble("collectionPrice"));
        trackPrice.setText("Track Price: " + bundle.getDouble("trackPrice"));
        final String webUrl = bundle.getString("radioStationUrl");
        radioStationUrl.setText("Radio Station URL: " + webUrl);
        radioStationUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrlInWebView(webUrl);
            }
        });
    }

    public void openUrlInWebView(String Url){
        WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl(Url);
    }
}
