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
import com.myappconverter.java.applicationservices.CGPoint;
import com.myappconverter.java.applicationservices.CGRect;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.uikit.UIButton;
import com.myappconverter.java.uikit.UIColor;
import com.myappconverter.java.uikit.UIControl;
import com.myappconverter.java.uikit.UIEvent;
import com.myappconverter.java.uikit.UIFont;
import com.myappconverter.java.uikit.UIImage;
import com.myappconverter.java.uikit.UILabel;
import com.myappconverter.java.uikit.UIScreen;
import com.myappconverter.java.uikit.UIView;

public class HUDView extends com.touch.code.magazine.Anagrams.anagrams.HUDView {
	/**
	 * Method : viewWithRect <!-- begin-user-doc -->
	 * 
	 * @return HUDView.
	 * @generated
	 */
	public static HUDView viewWithRect(CGRect r) {
		HUDView hud = (HUDView) (new HUDView()).initWithFrame(r);
		hud.setUserInteractionEnabled(true);
		hud.setStopwatch((new StopwatchView()).initWithFrame(CGGeometry
				.CGRectMake(
						UIScreen.mainScreen().getBounds().size.height / 2 - 150,
						0, 300, 100)));
		hud.getStopwatch().setSeconds(0);
		hud.addSubview(hud.getStopwatch());
		UILabel pts = (UILabel) (new UILabel()).initWithFrame(CGGeometry
				.CGRectMake(
						UIScreen.mainScreen().getBounds().size.height - 340,
						30, 140, 70));
		pts.setBackgroundColor(UIColor.clearColor());
		pts.setFont(UIFont.fontWithNameSize(new NSString("comic_andy"), 62.0f));
		pts.setText(new NSString(" Points:"));
		hud.addSubview(pts);
		hud.setGamePoints(CounterLabelView.labelWithFont(UIFont
				.fontWithNameSize(new NSString("comic_andy"), 62.0f),
				CGGeometry.CGRectMake(
						UIScreen.mainScreen().getBounds().size.height - 200,
						30, 200, 70), 0));
		hud.getGamePoints().setTextColor(
				UIColor.colorWithRedGreenBlueAlpha(0.38f, 0.098f, 0.035f, 1));
		hud.addSubview(hud.getGamePoints());
		UIImage image = UIImage.imageNamed(new NSString("btn"));
		hud.setBtnHelp(UIButton
				.buttonWithType(UIButton.UIButtonType.UIButtonTypeCustom));
		hud.getBtnHelp().setTitleForState(new NSString("Hint!"),
				UIControl.UIControlStateNormal);
		hud.getBtnHelp()
				.getTitleLabel()
				.setFont(
						UIFont.fontWithNameSize(new NSString("comic_andy"),
								62.0f));
		hud.getBtnHelp().setBackgroundImageForState(image,
				UIControl.UIControlStateNormal);
		hud.getBtnHelp().setFrame(
				CGGeometry.CGRectMake(50, 30, image.getSize().width,
						image.getSize().height));
		hud.getBtnHelp().setAlpha(0.8f);
		hud.addSubview(hud.getBtnHelp());
		return hud;
	}

	/**
	 * Method : hitTest <!-- begin-user-doc -->
	 * 
	 * @return HUDView.
	 * @generated
	 */
	public UIView hitTestWithEvent(CGPoint point, UIEvent event) {
		UIView hitView = super.hitTestWithEvent(point, event);
		if (hitView instanceof UIButton) {
			return hitView;
		}
		return null;
	}

}
