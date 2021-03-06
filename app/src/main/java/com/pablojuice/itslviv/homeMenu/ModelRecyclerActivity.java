package com.pablojuice.itslviv.homeMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.pablojuice.itslviv.ItsLvivAplication;
import com.pablojuice.itslviv.R;
import com.pablojuice.itslviv.db.DataBaseHelper;
import com.pablojuice.itslviv.recyclerNewsList.ModelAdapter;
import com.pablojuice.itslviv.recyclerNewsList.NewsPack;

import java.util.List;

public class ModelRecyclerActivity extends AppCompatActivity {

    private RecyclerView modelView;
    private ModelAdapter modelAdapter;
    private List<NewsPack> newsList;

    private View decorView;

    private DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_list);

        dataBaseHelper = ((ItsLvivAplication) getApplication()).getDataBaseHelper();

        String type = getIntent().getStringExtra("BtnID");

        modelAdapter = new ModelAdapter(this, dataBaseHelper, type);

        modelView = findViewById(R.id.modelView);
        modelView.setAdapter(modelAdapter);
        modelView.setLayoutManager(new LinearLayoutManager(this));

        getSupportActionBar().setTitle(type);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(visibility -> {
            if (visibility == 0){
                decorView.setSystemUiVisibility(hideSystemBars());
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
