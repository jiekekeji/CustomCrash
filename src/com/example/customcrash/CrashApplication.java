package com.example.customcrash;

import android.app.Application;

public class CrashApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		CustomCrashHandler mCustomCrashHandler = CustomCrashHandler
				.getInstance();
		mCustomCrashHandler.setCustomCrashHanler(getApplicationContext());
	}

}
