package com.rots87.mascotas;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Raiting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiting);
        Toolbar AppBar = (Toolbar) findViewById(R.id.AppBar);
        setSupportActionBar(AppBar);
        AppBar.setNavigationIcon(R.drawable.abc_ic_ab_back_material);
        AppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                regresarMain(v);
            }
        });

        ImageView Fav = (ImageView) findViewById(R.id.abFav);
        Fav.setVisibility(View.INVISIBLE);
    }

    public void regresarMain(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
