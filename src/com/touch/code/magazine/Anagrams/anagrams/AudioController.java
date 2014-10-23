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
import com.myappconverter.java.foundations.NSObject;
import com.myappconverter.java.foundations.NSString;

public abstract class AudioController extends NSObject {

	/**
	 * Method : playEffect <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public abstract void playEffect(NSString name);

	/**
	 * Method : preloadAudioEffects <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public abstract void preloadAudioEffects(NSArray effectFileNames);
}
