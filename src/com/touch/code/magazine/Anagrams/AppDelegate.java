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

package com.touch.code.magazine.Anagrams;

import android.app.Application;

import com.myappconverter.java.uikit.UIApplication;
import com.myappconverter.java.uikit.UIWindow;

public class AppDelegate extends Application {

	/**
	 * The cached value of the '<em>window</em>' property.
	 * 
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	public UIWindow window;

	/**
	 * Returns the value of the '<em><b>window</b></em>' property.
	 * 
	 * @return UIWindow.
	 * @see #setWindow(UIWindow)
	 * @generated
	 */
	public UIWindow getWindow() {
		return this.window;
	}

	/**
	 * Sets the value of the '{@link <em>window</em>}' property.
	 * 
	 * @param UIWindow
	 *            the new value of the '<em>window</em>' property.
	 * @see #getWindow()
	 * @generated
	 */
	public void setWindow(UIWindow window) {
		this.window = window;
	}

	@Override
	public void onCreate() {
		super.onCreate();

	}

	@Override
	public void onTerminate() {
		super.onTerminate();

	}

	/**
	 * Method : applicationWillResignActive <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void applicationWillResignActive(UIApplication application) {
	}

	/**
	 * Method : applicationDidEnterBackground <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void applicationDidEnterBackground(UIApplication application) {
	}

	/**
	 * Method : applicationWillEnterForeground <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void applicationWillEnterForeground(UIApplication application) {
	}

	/**
	 * Method : applicationDidBecomeActive <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void applicationDidBecomeActive(UIApplication application) {
	}

}
