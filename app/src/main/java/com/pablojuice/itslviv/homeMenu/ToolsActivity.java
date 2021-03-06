package com.pablojuice.itslviv.homeMenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.pablojuice.itslviv.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ToolsActivity extends AppCompatActivity {

    private AdView mAdView;
    private View decorView;
    private TextView timeToolsItem;
    private EditText foreignСurrencyToolsItem;
    private TextView nativeСurrencyToolsItem;
    private TextView usefulPhrasesToolsItem;

    int usefulPhrasesPosition = 1;
    String usefulPhrases[] = new String[]{
            "Hello \n Informal - Привіт (Pryvit) \n Formal - Добрий день (Dobryy denʹ) \n",
            "How are you? \n Informal - Як поживаєте? (Yak pozhyvayete?) \n Formal - Як справи? (Yak spravy?) \n",
            "Fine, thank you \n Добре, дякую \n (Dobre, dyakuyu) \n",
            "Please \n Будь ласка (Budʹ laska) \n"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);

        timeToolsItem = findViewById(R.id.timeToolsItem);
        Date currentDate = new Date();
        DateFormat timeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        timeFormat.setTimeZone(TimeZone.getTimeZone("Europe/Kiev"));
        timeToolsItem.setText(timeFormat.format(currentDate));

        foreignСurrencyToolsItem = findViewById(R.id.foreignСurrencyToolsItem);
        nativeСurrencyToolsItem = findViewById(R.id.nativeСurrencyToolsItem);

        foreignСurrencyToolsItem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (!foreignСurrencyToolsItem.getText().toString().equals(""))
                nativeСurrencyToolsItem.setText(Double.toString(Double.parseDouble(foreignСurrencyToolsItem.getText().toString())* 27.59));
            }
        });

        usefulPhrasesToolsItem = findViewById(R.id.usefulPhrasesToolsItem);

        usefulPhrasesToolsItem.setOnClickListener(v -> {
            usefulPhrasesChange();
        });

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.advTools);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        getSupportActionBar().setTitle("Tools");
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
    public void usefulPhrasesChange(){
        if (usefulPhrasesPosition >= 4) usefulPhrasesPosition = 0;
        usefulPhrasesToolsItem.setText(usefulPhrases[usefulPhrasesPosition].toString());
        usefulPhrasesPosition ++;
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