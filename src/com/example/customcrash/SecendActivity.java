package com.example.customcrash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecendActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secend_layout);
		
		ExitAppUtils.getInstance().addActivity(this);
		
		Button mButton = (Button) findViewById(R.id.button1);

		mButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SecendActivity.this,
						ThirdActivity.class);
				startActivity(intent);

			}
		});
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ExitAppUtils.getInstance().delActivity(this);
	}
	
	

}
