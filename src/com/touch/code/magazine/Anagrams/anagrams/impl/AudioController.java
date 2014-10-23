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
import com.myappconverter.java.foundations.NSMutableDictionary;
import com.myappconverter.java.foundations.NSString;

public class AudioController extends
		com.touch.code.magazine.Anagrams.anagrams.AudioController {

	NSMutableDictionary audio;

	/**
	 * Method : preloadAudioEffects <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void preloadAudioEffects(NSArray effectFileNames) {
		this.audio = NSMutableDictionary.dictionaryWithCapacity(effectFileNames
				.count());
	}

	/**
	 * Method : playEffect <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void playEffect(NSString name) {
	}

}
