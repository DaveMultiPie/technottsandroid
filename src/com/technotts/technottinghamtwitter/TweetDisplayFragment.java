package com.technotts.technottinghamtwitter;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TweetDisplayFragment extends Fragment {

	private TextView mJsonTextView; 
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_tweet_display, container,
				false);
		
		mJsonTextView = (TextView) rootView.findViewById(R.id.tweet_json_view);
		
		return rootView;
	}
	
	public void tweetsUpdated(String tweetsJSON) {
		// You have a json string of tweets here
		// See ReadMe in github for hints.
		mJsonTextView.setText(tweetsJSON);
	}
}
