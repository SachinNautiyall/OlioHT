package com.example.olioht;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.olioht.fragments.AddLutemonFragment;
import com.example.olioht.fragments.BattlefieldFragment;
import com.example.olioht.fragments.HomeFragment;
import com.example.olioht.fragments.MoveLutemonFragment;
import com.example.olioht.fragments.StorageFragment;
import com.example.olioht.fragments.TrainFragment;

public class TabPagerAdapter extends FragmentStateAdapter {
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new StorageFragment();
            case 2:
                return new MoveLutemonFragment();
            case 3:
                return new BattlefieldFragment();
            case 4:
                return new TrainFragment();
            case 5:
                return new AddLutemonFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
