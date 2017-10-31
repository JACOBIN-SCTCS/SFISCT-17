package com.sctcs.jacobin.sfisct_17;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    VerticalViewPager viewPager;
    CandidateAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(VerticalViewPager) findViewById(R.id.pager);
        adapter=new CandidateAdapter(this);
        viewPager.setAdapter(adapter);


    }


}
