package com.example.fhbtimetbale;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class ViewPagerAdater extends FragmentPagerAdapter {
    public ViewPagerAdater(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new OnBoardingFragment1();
            case 1:
                return new OnBoardingFragment2();
            case 2:
                return new OnBoardingFragment3();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
