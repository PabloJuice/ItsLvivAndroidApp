package com.pablojuice.itslviv.homeMenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.pablojuice.itslviv.R;

public class EssentialActivity extends AppCompatActivity {

    private Button hotelsActivityBTN;
    private Button healthActivityBTN;
    private Button restroomsActivityBTN;
    private Button banksActivityBTN;
    private Button parkingActivityBTN;
    private Button embassyActivityBTN;

    private View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essential);

        hotelsActivityBTN = findViewById(R.id.hotelsActivityBTN);
        hotelsActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Hotels");
            startActivity(intent);
        });

        healthActivityBTN = findViewById(R.id.healthActivityBTN);
        healthActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Health");
            startActivity(intent);
        });

        restroomsActivityBTN = findViewById(R.id.restroomsActivityBTN);
        restroomsActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Restrooms");
            startActivity(intent);
        });

        banksActivityBTN = findViewById(R.id.banksActivityBTN);
        banksActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Banks");
            startActivity(intent);
        });

        parkingActivityBTN = findViewById(R.id.parkingActivityBTN);
        parkingActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Parking");
            startActivity(intent);
        });

        embassyActivityBTN = findViewById(R.id.embassyActivityBTN);
        embassyActivityBTN.setOnClickListener(v ->{
            Intent intent = new Intent(this, ModelRecyclerActivity.class);
            intent.putExtra("BtnID", "Embassy");
            startActivity(intent);
        });

        getSupportActionBar().setTitle("Essential");
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