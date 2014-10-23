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
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.quartzcore.CAEmitterCell;
import com.myappconverter.java.quartzcore.CAEmitterLayer;
import com.myappconverter.java.uikit.UIImage;

public class StarDustView extends
		com.touch.code.magazine.Anagrams.anagrams.StarDustView {

	CAEmitterLayer _emitter;

	/**
	 * Method : layerClass <!-- begin-user-doc -->
	 * 
	 * @return Class.
	 * @generated
	 */
	public static Class layerClass() {
		return CAEmitterLayer.__class();
	}

	/**
	 * Method : initWithFrame <!-- begin-user-doc -->
	 * 
	 * @return StarDustView.
	 * @generated
	 */
	public StarDustView initWithFrame(CGRect frame) {
		super.initWithFrame(frame);
		if (com.myappconverter.java.foundations.ExpressNullable
				.assertCondition(this)) {
			_emitter = (CAEmitterLayer) this.layer();
			_emitter.setEmitterPosition(CGGeometry.CGPointMake(
					this.getBounds().size.width / 2,
					this.getBounds().size.height / 2));
			_emitter.setEmitterSize(this.getBounds().size);
			_emitter.setEmitterMode(CAEmitterLayer.kCAEmitterLayerAdditive);
			_emitter.setEmitterShape(CAEmitterLayer.kCAEmitterLayerRectangle);
		}
		return this;
	}

	/**
	 * Method : didMoveToSuperview <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void didMoveToSuperview() {
		super.didMoveToSuperview();
		if (this.getSuperview() == null) {
			return;
		}
		UIImage texture = UIImage.imageNamed(new NSString("particle.png"));
		CAEmitterCell emitterCell = (CAEmitterCell) CAEmitterCell.emitterCell();
		emitterCell.setContents(texture.CGImage());
		emitterCell.setName(new NSString("cell"));
		emitterCell.setBirthRate(200);
		emitterCell.setLifetime(1.5f);
		emitterCell.setBlueRange(0.33f);
		emitterCell.setBlueSpeed(-0.33f);
		emitterCell.setYAcceleration(100);
		emitterCell.setXAcceleration(-200);
		emitterCell.setVelocity(100);
		emitterCell.setVelocityRange(40);
		emitterCell.setScaleRange(0.5f);
		emitterCell.setScaleSpeed(-0.2f);
		emitterCell.setEmissionRange(3.141593f * 2);
		_emitter.setEmitterCells(NSArray.arrayWithObject(emitterCell));
	}

	/**
	 * Method : disableEmitterCell <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void disableEmitterCell() {
	}

}
