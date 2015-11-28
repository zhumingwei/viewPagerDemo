package com.example.viewpagerdemo.fragment;

import com.example.viewpagerdemo.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BookShelfFragment extends Fragment {

	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = null;

		view = inflater.inflate(R.layout.shelffragment, container, false);

		return view;
	}

}
