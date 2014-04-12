package com.android.heartbee;

import android.app.ActionBar;
import android.os.Bundle;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

	ViewPager viewPager;
	TabPagerAdapter tabAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final ActionBar actionBar = getActionBar();
		setContentView(R.layout.activity_main);
		tabAdapter = new TabPagerAdapter(this.getSupportFragmentManager());
		viewPager = (ViewPager) findViewById(R.id.viewPager);
		viewPager.setAdapter(tabAdapter);
	    actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	    ActionBar.TabListener tabListener = new ActionBar.TabListener() {
	        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
	            tab.select();
	        }
	        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {}
	        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft){}
	    };

	    // Add tabs to the action bar
	    for (int i = 0; i < TabPagerAdapter.NUM_TABS; i++) {
	    	Tab t = actionBar.newTab()
                    .setText(TabPagerAdapter.TAB_NAMES[i])
                    .setTabListener(tabListener);
	    	switch(i){
	    		case 0:
	    			tabAdapter.addFragment(new TestFragment(), i);	// CHANGE TO MainFragment
	    			break;
	    		case 1:
	    			tabAdapter.addFragment(new TestFragment(), i);	// CHANGE TO StatusFragment
	    			break;
	    		case 2:
	    			tabAdapter.addFragment(new TestFragment(), i);	// CHANGE TO CalendarFragment
	    			break;
	    		case 3:
	    			tabAdapter.addFragment(new FeedFragment(), i);	// Already FeedFragment :)
	    			break;
	    	}
	        actionBar.addTab(t);
	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
