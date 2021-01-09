package com.kashf.tenminuterecipes.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.kashf.tenminuterecipes.R;
import com.kashf.tenminuterecipes.adapter.RecipeAdapter;
import com.kashf.tenminuterecipes.model.constant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int condition;
    Intent intent;
    GridView gridView;
    RecipeAdapter recipeAdapter;
     List<constant>constantList;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
gridView=(GridView)findViewById(R.id.gridview);
constantList=new ArrayList<>();




    intent=getIntent();
    condition=intent.getIntExtra("condition",00);
    if(condition==1){
        breakfast_recipe();
    }
    else if(condition==2){
        lunch_recipe();

    }
    else if(condition==3){

        Salads_recipe();
    }
    else if(condition==4){

        Soup_recipe();
    }
    else if(condition==5){

        desert_recipe();
    }

       recipeAdapter=new RecipeAdapter(MainActivity.this,constantList);
    gridView.setAdapter(recipeAdapter);



        MobileAds.initialize(this, "ca-app-pub-2992948270492543~5810887811");
        mAdView = findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2992948270492543/4749087588");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }



    private void breakfast_recipe() {

        constantList.add(new constant(R.drawable.b1,getResources().getString(R.string.r1_title),getResources().getString(R.string.r1_ehjza),getResources().getString(R.string.r1_tarqeeb)));
        constantList.add(new constant(R.drawable.b2,getResources().getString(R.string.r2_title),getResources().getString(R.string.r2_ehjza),getResources().getString(R.string.r2_tarqeeb)));
        constantList.add(new constant(R.drawable.b3,getResources().getString(R.string.r3_title),getResources().getString(R.string.r3_ehjza),getResources().getString(R.string.r3_tarqeeb)));
        constantList.add(new constant(R.drawable.b4,getResources().getString(R.string.r4_title),getResources().getString(R.string.r4_ehjza),getResources().getString(R.string.r4_tarqeeb)));
        constantList.add(new constant(R.drawable.b5,getResources().getString(R.string.r5_title),getResources().getString(R.string.r5_ehjza),getResources().getString(R.string.r5_tarqeeb)));
        constantList.add(new constant(R.drawable.b6,getResources().getString(R.string.r6_title),getResources().getString(R.string.r6_ehjza),getResources().getString(R.string.r6_tarqeeb)));
        constantList.add(new constant(R.drawable.b7,getResources().getString(R.string.r7_title),getResources().getString(R.string.r7_ehjza),getResources().getString(R.string.r7_tarqeeb)));
        constantList.add(new constant(R.drawable.b8,getResources().getString(R.string.r8_title),getResources().getString(R.string.r8_ehjza),getResources().getString(R.string.r8_tarqeeb)));

    }

    private void lunch_recipe() {
        constantList.add(new constant(R.drawable.l1,getResources().getString(R.string.l1_title),getResources().getString(R.string.l1_ehjza),getResources().getString(R.string.l1_tarqeeb)));
        constantList.add(new constant(R.drawable.l2,getResources().getString(R.string.l2_title),getResources().getString(R.string.l2_ehjza),getResources().getString(R.string.l2_tarqeeb)));
        constantList.add(new constant(R.drawable.l3,getResources().getString(R.string.l3_title),getResources().getString(R.string.l3_ehjza),getResources().getString(R.string.l3_tarqeeb)));
        constantList.add(new constant(R.drawable.l4,getResources().getString(R.string.l4_title),getResources().getString(R.string.l4_ehjza),getResources().getString(R.string.l4_tarqeeb)));
        constantList.add(new constant(R.drawable.l5,getResources().getString(R.string.l5_title),getResources().getString(R.string.l5_ehjza),getResources().getString(R.string.l5_tarqeeb)));
        constantList.add(new constant(R.drawable.l6,getResources().getString(R.string.l6_title),getResources().getString(R.string.l6_ehjza),getResources().getString(R.string.l6_tarqeeb)));
        constantList.add(new constant(R.drawable.l7,getResources().getString(R.string.l7_title),getResources().getString(R.string.l7_ehjza),getResources().getString(R.string.l7_tarqeeb)));
        constantList.add(new constant(R.drawable.l8,getResources().getString(R.string.l8_title),getResources().getString(R.string.l8_ehjza),getResources().getString(R.string.l8_tarqeeb)));
        constantList.add(new constant(R.drawable.l9,getResources().getString(R.string.l9_title),getResources().getString(R.string.l9_ehjza),getResources().getString(R.string.l9_tarqeeb)));
        constantList.add(new constant(R.drawable.l10,getResources().getString(R.string.l10_title),getResources().getString(R.string.l10_ehjza),getResources().getString(R.string.l10_tarqeeb)));

    }

    private void Salads_recipe() {
        constantList.add(new constant(R.drawable.s1,getResources().getString(R.string.s1_title),getResources().getString(R.string.s1_ehjza),getResources().getString(R.string.s1_tarqeeb)));
        constantList.add(new constant(R.drawable.s2,getResources().getString(R.string.s2_title),getResources().getString(R.string.s2_ehjza),getResources().getString(R.string.s2_tarqeeb)));
        constantList.add(new constant(R.drawable.s3,getResources().getString(R.string.s3_title),getResources().getString(R.string.s3_ehjza),getResources().getString(R.string.s3_tarqeeb)));
        constantList.add(new constant(R.drawable.s4,getResources().getString(R.string.s4_title),getResources().getString(R.string.s4_ehjza),getResources().getString(R.string.s4_tarqeeb)));
        constantList.add(new constant(R.drawable.s5,getResources().getString(R.string.s5_title),getResources().getString(R.string.s5_ehjza),getResources().getString(R.string.s5_tarqeeb)));
        constantList.add(new constant(R.drawable.s6,getResources().getString(R.string.s6_title),getResources().getString(R.string.s6_ehjza),getResources().getString(R.string.s6_tarqeeb)));
        constantList.add(new constant(R.drawable.s7,getResources().getString(R.string.s7_title),getResources().getString(R.string.s7_ehjza),getResources().getString(R.string.s7_tarqeeb)));
        constantList.add(new constant(R.drawable.s8,getResources().getString(R.string.s8_title),getResources().getString(R.string.s8_ehjza),getResources().getString(R.string.s8_tarqeeb)));
        constantList.add(new constant(R.drawable.s9,getResources().getString(R.string.s9_title),getResources().getString(R.string.s9_ehjza),getResources().getString(R.string.s9_tarqeeb)));
        constantList.add(new constant(R.drawable.s10,getResources().getString(R.string.s10_title),getResources().getString(R.string.s10_ehjza),getResources().getString(R.string.s10_tarqeeb)));

    }

    private void Soup_recipe() {
        constantList.add(new constant(R.drawable.so1,getResources().getString(R.string.so1_title),getResources().getString(R.string.so1_ehjza),getResources().getString(R.string.so1_tarqeeb)));
        constantList.add(new constant(R.drawable.so2,getResources().getString(R.string.so2_title),getResources().getString(R.string.so2_ehjza),getResources().getString(R.string.so2_tarqeeb)));
        constantList.add(new constant(R.drawable.so3,getResources().getString(R.string.so3_title),getResources().getString(R.string.so3_ehjza),getResources().getString(R.string.so3_tarqeeb)));
        constantList.add(new constant(R.drawable.so4,getResources().getString(R.string.so4_title),getResources().getString(R.string.so4_ehjza),getResources().getString(R.string.so4_tarqeeb)));
        constantList.add(new constant(R.drawable.so5,getResources().getString(R.string.so5_title),getResources().getString(R.string.so5_ehjza),getResources().getString(R.string.so5_tarqeeb)));
        constantList.add(new constant(R.drawable.so6,getResources().getString(R.string.so6_title),getResources().getString(R.string.so6_ehjza),getResources().getString(R.string.so6_tarqeeb)));
        constantList.add(new constant(R.drawable.so7,getResources().getString(R.string.so7_title),getResources().getString(R.string.so7_ehjza),getResources().getString(R.string.so7_tarqeeb)));
        constantList.add(new constant(R.drawable.so8,getResources().getString(R.string.so8_title),getResources().getString(R.string.so8_ehjza),getResources().getString(R.string.so8_tarqeeb)));
        constantList.add(new constant(R.drawable.so9,getResources().getString(R.string.so9_title),getResources().getString(R.string.so9_ehjza),getResources().getString(R.string.so9_tarqeeb)));
        constantList.add(new constant(R.drawable.so10,getResources().getString(R.string.so10_title),getResources().getString(R.string.so10_ehjza),getResources().getString(R.string.so10_tarqeeb)));

    }

    private void desert_recipe() {
        constantList.add(new constant(R.drawable.d1,getResources().getString(R.string.d1_title),getResources().getString(R.string.d1_ehjza),getResources().getString(R.string.d1_tarqeeb)));
        constantList.add(new constant(R.drawable.d2,getResources().getString(R.string.d2_title),getResources().getString(R.string.d2_ehjza),getResources().getString(R.string.d2_tarqeeb)));
        constantList.add(new constant(R.drawable.d3,getResources().getString(R.string.d3_title),getResources().getString(R.string.d3_ehjza),getResources().getString(R.string.d3_tarqeeb)));
        constantList.add(new constant(R.drawable.d4,getResources().getString(R.string.d4_title),getResources().getString(R.string.d4_ehjza),getResources().getString(R.string.d4_tarqeeb)));
        constantList.add(new constant(R.drawable.d5,getResources().getString(R.string.d5_title),getResources().getString(R.string.d5_ehjza),getResources().getString(R.string.d5_tarqeeb)));
        constantList.add(new constant(R.drawable.d6,getResources().getString(R.string.d6_title),getResources().getString(R.string.d6_ehjza),getResources().getString(R.string.d6_tarqeeb)));
        constantList.add(new constant(R.drawable.d7,getResources().getString(R.string.d7_title),getResources().getString(R.string.d7_ehjza),getResources().getString(R.string.d7_tarqeeb)));
        constantList.add(new constant(R.drawable.d8,getResources().getString(R.string.d8_title),getResources().getString(R.string.d8_ehjza),getResources().getString(R.string.d8_tarqeeb)));
        constantList.add(new constant(R.drawable.d9,getResources().getString(R.string.d9_title),getResources().getString(R.string.d9_ehjza),getResources().getString(R.string.d9_tarqeeb)));
        constantList.add(new constant(R.drawable.l10,getResources().getString(R.string.d10_title),getResources().getString(R.string.d10_ehjza),getResources().getString(R.string.d10_tarqeeb)));

    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
        IntertitialAd();
    }
    void IntertitialAd()
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {

        }
    }
}