/*
 * Copyright (c) 2014 MyAppConverter
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MyAppConverter License v1.0
 * which accompanies this distribution, and is available at
 * http://www.myappconverter.com/legal/epl-v1.html
 *
 * Contributors:
 *    MyAppConverter Core Team - initial API and implementation
 * @date : Sep, 29 2014 - 13:31:56
 */

package com.touch.code.magazine.Anagrams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;

import com.myappconverter.java.uikit.UIWindow;
import com.myappconverter.mapping.utils.GenericMainContext;

public class GenericCustomActivity extends Activity {

	ViewController tgVC;

	protected void displayTransformationData() {
		TextView slidingContentTxt = (TextView) findViewById(R.id.slidecontent);
		AssetManager assetManager = getAssets();
		InputStream inputStream = null;
		try {
			inputStream = assetManager.open("transformation-data.log");
		} catch (IOException e) {
			Log.e("tag", e.getMessage());
		}

		slidingContentTxt.setText(readTextFile(inputStream));
	}

	private String readTextFile(InputStream inputStream) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		byte buf[] = new byte[1024];
		int len;
		try {
			while ((len = inputStream.read(buf)) != -1) {
				outputStream.write(buf, 0, len);
			}
			outputStream.close();
			inputStream.close();
		} catch (IOException e) {

		}
		return outputStream.toString();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		GenericMainContext.MAIN_CONTEXT_ACTIVITY = this;
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		tgVC = (ViewController) new ViewController().init();
		tgVC.viewDidLoad();
		UIWindow window = new UIWindow();
		window.setRootViewController(tgVC);
		tgVC.getWrappedActivity().setRequestedOrientation(
				ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		setContentView(tgVC.view().getWrappedView());

	}

	@Override
	protected void onResume() {
		super.onResume();
		tgVC.viewDidAppear(true);

	}

}
