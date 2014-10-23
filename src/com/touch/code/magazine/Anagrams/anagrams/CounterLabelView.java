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

import com.myappconverter.java.uikit.UILabel;

public abstract class CounterLabelView extends UILabel {
	/**
	 * The cached value of the '<em>value</em>' property.
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	public int value;

	/**
	 * Returns the value of the '<em><b>value</b></em>' property.
	 * 
	 * @return int.
	 * @see #setValue(int)
	 * @generated
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * Sets the value of the '{@link <em>value</em>}' property.
	 * 
	 * @param int the new value of the '<em>value</em>' property.
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Method : countTo <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public abstract void countTo(int to, float t);
}
