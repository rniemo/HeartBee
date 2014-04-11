package com.android.heartbee.status;

import android.R.id;
import android.R.layout;
import android.os.*;
import android.support.v4.app.*;
import android.view.*;
import android.widget.*;

public final class StatusFragment extends Fragment {
	public static final String ARG_OBJECT = "object";
	
	@Override
	public View onCreateView(
			LayoutInflater inflater,
			ViewGroup container,
			Bundle savedInstanceState
	)
	{
		View rootView = inflater.inflate(
				layout.fragment_collection_object,
				container,
				false
		);
		
		Bundle args = getArguments();
		((TextView)rootView.findViewById(android.R.id.text1)).setText(Integer.toString(args.getInt(ARG_OBJECT)));
		
		return null;
	}
	
//	public View onCreateView(LayoutInflater inflater, ViewGroup container)
//	{
//		super.onCreate(savedInstanceState);
//	}
}
