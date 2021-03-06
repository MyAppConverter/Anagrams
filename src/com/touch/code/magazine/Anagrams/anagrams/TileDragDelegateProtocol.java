package com.touch.code.magazine.Anagrams.anagrams;

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

import com.myappconverter.java.applicationservices.CGPoint;
import com.myappconverter.java.foundations.protocols.NSObject;
import com.touch.code.magazine.Anagrams.anagrams.impl.TileView;

public interface TileDragDelegateProtocol extends NSObject {
	/**
	 * Method : tileView <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public abstract void tileView(TileView tileView, CGPoint pt);
}
