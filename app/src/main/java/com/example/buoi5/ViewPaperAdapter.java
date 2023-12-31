package com.example.buoi5;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPaperAdapter extends FragmentStateAdapter {

    public ViewPaperAdapter(@NonNull FragmentActivity fragmentActivity) { super(fragmentActivity);}
    @NonNull
    @Override
    public Fragment createFragment(int position){
        if(position == 0)
        {
            return new HomeFragment();
        }else {
            return new NewsFragment();
        }
    }
    @Override
    public int getItemCount()
    {
        return 2;
    }
}
