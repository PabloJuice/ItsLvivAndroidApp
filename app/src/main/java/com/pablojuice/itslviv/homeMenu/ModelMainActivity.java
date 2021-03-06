package com.pablojuice.itslviv.homeMenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.pablojuice.itslviv.R;
import com.pablojuice.itslviv.recyclerNewsList.NewsPack;

public class ModelMainActivity extends AppCompatActivity {

    private NewsPack newsPack;

    private ImageView imgSource;
    private TextView header;
    private TextView mark;
    private TextView info;
    private Button fomBtn;

    private View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_main_item);

        imgSource = findViewById(R.id.news_list_item_img);
        header = findViewById(R.id.news_list_item_header);
        mark = findViewById(R.id.news_list_item_mark);
        info = findViewById(R.id.news_main_item_info);

        newsPack = getIntent().getExtras().getParcelable("newsPack");

        imgSource.setImageResource(getResources().getIdentifier(newsPack.getImgSource(), "drawable", getPackageName() ));
        header.setText(newsPack.getHeader());
        mark.setText(newsPack.getMark());
        info.setText(newsPack.getInfo());


        fomBtn = findViewById(R.id.fomBtn);
        fomBtn.setOnClickListener(v ->{
            Intent intent = new Intent(this, MapsActivity.class);
            intent.putExtra("newsPack", newsPack);
            startActivity(intent);
        });

        getSupportActionBar().setTitle("");
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