package com.pablojuice.itslviv.menu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pablojuice.itslviv.R;
import com.pablojuice.itslviv.homeMenu.ActivitiesActivity;
import com.pablojuice.itslviv.homeMenu.EssentialActivity;
import com.pablojuice.itslviv.homeMenu.NewsRecyclerActivity;
import com.pablojuice.itslviv.homeMenu.ToolsActivity;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment homeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private Button wikiHomeBtn;
    private Button newsHomeBtn;
    private Button activitiesHomeBtn;
    private Button essentialHomeBtn;
    private Button toolsHomeBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        wikiHomeBtn = view.findViewById(R.id.wikiHomeBtn);
        wikiHomeBtn.setOnClickListener(v ->{
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Lviv"));
            startActivity(browserIntent);
        });


        newsHomeBtn = view.findViewById(R.id.newsHomeBtn);
        newsHomeBtn.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), NewsRecyclerActivity.class);
            startActivity(intent);
        });

        activitiesHomeBtn = view.findViewById(R.id.activitiesHomeBtn);
        activitiesHomeBtn.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), ActivitiesActivity.class);
            startActivity(intent);
        });

        essentialHomeBtn = view.findViewById(R.id.essentialHomeBtn);
        essentialHomeBtn.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), EssentialActivity.class);
            startActivity(intent);
        });

        toolsHomeBtn = view.findViewById(R.id.toolsHomeBtn);
        toolsHomeBtn.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), ToolsActivity.class);
            startActivity(intent);
        });


        return view;
    }
}