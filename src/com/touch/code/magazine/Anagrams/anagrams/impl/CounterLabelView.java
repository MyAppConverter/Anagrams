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
import com.myappconverter.java.foundations.NSNumber;
import com.myappconverter.java.foundations.NSObject;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.uikit.UIColor;
import com.myappconverter.java.uikit.UIFont;

public class CounterLabelView extends
		com.touch.code.magazine.Anagrams.anagrams.CounterLabelView {

	int endValue;
	double delta;

	/**
	 * Method : labelWithFont <!-- begin-user-doc -->
	 * 
	 * @return CounterLabelView.
	 * @generated
	 */
	public static CounterLabelView labelWithFont(UIFont font, CGRect r, int v) {
		CounterLabelView label = (CounterLabelView) (new CounterLabelView())
				.initWithFrame(r);
		if (label != null) {
			label.setBackgroundColor(UIColor.clearColor());
			label.setFont(font);
			label.setValue(v);
		}
		return label;
	}

	/**
	 * Method : setValue <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void setValue(int value) {
		this.value = value;
		this.setText(NSString.stringWithFormat(new NSString("%i"),
				this.getValue()));
	}

	/**
	 * Method : updateValueBy <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void updateValueBy(NSNumber valueDelta) {
		this.setValue(this.getValue() + valueDelta.intValue());
		if (valueDelta.intValue() > 0) {
			if (this.getValue() > endValue) {
				this.setValue(endValue);
				return;
			}
		} else {
			if (this.getValue() < endValue) {
				this.setValue(endValue);
				return;
			}
		}
		this.performSelectorWithObjectAfterDelay(
				new com.myappconverter.java.foundations.SEL(new NSString(
						"updateValueBy")), valueDelta, delta);
	}

	/**
	 * Method : countTo <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void countTo(int to, float t) {
		delta = t / (Math.abs(to - this.getValue()) + 1);
		if (delta < 0.05f) {
			delta = 0.05f;
		}
		endValue = to;
		NSObject.cancelPreviousPerformRequestsWithTarget(this);
		if (to - this.getValue() > 0) {
			this.updateValueBy(NSNumber.numberWithInt(1));
		} else {
			this.updateValueBy(NSNumber.numberWithInt(-1));
		}
	}

}
