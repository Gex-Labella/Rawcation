package com.example.chat_app.Adapters;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;

import com.example.chat_app.Fragments.CallFragment;
import com.example.chat_app.Fragments.ChatsFragment;
import com.example.chat_app.Fragments.StatusFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    private static final int NUM_TABS = 3;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ChatsFragment();
            case 1:
                return new StatusFragment();
            case 3:
                return new CallFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_TABS;
    }
}