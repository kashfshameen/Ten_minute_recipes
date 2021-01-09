package com.kashf.tenminuterecipes.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;
import com.kashf.tenminuterecipes.BuildConfig;
import com.kashf.tenminuterecipes.R;

import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class homepage extends AppCompatActivity {
    List<SlideModel> slideModels,lunch_slider,soup_slider,salad_slider,desert_slider;
    ImageSlider imageSlider1, lunch,soup,slads,desert;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        imageSlider1 = (ImageSlider) findViewById(R.id.breakfast);
        lunch = (ImageSlider) findViewById(R.id.lunch);
        soup = (ImageSlider) findViewById(R.id.Soup);
        slads = (ImageSlider) findViewById(R.id.Salads);
        desert = (ImageSlider) findViewById(R.id.desert);


        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        navigationView=(NavigationView)findViewById(R.id.nav_view);
        actionBarDrawerToggle=new ActionBarDrawerToggle(homepage.this,drawerLayout,R.string.open,R.string.close);
        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.moreapp:
                        final String playstore = "kashf"; // getPackageName() from Context or Activity object
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + playstore)));
                        } catch (android.content.ActivityNotFoundException anfe) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + playstore)));
                        }
                        break;
                    case R.id.rate:
                        Uri uri = Uri.parse("market://details?id=" + getPackageName());
                        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_NEW_DOCUMENT | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        }
                        try {
                            startActivity(goToMarket);
                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                        }
                        break;
                    case R.id.shareapp:
                        try{
                            Intent shareIntent = new Intent(Intent.ACTION_SEND);
                            shareIntent.setType("text/plain");
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Download Best Recipe APP");
                            String shareMessage= "\nLet me recommend you this application\n\n";
                            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                            startActivity(Intent.createChooser(shareIntent, "choose one"));
                        } catch(Exception e) {
                            Toast.makeText(homepage.this, "This is my Toast message!",Toast.LENGTH_LONG).show();
                        }
                        break;
                    case R.id.privacy:
                        Intent intent = new Intent(homepage.this, privacy.class);
                        startActivity(intent);
                        break;
                }




                return true;
            }
        });

        addImages();



        MobileAds.initialize(this, "ca-app-pub-2992948270492543~5810887811");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }

    void addImages() {
        slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.b1, getResources().getString(R.string.r1_title), ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.b2, getResources().getString(R.string.r2_title), ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.b3, getResources().getString(R.string.r3_title), ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.b4, getResources().getString(R.string.r4_title), ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.b5, getResources().getString(R.string.r5_title), ScaleTypes.CENTER_CROP));
        imageSlider1.setImageList(slideModels, ScaleTypes.FIT);

//******************************************************** lunch Slider***********************************************************************************************************************************************
       lunch_slider = new ArrayList<>();
        lunch_slider.add(new SlideModel(R.drawable.l1, getResources().getString(R.string.l1_title), ScaleTypes.CENTER_CROP));
        lunch_slider.add(new SlideModel(R.drawable.l2, getResources().getString(R.string.l2_title), ScaleTypes.CENTER_CROP));
        lunch_slider.add(new SlideModel(R.drawable.l3, getResources().getString(R.string.l3_title), ScaleTypes.CENTER_CROP));
        lunch_slider.add(new SlideModel(R.drawable.l4, getResources().getString(R.string.l4_title), ScaleTypes.CENTER_CROP));
        lunch_slider.add(new SlideModel(R.drawable.l5, getResources().getString(R.string.l5_title), ScaleTypes.CENTER_CROP));
       lunch.setImageList(lunch_slider, ScaleTypes.FIT);

//******************************************************** Salad Slider***********************************************************************************************************************************************
        salad_slider = new ArrayList<>();
        salad_slider.add(new SlideModel(R.drawable.s1,  getResources().getString(R.string.s1_title), ScaleTypes.CENTER_CROP));
        salad_slider.add(new SlideModel(R.drawable.s2,  getResources().getString(R.string.s2_title), ScaleTypes.CENTER_CROP));
        salad_slider.add(new SlideModel(R.drawable.s3,  getResources().getString(R.string.s3_title), ScaleTypes.CENTER_CROP));
        salad_slider.add(new SlideModel(R.drawable.s4,  getResources().getString(R.string.s4_title), ScaleTypes.CENTER_CROP));
        salad_slider.add(new SlideModel(R.drawable.s5,  getResources().getString(R.string.s5_title), ScaleTypes.CENTER_CROP));

        slads.setImageList(salad_slider, ScaleTypes.FIT);
//******************************************************** Soups Slider***********************************************************************************************************************************************
        soup_slider = new ArrayList<>();
        soup_slider.add(new SlideModel(R.drawable.so1, getResources().getString(R.string.so1_title), ScaleTypes.CENTER_CROP));
        soup_slider.add(new SlideModel(R.drawable.so2, getResources().getString(R.string.so2_title), ScaleTypes.CENTER_CROP));
        soup_slider.add(new SlideModel(R.drawable.so3, getResources().getString(R.string.so3_title), ScaleTypes.CENTER_CROP));
        soup_slider.add(new SlideModel(R.drawable.so4, getResources().getString(R.string.so4_title), ScaleTypes.CENTER_CROP));
        soup_slider.add(new SlideModel(R.drawable.so5, getResources().getString(R.string.so5_title), ScaleTypes.CENTER_CROP));
        soup.setImageList(soup_slider, ScaleTypes.FIT);

//******************************************************** desert Slider***********************************************************************************************************************************************

        desert_slider = new ArrayList<>();
        desert_slider.add(new SlideModel(R.drawable.d1, getResources().getString(R.string.d1_title), ScaleTypes.CENTER_CROP));
        desert_slider.add(new SlideModel(R.drawable.d2, getResources().getString(R.string.d2_title), ScaleTypes.CENTER_CROP));
        desert_slider.add(new SlideModel(R.drawable.d3, getResources().getString(R.string.d3_title), ScaleTypes.CENTER_CROP));
        desert_slider.add(new SlideModel(R.drawable.d4, getResources().getString(R.string.d4_title), ScaleTypes.CENTER_CROP));
        desert_slider.add(new SlideModel(R.drawable.d5, getResources().getString(R.string.d5_title), ScaleTypes.CENTER_CROP));

        desert.setImageList(desert_slider, ScaleTypes.FIT);

    }

    public void ViewAll(View view) {
        Intent intent = new Intent(homepage.this, MainActivity.class);
        switch (view.getId()) {
            case R.id.viewall1:
                intent.putExtra("condition", 1);
                break;
            case R.id.lunch_btn:

                intent.putExtra("condition", 2);
                break;

            case R.id.Salads_btn:

                intent.putExtra("condition", 3);
                break;
            case R.id.Soup_btn:

                intent.putExtra("condition", 4);
                break;
            case R.id.desert_btn:

                intent.putExtra("condition", 5);
                break;
        }
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return actionBarDrawerToggle. onOptionsItemSelected(item) ||super.onOptionsItemSelected(item);
    }
}