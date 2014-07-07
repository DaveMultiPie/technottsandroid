package com.technotts.technottinghamtwitter;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TweetDisplayFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);
		return rootView;
	}
	
	public void tweetsUpdated(String tweetsJSON) {
		// You have JSONArray of tweets here
		// See ReadMe in github for hints.
	}
}
