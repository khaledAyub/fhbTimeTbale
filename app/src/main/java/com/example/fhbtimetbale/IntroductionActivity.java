package com.example.fhbtimetbale;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.airbnb.lottie.LottieAnimationView;
import com.cuberto.liquid_swipe.LiquidPager;


public class IntroductionActivity extends AppCompatActivity {

    ImageView logo, splashImage;
    TextView textView;
    LottieAnimationView lottieAnimationView;

    LiquidPager pager;
    ViewPagerAdater adapter;

    private static final int NUM_PAGES = 3;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        logo = findViewById(R.id.logo);
        splashImage = findViewById(R.id.backgImage);
        textView = findViewById(R.id.textView);
        lottieAnimationView = findViewById(R.id.lottie);

        pager = findViewById(R.id.pager);
        adapter = new ViewPagerAdater(getSupportFragmentManager(), 1);
        pager.setAdapter(adapter);


        logo.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
        splashImage.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        textView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);


    }




}