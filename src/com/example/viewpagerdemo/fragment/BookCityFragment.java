package com.example.viewpagerdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpagerdemo.R;

public class BookCityFragment extends Fragment{
	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//		return super.onCreateView(inflater, container, savedInstanceState);
		View view=null;
		
		view =inflater.inflate(R.layout.cityfragment, container, false);
		
		return view;
	}
}
