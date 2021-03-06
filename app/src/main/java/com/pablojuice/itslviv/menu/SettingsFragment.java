package com.pablojuice.itslviv.menu;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.pablojuice.itslviv.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Locale;

public class SettingsFragment extends Fragment {

    private Switch themeChanger;
    private ConstraintLayout layout;
    private TextView langtxt;
    private Button contactbtn;
    private TextView encodedInfo;
    private Spinner languageSpinnerBtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        AdView adView = view.findViewById(R.id.advSettings);
        adView.loadAd(new AdRequest.Builder().build());


        layout = view.findViewById(R.id.frameLayout);
        langtxt = view.findViewById(R.id.textView3);
        contactbtn = view.findViewById(R.id.contactSettingsBTN);
        encodedInfo = view.findViewById(R.id.encodedInfo);
        themeChanger = view.findViewById(R.id.themeChanger);
        themeChanger.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                layout.setBackgroundColor(getResources().getColor(R.color.DarkBackGroundСolor, null));
                langtxt.setTextColor(getResources().getColor(R.color.DarkTextColor, null));
                themeChanger.setTextColor(getResources().getColor(R.color.DarkTextColor, null));
                contactbtn.setTextColor(getResources().getColor(R.color.DarkTextColor, null));
                encodedInfo.setTextColor(getResources().getColor(R.color.DarkTextColor, null));
            } else {
                layout.setBackgroundColor(getResources().getColor(R.color.BackGroundСolor, null));
                langtxt.setTextColor(getResources().getColor(R.color.TextColor, null));
                themeChanger.setTextColor(getResources().getColor(R.color.TextColor, null));
                contactbtn.setTextColor(getResources().getColor(R.color.TextColor, null));
                encodedInfo.setTextColor(getResources().getColor(R.color.TextColor, null));
            }
        });
        languageSpinnerBtn = view.findViewById(R.id.languageSpinnerBtn);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] languages = getResources().getStringArray(R.array.languages);
        ArrayAdapter<String> languageSpinnerAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, languages);
        languageSpinnerBtn.setAdapter(languageSpinnerAdapter);

        languageSpinnerBtn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selected = (String) adapterView.getSelectedItem();
                switch (selected) {
                    case "English":
                        switchToLocale(Locale.ENGLISH);
                        break;
                    case "Polish":
                        switchToLocale(new Locale("pl"));
                        break;
                    case "Ukrainian":
                        switchToLocale(new Locale("uk"));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        contactbtn.setOnClickListener(v ->{
            Intent intent = new Intent(Intent.ACTION_VIEW);
            Uri data = Uri.parse("mailto:encoded.inc@gmail.com?subject=Help");
            intent.setData(data);
            startActivity(intent);
        });
    }

    private void switchToLocale(Locale locale) {
        if (!locale.getLanguage().equalsIgnoreCase(getResources().getConfiguration().locale.getLanguage())) {
            Locale.setDefault(locale);
            Configuration config = new Configuration();
            config.locale = locale;
            if (getActivity() != null) {
                getActivity().getBaseContext().getResources().updateConfiguration(config,
                        getActivity().getBaseContext().getResources().getDisplayMetrics());
                getActivity().recreate();
            } else {
                throw new IllegalStateException("Activity is not created");
            }
        }
    }
}