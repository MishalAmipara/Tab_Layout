package com.example.tab_layout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;
public class ViewPagerAdapter extends FragmentPagerAdapter
{
    List<Fragment> frag=new ArrayList<>();
    List<String> fragmentTitle = new ArrayList<>();

    public ViewPagerAdapter(MainActivity mainActivity, @NonNull FragmentManager fm)
    {
        super(fm);
    }

    public void addFragment(Fragment fragment, String title) {
        frag.add(fragment);
        fragmentTitle.add(title);
    }
    @NonNull
    @Override
    public Fragment getItem(int position)
    {
//        if(position==0)
//        {
//            frag=  new Fragment_One();
//        } else if (position==1) {
//            frag=  new Fragment_Two();
//        }
//        else if(position==2)
//        {
//            frag=  new Fragment_Three();
//        }
        return  frag.get(position);
    }

    @Override
    public int getCount()
    {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        if (position == 0)
//            fragmentTitle = "One";
//        else if (position == 1)
//            fragmentTitle = "Two";
//        else if (position == 2)
//            fragmentTitle = "Three";
        return fragmentTitle.get(position);
    }

}
