package com.example.dell.mediaplayer;

import android.view.View;
import android.widget.Toast;

/**
 * Created by dell on 10/13/2016.
 */

public class ArtistsClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),"List Of Artists",Toast.LENGTH_SHORT).show();
    }
}
