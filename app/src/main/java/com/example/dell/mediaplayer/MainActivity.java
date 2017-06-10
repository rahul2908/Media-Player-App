package com.example.dell.mediaplayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView onlineMusic = (ImageView) findViewById(R.id.online_image_view);
        onlineMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://gaana.com/";
                    Uri webpage = Uri.parse(url);
                    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                    }

            }
        });

        ImageView nowPlaying = (ImageView) findViewById(R.id.nowplaying_image_view);
        nowPlaying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent nowPlayingIntent= new Intent(MainActivity.this,NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }

        });

        TextView artists = (TextView) findViewById(R.id.artists_text_view);
        artists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artistsIntent = new Intent(MainActivity.this,ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums_text_view);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this,AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        TextView songs = (TextView) findViewById(R.id.songs_text_view);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this,SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView playlists = (TextView) findViewById(R.id.playlists_text_view);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistsIntent = new Intent(MainActivity.this,PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });
    }
}
