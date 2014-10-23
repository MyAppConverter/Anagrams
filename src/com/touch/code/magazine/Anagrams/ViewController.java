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
 * @date : Sep, 29 2014 - 13:31:56
 */

package com.touch.code.magazine.Anagrams;

import com.myappconverter.java.applicationservices.CGGeometry;
import com.myappconverter.java.foundations.NSCoder;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.uikit.UIActionSheet;
import com.myappconverter.java.uikit.UIColor;
import com.myappconverter.java.uikit.UIScreen;
import com.myappconverter.java.uikit.UIView;
import com.myappconverter.java.uikit.UIViewController;
import com.myappconverter.java.uikit.protocols.UIActionSheetDelegate;
import com.touch.code.magazine.Anagrams.anagrams.CallbackBlock;
import com.touch.code.magazine.Anagrams.anagrams.impl.GameController;
import com.touch.code.magazine.Anagrams.anagrams.impl.HUDView;
import com.touch.code.magazine.Anagrams.anagrams.impl.Level;

public class ViewController extends UIViewController implements
		UIActionSheetDelegate {
	/**
	 * The cached value of the '<em>controller</em>' property.
	 * 
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	public GameController controller;

	/**
	 * Returns the value of the '<em><b>controller</b></em>' property.
	 * 
	 * @return GameController.
	 * @see #setController(GameController)
	 * @generated
	 */
	public GameController getController() {
		return this.controller;
	}

	/**
	 * Sets the value of the '{@link <em>controller</em>}' property.
	 * 
	 * @param GameController
	 *            the new value of the '<em>controller</em>' property.
	 * @see #getController()
	 * @generated
	 */
	public void setController(GameController controller) {
		this.controller = controller;
	}

	public ViewController initWithCoder(NSCoder decoder) {
		super.initWithCoder(decoder);
		if (this != null) {
			this.controller = new GameController().init();
		}
		return this;
	}

	public ViewController init() {
		super.init();
		if (this != null) {
			this.controller = new GameController().init();
		}
		return this;
	}

	@Override
	public void viewDidLoad() {
		super.viewDidLoad();
		UIView gameLayer = (new UIView()).initWithFrame(CGGeometry.CGRectMake(
				0, 0, UIScreen.mainScreen().getBounds().size.height, UIScreen
						.mainScreen().getBounds().size.width));
		gameLayer.setBackgroundColor(UIColor.clearColor());
		this.getView().addSubview(gameLayer);
		this.getController().setGameView(gameLayer);
		HUDView hudView = HUDView.viewWithRect(CGGeometry.CGRectMake(0, 0,
				UIScreen.mainScreen().getBounds().size.height, UIScreen
						.mainScreen().getBounds().size.width));
		this.getView().addSubview(hudView);
		this.getController().setHud(hudView);
		final ViewController weakSelf = this;
		this.getController().setOnAnagramSolved(new CallbackBlock() {
			@Override
			public void perform() {
				weakSelf.showLevelMenu();
			}
		});
	}

	@Override
	public void viewDidAppear(boolean animated) {
		super.viewDidAppear(animated);
		this.showLevelMenu();
	}

	/**
	 * Method : showLevelMenu <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void showLevelMenu() {
		UIActionSheet action = ((UIActionSheet) new UIActionSheet())
				.initWithTitleDelegateCancelButtonTitleDestructiveButtonTitleOtherButtonTitles(
						new NSString("Play @ difficulty level:"), this, null,
						null, new NSString("Easy-peasy"), new NSString(
								"Challenge accepted"), new NSString(
								"I'm totally hard-core"), null);
		action.showInView(this.getView());
	}

	@Override
	public void actionSheetClickedButtonAtIndex(UIActionSheet actionSheet,
			int buttonIndex) {

	}

	@Override
	public void actionSheetDidDismissWithButtonIndex(UIActionSheet actionSheet,
			int buttonIndex) {

	}

	@Override
	public void actionSheetWillDismissWithButtonIndex(
			UIActionSheet actionSheet, int buttonIndex) {
		if (buttonIndex == -1) {
			this.showLevelMenu();
			return;
		}
		int levelNum = buttonIndex + 1;
		this.controller.level = Level.levelWithNum(levelNum);
		this.controller.dealRandomAnagram();

	}

	@Override
	public void actionSheetCancel(UIActionSheet actionSheet) {

	}

	@Override
	public void didPresentActionSheet(UIActionSheet actionSheet) {

	}

	@Override
	public void willPresentActionSheet(UIActionSheet actionSheet) {

	}

}
