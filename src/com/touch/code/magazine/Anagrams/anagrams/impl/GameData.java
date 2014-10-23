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

import com.myappconverter.java.foundations.NSObjCRuntime;

public class GameData extends
		com.touch.code.magazine.Anagrams.anagrams.GameData {

	/**
	 * Method : setPoints <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void setPoints(int points) {
		this.points = (int) NSObjCRuntime.MAX(points, 0);
	}
}
