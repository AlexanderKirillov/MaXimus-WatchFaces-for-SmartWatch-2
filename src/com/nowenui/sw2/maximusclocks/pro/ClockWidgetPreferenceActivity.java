package com.nowenui.sw2.maximusclocks.pro;


import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.nowenui.sw2.maximusclocks.pro.R;

public class ClockWidgetPreferenceActivity extends Activity {
	
	Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preference);
		context = this;

		Button about = (Button) findViewById(R.id.aboutBtn);
		about.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				AlertDialog.Builder alert = new AlertDialog.Builder(context);
				alert.setTitle(R.string.about);
				alert.setMessage(R.string.abouttext);
				alert.setNegativeButton("Ok",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int id) {
								dialog.cancel();
							}
						});

				alert.show();
			}
		});

		Button help = (Button) findViewById(R.id.helpBtn);
		help.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				AlertDialog.Builder alert = new AlertDialog.Builder(context);
				alert.setTitle(R.string.help);
				alert.setMessage(R.string.thanks);
				alert.setNegativeButton("Ok",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int id) {
								dialog.cancel();
							}
						});

				alert.show();
			}
		});

		Button email = (Button) findViewById(R.id.emailBtn);
		email.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri
						.parse("mailto:nowenui@bk.ru"));
				startActivity(intent);
			}
		});

	}

}