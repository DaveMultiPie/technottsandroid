package com.technotts.technottinghamtwitter;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {
	
	private static final String TAG = "TechNotts";
	private TweetDisplayFragment tweetFragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			tweetFragment = new TweetDisplayFragment();
			getFragmentManager().beginTransaction()
					.add(R.id.container, tweetFragment).commit();
		}
		
		new DownloadTweetsTask().execute();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void onTwitterDownloaded(String jsonString) {
		Log.d(TAG, jsonString);
		tweetFragment.tweetsUpdated(jsonString);
	}

	private class DownloadTweetsTask extends AsyncTask<Void, Void, String> {

		@Override
		protected String doInBackground(Void... params) {
			String jsonString = null;
			try {
				URL url = new URL(
						"http://multipie-dev.appspot.com/twitter_downloader");
				HttpURLConnection urlConnection = (HttpURLConnection) url
						.openConnection();

				try {
					InputStream in = new BufferedInputStream(
							urlConnection.getInputStream());

					jsonString = convertStreamToString(in);
				} finally {
					urlConnection.disconnect();
				}
			} catch (Exception e) {
				Log.d(TAG, "Error downloading");
				e.printStackTrace();
			}
			return jsonString;
		}
		
		@Override
		protected void onPostExecute(String result) {
			if( result != null ) {
				onTwitterDownloaded(result);
			}
		}

		private String convertStreamToString(java.io.InputStream is) {
			java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
			return s.hasNext() ? s.next() : "";
		}
	}
}
