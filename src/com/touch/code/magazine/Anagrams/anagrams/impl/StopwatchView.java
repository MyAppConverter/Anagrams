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
 * @date : Sep, 29 2014 - 13:31:57
 */

package com.touch.code.magazine.Anagrams.anagrams.impl;

import com.myappconverter.java.applicationservices.CGRect;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.uikit.UIColor;
import com.myappconverter.java.uikit.UIFont;

public class StopwatchView extends
		com.touch.code.magazine.Anagrams.anagrams.StopwatchView {
	/**
	 * Method : initWithFrame <!-- begin-user-doc -->
	 * 
	 * @return StopwatchView.
	 * @generated
	 */
	public StopwatchView initWithFrame(CGRect frame) {
		super.initWithFrame(frame);
		if (com.myappconverter.java.foundations.ExpressNullable
				.assertCondition(this)) {
			this.setBackgroundColor(UIColor.clearColor());
			this.setFont(UIFont.fontWithNameSize(new NSString("comic_andy"),
					120.0f));
		}
		return this;
	}

	/**
	 * Method : setSeconds <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void setSeconds(int seconds) {
		this.setText(NSString.stringWithFormat(new NSString(" %02.02f : %02i"),
				com.myappconverter.mapping.utils.Math.round(seconds / 60),
				seconds % 60));
	}

}
