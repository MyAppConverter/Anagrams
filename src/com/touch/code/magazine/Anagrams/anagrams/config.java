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

package com.touch.code.magazine.Anagrams.anagrams;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.uikit.UIFont;
import com.myappconverter.java.uikit.UIScreen;

public class config {

	public static float kScreenWidth = UIScreen.mainScreen().bounds.size.height;
	public static float kScreenHeight = UIScreen.mainScreen().bounds.size.width;

	public static float kTileMargin = 20;
	public static UIFont kFontHUD = UIFont.fontWithNameSize(new NSString(
			"comic_andy"), 62.0f);
	public static UIFont kFontHUDBig = UIFont.fontWithNameSize(new NSString(
			"comic_andy"), 120.0f);

	public static NSString kSoundDing = new NSString("ding.mp3");
	public static NSString kSoundWrong = new NSString("wrong.mp3");
	public static NSString kSoundWin = new NSString("win.mp3");
	
	public static int configed = 1;

	public static NSArray<NSString> kAudioEffectFiles = NSArray
			.arrayWithObjects(kSoundDing, kSoundWrong, kSoundWin);

	/**
	 * Method : ad2deg <!-- begin-user-doc -->
	 * 
	 * @return float.
	 * @generated
	 */
	public static float ad2deg(float x) {
		return (float) (x * 180 / Math.PI);
	}

	/**
	 * Method : deg2rad <!-- begin-user-doc -->
	 * 
	 * @return float.
	 * @generated
	 */
	public static float deg2rad(float x) {
		return (float) (x * Math.PI / 180);
	}

	/**
	 * Method : randomf <!-- begin-user-doc -->
	 * 
	 * @return float.
	 * @generated
	 */
	public static float randomf(float minX, float maxX) {
		return ((float) (com.myappconverter.mapping.utils.Math.arc4random() % (maxX
				- minX + 1)) + (float) minX);
	}


}
