package com.rots87.mascotas;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Raiting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiting);

        //android.app.ActionBar actionBar= getActionBar();
        //actionBar.setDisplayHomeAsUpEnabled(true);

        ImageView Fav = (ImageView) findViewById(R.id.abFav);
        Fav.setVisibility(View.INVISIBLE);
    }

    public void regresarMain(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
