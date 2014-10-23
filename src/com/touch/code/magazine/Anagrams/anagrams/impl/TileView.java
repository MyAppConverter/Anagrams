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

import com.myappconverter.java.appkit.NSText;
import com.myappconverter.java.applicationservices.CGGeometry;
import com.myappconverter.java.applicationservices.CGPoint;
import com.myappconverter.java.applicationservices.CGRect;
import com.myappconverter.java.applicationservices.CGSize;
import com.myappconverter.java.coregraphics.CGAffineTransform;
import com.myappconverter.java.foundations.ExpressNullable;
import com.myappconverter.java.foundations.NSCoder;
import com.myappconverter.java.foundations.NSSet;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.uikit.UIBezierPath;
import com.myappconverter.java.uikit.UIColor;
import com.myappconverter.java.uikit.UIEvent;
import com.myappconverter.java.uikit.UIFont;
import com.myappconverter.java.uikit.UIImage;
import com.myappconverter.java.uikit.UILabel;
import com.myappconverter.java.uikit.UITouch;
import com.myappconverter.mapping.utils.Math;

public class TileView extends
		com.touch.code.magazine.Anagrams.anagrams.TileView {

	int _xOffset, _yOffset;
	CGAffineTransform _tempTransform;

	/**
	 * Method : init <!-- begin-user-doc -->
	 * 
	 * @return TileView.
	 * @generated
	 */
	public TileView init() {
		return null;
	}

	/**
	 * Method : initWithImage <!-- begin-user-doc -->
	 * 
	 * @return TileView.
	 * @generated
	 */
	public TileView initWithImage(UIImage image) {
		return null;
	}

	/**
	 * Method : initWithImage <!-- begin-user-doc -->
	 * 
	 * @return TileView.
	 * @generated
	 */
	public TileView initWithImage(UIImage image, UIImage highlightedImage) {
		return null;
	}

	/**
	 * Method : initWithCoder <!-- begin-user-doc -->
	 * 
	 * @return TileView.
	 * @generated
	 */
	public TileView initWithCoder(NSCoder aDecoder) {
		return null;
	}

	/**
	 * Method : initWithFrame <!-- begin-user-doc -->
	 * 
	 * @return TileView.
	 * @generated
	 */
	public TileView initWithFrame(CGRect frame) {
		return null;
	}

	/**
	 * Method : initWithLetter <!-- begin-user-doc -->
	 * 
	 * @return TileView.
	 * @generated
	 */
	public TileView initWithLetter(NSString letter, float sideLength) {
		UIImage img = UIImage.imageNamed(new NSString("tile.png"));
		super.initWithImage(img);
		if (this != null) {
			float scale = sideLength / img.getSize().width;
			CGSize sizeTile = img.getSize();
			this.setFrame(CGGeometry.CGRectMake(0, 0, img.getSize().width
					* scale, img.getSize().height * scale));
			UILabel lblChar = (UILabel) (new UILabel()).initWithFrame(this
					.getBounds());
			lblChar.setTextAlignment(NSText.NSTextAlignmentCenter);
			lblChar.setTextColor(UIColor.whiteColor());
			lblChar.setBackgroundColor(UIColor.clearColor());
			lblChar.setText(letter.uppercaseString());
			lblChar.setFont(UIFont.fontWithNameSize(
					new NSString("Verdana-Bold"), 78.0f * scale));
			this.addSubview(lblChar);
			this.setIsMatched(false);
			this.letter = letter;
			this.setUserInteractionEnabled(true);
			this.layer().setShadowColor(UIColor.blackColor().CGColor());
			this.layer().setShadowOpacity(0);
			this.layer().setShadowOffset(CGGeometry.CGSizeMake(10.0f, 10.0f));
			this.layer().setShadowRadius(15.0f);
			this.layer().setMasksToBounds(false);
			UIBezierPath path = UIBezierPath.bezierPathWithRect(this
					.getBounds());
			this.layer().setShadowPath(path.getCGPath());
		}
		return this;
	}

	/**
	 * Method : randomize <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void randomize() {
		float rotation = (((float) Math.arc4random() % (50f - 0f + 1)) + 0f)
				/ (float) 100 - 0.2f;
		this.setTransform(CGAffineTransform
				.CGAffineTransformMakeRotation(0.09f));
		int yOffset = (Math.arc4random() % 10) - 10;
	}

	/**
	 * Method : touchesBegan <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void touchesBeganWithEvent(NSSet touches, UIEvent event) {
		CGPoint pt = ((UITouch) touches.anyObject()).locationInView(this
				.getSuperview());
		_xOffset = (int) (pt.x - this.getCenter().x);
		_yOffset = (int) (pt.y - this.getCenter().y);
		this.layer().setShadowOpacity(0.8f);
		_tempTransform = this.transform();
		this.getSuperview().bringSubviewToFront(this);
	}

	/**
	 * Method : touchesMoved <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void touchesMovedWithEvent(NSSet touches, UIEvent event) {
		CGPoint pt = ((UITouch) touches.anyObject()).locationInView(this
				.getSuperview());
		this.setCenter(CGGeometry.CGPointMake(pt.x - _xOffset, pt.y - _yOffset));
	}

	/**
	 * Method : touchesEnded <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void touchesEndedWithEvent(NSSet touches, UIEvent event) {
		this.touchesMovedWithEvent(touches, event);
		if (ExpressNullable.assertCondition(this.getDragDelegate())) {
			this.getDragDelegate().tileView(this, this.getCenter());
		}
	}

	/**
	 * Method : touchesCancelled <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void touchesCancelledWithEvent(NSSet touches, UIEvent event) {
		this.setTransform(_tempTransform);
		this.layer().setShadowOpacity(0.0f);
	}

}
