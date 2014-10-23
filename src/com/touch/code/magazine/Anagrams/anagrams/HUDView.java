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

import com.myappconverter.java.uikit.UIButton;
import com.myappconverter.java.uikit.UIView;
import com.touch.code.magazine.Anagrams.anagrams.impl.CounterLabelView;
import com.touch.code.magazine.Anagrams.anagrams.impl.StopwatchView;

public abstract class HUDView extends UIView {
	/**
	 * The cached value of the '<em>stopwatch</em>' property.
	 * 
	 * @see #getStopwatch()
	 * @generated
	 * @ordered
	 */
	public StopwatchView stopwatch;

	/**
	 * Returns the value of the '<em><b>stopwatch</b></em>' property.
	 * 
	 * @return StopwatchView.
	 * @see #setStopwatch(StopwatchView)
	 * @generated
	 */
	public StopwatchView getStopwatch() {
		return this.stopwatch;
	}

	/**
	 * Sets the value of the '{@link <em>stopwatch</em>}' property.
	 * 
	 * @param StopwatchView
	 *            the new value of the '<em>stopwatch</em>' property.
	 * @see #getStopwatch()
	 * @generated
	 */
	public void setStopwatch(StopwatchView stopwatch) {
		this.stopwatch = stopwatch;
	}

	/**
	 * The cached value of the '<em>gamePoints</em>' property.
	 * 
	 * @see #getGamePoints()
	 * @generated
	 * @ordered
	 */
	public CounterLabelView gamePoints;

	/**
	 * Returns the value of the '<em><b>gamePoints</b></em>' property.
	 * 
	 * @return CounterLabelView.
	 * @see #setGamePoints(CounterLabelView)
	 * @generated
	 */
	public CounterLabelView getGamePoints() {
		return this.gamePoints;
	}

	/**
	 * Sets the value of the '{@link <em>gamePoints</em>}' property.
	 * 
	 * @param CounterLabelView
	 *            the new value of the '<em>gamePoints</em>' property.
	 * @see #getGamePoints()
	 * @generated
	 */
	public void setGamePoints(CounterLabelView gamePoints) {
		this.gamePoints = gamePoints;
	}

	/**
	 * The cached value of the '<em>btnHelp</em>' property.
	 * 
	 * @see #getBtnHelp()
	 * @generated
	 * @ordered
	 */
	public UIButton btnHelp;

	/**
	 * Returns the value of the '<em><b>btnHelp</b></em>' property.
	 * 
	 * @return UIButton.
	 * @see #setBtnHelp(UIButton)
	 * @generated
	 */
	public UIButton getBtnHelp() {
		return this.btnHelp;
	}

	/**
	 * Sets the value of the '{@link <em>btnHelp</em>}' property.
	 * 
	 * @param UIButton
	 *            the new value of the '<em>btnHelp</em>' property.
	 * @see #getBtnHelp()
	 * @generated
	 */
	public void setBtnHelp(UIButton btnHelp) {
		this.btnHelp = btnHelp;
	}

}
