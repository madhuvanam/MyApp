package com.coppermobile.madhuvanam.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loopj.android.http.AsyncHttpClient;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @Bind(R.id.welcome_text)
    TextView welcomeText;
    @Bind(R.id.songs_list)
    ListView songsListView;
    SelenaGomezSongs selenaSongs;
    SongsAdapter songsAdapter;
    ArrayList<SelenaGomezSongs> songsList = null;
    AsyncHttpClient client;
    String url = "https://itunes.apple.com/search?term=selenagomez&kinglimit=20";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        welcomeText.setText(welcomeText.getText());
        welcomeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VolleyExample.class);
                startActivity(intent);
            }
        });

//        client = new AsyncHttpClient();
//        client.get(MainActivity.this, url, new AsyncHttpResponseHandler() {
//            @Override
//            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
//                String responseStr = new String(responseBody);
//                Gson gson = new Gson();
//                selenaSongs = gson.fromJson(responseStr, SelenaSongs.class);
//                songsAdapter = new SongsAdapter(MainActivity.this, selenaSongs.getResults());
//                songsListView.setAdapter(songsAdapter);
//            }
//
//            @Override
//            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
//
//            }
//        });




        final StringRequest songRequest = new StringRequest(url,

                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                       GsonParseSongs(response);
                       songsAdapter = new SongsAdapter(MainActivity.this, songsList);
                       songsListView.setAdapter(songsAdapter);
                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        Volley.newRequestQueue(this).add(songRequest);
    }

    private void GsonParseSongs(String response) {
        Gson gson = new GsonBuilder().create();
        songsList = new ArrayList<>();
        try {
            JSONObject songList = new JSONObject(response);
            JSONArray songs = songList.getJSONArray("results");
            for (int i = 0; i < songs.length(); i++) {
                JSONObject songJson = (JSONObject) songs.get(i);
                selenaSongs = gson.fromJson(songJson.toString(), SelenaGomezSongs.class);
                songsList.add(selenaSongs);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
