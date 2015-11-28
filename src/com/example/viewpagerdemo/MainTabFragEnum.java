package com.example.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.widget.RadioGroup;

import com.example.viewpagerdemo.fragment.BookCityFragment;
import com.example.viewpagerdemo.fragment.BookShelfFragment;
import com.example.viewpagerdemo.fragment.PaihangFragment;
import com.example.viewpagerdemo.fragment.PersonCenterFragment;

public enum MainTabFragEnum {


	bookshelf(0) {
		@Override
		public Fragment createFrag() {

			Fragment frag = new BookShelfFragment();
			setFrag(frag);

			return frag;
		}

	}, // 书架

	bookcify(1) {
		@Override
		public Fragment createFrag() {

			Fragment frag = new BookCityFragment();
			setFrag(frag);

			return frag;
		}

	}, // 书城

	paihang(2) {
		@Override
		public Fragment createFrag() {

			Fragment frag = new PaihangFragment();
			setFrag(frag);

			return frag;
		}

	},//排行

	person(3) {
		@Override
		public Fragment createFrag() {

			Fragment frag = new PersonCenterFragment();
			setFrag(frag);

			return frag;
		}

	}, // 个人中心

	;

	/* 排序 */
	private int index;
	private Fragment frag;

	private MainTabFragEnum(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public Fragment getFrag() {
		return frag;
	}

	public void setFrag(Fragment frag) {
		this.frag = frag;
	}

	/**
	 * 得到当前片段实例
	 * 
	 * @return
	 */
	public abstract Fragment createFrag();

	/**
	 * 片段跳转
	 * 
	 * @return
	 */
	public void goTo(RadioGroup tabs) {
		tabs.getChildAt(getIndex()).performClick();
	}

	/**
	 * 通过索引得到实例
	 * 
	 * @param index
	 * @return
	 */
	public static MainTabFragEnum getByIndex(int index) {
		return MainTabFragEnum.values()[index];
	}

}
