package com.pablojuice.itslviv.homeMenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.pablojuice.itslviv.R;

public class ActivitiesActivity extends AppCompatActivity {

    private Button museumActivityBTN;
    private Button sightActivityBTN;
    private Button shoppingActivityBTN;
    private Button parksActivityBTN;
    private Button restaurantsActivityBTN;
    private Button barsActivityBTN;

    private View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);


        museumActivityBTN = findViewById(R.id.museumActivityBTN);
        museumActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Museums");
            startActivity(intent);
        });

        sightActivityBTN = findViewById(R.id.sightActivityBTN);
        sightActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Sightseeing");
            startActivity(intent);
        });

        shoppingActivityBTN = findViewById(R.id.shoppingActivityBTN);
        shoppingActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Shopping");
            startActivity(intent);
        });

        parksActivityBTN = findViewById(R.id.parksActivityBTN);
        parksActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Parks");
            startActivity(intent);
        });

        restaurantsActivityBTN = findViewById(R.id.restaurantsActivityBTN);
        restaurantsActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Restaurants");
            startActivity(intent);
        });

        barsActivityBTN = findViewById(R.id.barsActivityBTN);
        barsActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Bars");
            startActivity(intent);
        });

        getSupportActionBar().setTitle("Activities");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener(){

            @Override
            public void onSystemUiVisibilityChange(int visibility) {
                if (visibility == 0){
                    decorView.setSystemUiVisibility(hideSystemBars());
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus){
            decorView.setSystemUiVisibility(hideSystemBars());
        }
    }
    private int hideSystemBars(){
        return View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    }
}