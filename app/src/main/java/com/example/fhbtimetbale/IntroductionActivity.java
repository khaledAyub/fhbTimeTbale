package com.example.fhbtimetbale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;


public class IntroductionActivity extends AppCompatActivity {

    ImageView logo, splashImage;
    TextView textView;
    LottieAnimationView lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        logo = findViewById(R.id.logo);
        splashImage = findViewById(R.id.backgImage);
        textView = findViewById(R.id.textView);
        lottieAnimationView = findViewById(R.id.lottie);

        logo.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        splashImage.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        textView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);


    }
}