package com.android.heartbee;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FeedFragment extends Fragment{
	
	Camera camera;

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.feed_fragment, container, false);
		camera = Camera.open();
		return rootView;
	}
	
	private boolean hasCamera(Context ctx) {
		return ctx.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
	}
	
}
