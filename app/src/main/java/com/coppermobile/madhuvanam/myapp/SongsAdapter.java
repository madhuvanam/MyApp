package com.coppermobile.madhuvanam.myapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by madhuvanam on 10/6/15.
 */
public class SongsAdapter extends BaseAdapter{
    private List<SelenaGomezSongs> songsList;
    private Context context;

    public SongsAdapter( Context context, List<SelenaGomezSongs> songsList) {
        this.context = context;
        this.songsList = songsList;
    }

    @Override
    public int getCount() {
        return songsList.size();
    }

    @Override
    public Object getItem(int position) {
        return songsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder;
        if(view==null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.songs_row, parent, false);
            holder = new ViewHolder(view);
            final SelenaGomezSongs song = (SelenaGomezSongs) getItem(position);
            final String imageUrl = song.getArtworkUrl100();
            Picasso.with(context).load(imageUrl).resize(200, 200).into(holder.coverImage);

            holder.coverTitle.setText(song.getArtistName());
            holder.coverTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, Webview.class);
                    intent.putExtra("collectionName", song.getTrackName());
                    intent.putExtra("collectionPrice", song.getCollectionPrice());
                    intent.putExtra("trackPrice", song.getTrackPrice());
                    intent.putExtra("radioStationUrl", song.getRadioStationUrl());
                    context.startActivity(intent);
                }
            });
            holder.coverDescription.setText(song.getTrackName());
            holder.coverDescription.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent  = new Intent(context, PreviewPlayer.class);
                    intent.putExtra("previewUrl",song.getPreviewUrl());
                    context.startActivity(intent);
                }
            });
            holder.country.setText(song.getCountry());
            holder.country.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, Location.class);
                    intent.putExtra("country", song.getCountry());
                    context.startActivity(intent);
                }
            });
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder)view.getTag();
        }

        return view;
    }

    public class ViewHolder{
        @Bind(R.id.cover_image)
        ImageView coverImage;
        @Bind(R.id.cover_title)
        TextView coverTitle;
        @Bind(R.id.cover_description)
        TextView coverDescription;
        @Bind(R.id.country)
        TextView country;
        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
