package com.example.myapplication.adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.fragments.ChatFragment;
import com.example.myapplication.fragments.HomeFragment;
import com.example.myapplication.fragments.StatusFragment;

public class TabViewPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private int tabs;

    public TabViewPagerAdapter(@NonNull FragmentManager fm, Context context, int tabs) {
        super(fm);
        this.context = context;
        this.tabs = tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                StatusFragment statusFragment = new StatusFragment();
                return statusFragment;
            case 2:
                ChatFragment chatFragment = new ChatFragment();
                return chatFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return "Home";
            case 1:
                return "Status";
            case 2:
                return "Chat";
            default:
                return null;
        }
    }
}
