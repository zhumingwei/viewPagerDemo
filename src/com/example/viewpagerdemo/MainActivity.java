package com.example.viewpagerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.WindowManager;

import com.tools.commonlibs.tools.LogUtils;

public class MainActivity extends FragmentActivity{

	private ViewPager vpMain;
    private UITabBottom bottonTools;
    private MainFragmentPagerAdapter pagerAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initView();
	}
	
	private void initView() {
		getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		vpMain=(ViewPager) findViewById(R.id.main_content);
		bottonTools=(UITabBottom) findViewById(R.id.main_tools_bottom);
		pagerAdapter=new MainFragmentPagerAdapter(this, getSupportFragmentManager(), MainTabFragEnum.values());
		
		vpMain.setAdapter(pagerAdapter);
		bottonTools.setmViewPager(vpMain);
		vpMain.addOnPageChangeListener(new OnPageChangeListener() {
			@Override
			public void onPageSelected(int pageIndex) {

			}
			
			@Override
			public void onPageScrolled(final int pageIndex, float percent, int offset) {
				int currentIndex = vpMain.getCurrentItem();
				if (Math.abs(currentIndex - pageIndex) <= 1) {
					bottonTools.scroll(pageIndex, percent);
				}
			}
			
			@Override
			public void onPageScrollStateChanged(int status) {
				LogUtils.debug("status =" + status);
				System.out.println("onPageScrollStateChanged=="+status);
				if(status==0){
					bottonTools.selectTab(vpMain.getCurrentItem());
				}
			}
		});
	}

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		setIntent(intent);
		initTabs();
	}
	
	//当有请求来时，初始化tab
	private void initTabs(){
		
	}
}
