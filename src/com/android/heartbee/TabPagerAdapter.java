package com.android.heartbee;

import android.app.ActionBar.Tab;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter{

	public final static int NUM_TABS = 4;
	public final static String[] TAB_NAMES = {"Main", "Status", "Calendar", "Feed"};
	Fragment[] fragments = new Fragment[NUM_TABS];
	
	public TabPagerAdapter(FragmentManager fm) {
		super(fm);
		
	}
	
	public void addFragment(Fragment frag, int position){
		fragments[position] = frag;
	}

	@Override
	public Fragment getItem(int position) {
		return fragments[position];
	}

	@Override
	public int getCount() {
		return NUM_TABS;
	}


}
