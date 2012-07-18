package com.sender;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button send = (Button) findViewById(R.id.send);
		send.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				try {

					GMailSender sender = new GMailSender("email@abc.com",
							"pass12345");
					sender.sendMail("This is Subject", "This is Body",
							"zulf2006@gmail.com", "zulf2006@gmail.com");
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

	}
}