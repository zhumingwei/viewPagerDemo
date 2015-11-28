package com.example.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MainFragmentPagerAdapter extends FragmentStatePagerAdapter {

	private final MainActivity MyOnPageChangeAdapter;
	private MainTabFragEnum[] mainTabFrags;
	private Fragment[] fragments;

	public MainFragmentPagerAdapter(MainActivity mainActivity,
			FragmentManager fm, MainTabFragEnum[] mainTabFrags) {
		super(fm);
		MyOnPageChangeAdapter = mainActivity;
		this.mainTabFrags = mainTabFrags;
		fragments = new Fragment[mainTabFrags.length];
	}

	public Fragment getFragment(int index) {
		return fragments[index];
	}

	@Override
	public int getCount() {
		return mainTabFrags.length;
	}

	@Override
	public Fragment getItem(int index) {
		fragments[index] = mainTabFrags[index].createFrag();
		return fragments[index];
	}
}
