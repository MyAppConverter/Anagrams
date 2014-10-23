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

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSBundle;
import com.myappconverter.java.foundations.NSDictionary;
import com.myappconverter.java.foundations.NSNumber;
import com.myappconverter.java.foundations.NSString;

public class Level extends com.touch.code.magazine.Anagrams.anagrams.Level {
	/**
	 * Method : levelWithNum <!-- begin-user-doc -->
	 * 
	 * @return Level.
	 * @generated
	 */
	public static Level levelWithNum(int levelNum) {
		NSString fileName = NSString.stringWithFormat(new NSString(
				"level%i.plist"), levelNum);
		NSString levelPath = NSBundle.mainBundle().resourcePath()
				.stringByAppendingPathComponent(fileName);
		NSDictionary levelDict = NSDictionary
				.dictionaryWithContentsOfFile(levelPath);
		Level l = (Level) (new Level()).init();
		l.setPointsPerTile(((NSNumber) levelDict.objectForKey(new NSString(
				"pointsPerTile"))).intValue());
		l.setAnagrams((NSArray) levelDict
				.objectForKey(new NSString("anagrams")));
		l.setTimeToSolve(((NSNumber) levelDict.objectForKey(new NSString(
				"timeToSolve"))).intValue());
		return l;
	}
}
