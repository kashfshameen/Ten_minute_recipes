package com.kashf.tenminuterecipes.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.kashf.tenminuterecipes.R;

public class detailpage extends AppCompatActivity {

    Intent intent;
    String title;
    String ejza;
    String tarqeeb;
    int img;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    TextView detail_titile, ejza_title,ejza_list,tarqeeb_title,tarqeeb_detail;
    ImageView recipe_thumbnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailpage);
        detail_titile=(TextView)findViewById(R.id.detail_title);
        ejza_title=(TextView)findViewById(R.id.ejza_title);
        ejza_list=(TextView)findViewById(R.id.ejza_list);
        tarqeeb_detail=(TextView)findViewById(R.id.tarqeeb_detail);
        tarqeeb_title=(TextView)findViewById(R.id.tarqeeb_title);

        recipe_thumbnail=(ImageView)findViewById(R.id.detail_image);
    intent=getIntent();
    img=intent.getIntExtra("image",00);
    title=intent.getStringExtra("title");
    tarqeeb=intent.getStringExtra("tarqeeb");
    ejza=intent.getStringExtra("ejza");
        Toast.makeText(detailpage.this,title,Toast.LENGTH_LONG).show();



        recipe_thumbnail.setImageResource(img);
        detail_titile.setText(title);

        ejza_title.setText( "Ingredient");
        ejza_list.setText(ejza);
        tarqeeb_title.setText("Method");
        tarqeeb_detail.setText(tarqeeb);

        MobileAds.initialize(this, "ca-app-pub-2992948270492543~5810887811");
        mAdView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2992948270492543/4749087588");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
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