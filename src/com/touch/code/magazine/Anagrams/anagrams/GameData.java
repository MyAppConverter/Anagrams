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

import com.myappconverter.java.foundations.NSObject;

public abstract class GameData extends NSObject {
	/**
	 * The cached value of the '<em>points</em>' property.
	 * 
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	public int points;

	/**
	 * Returns the value of the '<em><b>points</b></em>' property.
	 * 
	 * @return int.
	 * @see #setPoints(int)
	 * @generated
	 */
	public int getPoints() {
		return this.points;
	}
	/**
	 * Sets the value of the '{@link <em>points</em>}' property.
	 * 
	 * @param int the new value of the '<em>points</em>' property.
	 * @see #getPoints()
	 * @generated
	 */
	public void setPoints(int points) {
		this.points = points;
	}

}
