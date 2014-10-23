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

import com.myappconverter.java.applicationservices.CGGeometry;
import com.myappconverter.java.applicationservices.CGRect;
import com.myappconverter.java.foundations.NSCoder;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.uikit.UIImage;

public class TargetView extends
		com.touch.code.magazine.Anagrams.anagrams.TargetView {
	/**
	 * Method : init <!-- begin-user-doc -->
	 * 
	 * @return TargetView.
	 * @generated
	 */
	public TargetView init() {
		return null;
	}

	/**
	 * Method : initWithImage <!-- begin-user-doc -->
	 * 
	 * @return TargetView.
	 * @generated
	 */
	public TargetView initWithImage(UIImage image) {
		return null;
	}

	/**
	 * Method : initWithImage <!-- begin-user-doc -->
	 * 
	 * @return TargetView.
	 * @generated
	 */
	public TargetView initWithImage(UIImage image, UIImage highlightedImage) {
		return null;
	}

	/**
	 * Method : initWithCoder <!-- begin-user-doc -->
	 * 
	 * @return TargetView.
	 * @generated
	 */
	public TargetView initWithCoder(NSCoder aDecoder) {
		return null;
	}

	/**
	 * Method : initWithFrame <!-- begin-user-doc -->
	 * 
	 * @return TargetView.
	 * @generated
	 */
	public TargetView initWithFrame(CGRect frame) {
		return null;
	}

	/**
	 * Method : initWithLetter <!-- begin-user-doc -->
	 * 
	 * @return TargetView.
	 * @generated
	 */
	public TargetView initWithLetter(NSString letter, float sideLength) {
		UIImage img = UIImage.imageNamed(new NSString("slot"));
		super.initWithImage(img);
		if (this != null) {
			this.setIsMatched(false);
			float scale = sideLength / img.getSize().width;
			this.setFrame(CGGeometry.CGRectMake(0, 0, img.getSize().width
					* scale, img.getSize().height * scale));
			this.letter = letter;
		}
		return this;
	}

}
