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

import com.myappconverter.java.foundations.NSObject;
import com.myappconverter.java.uikit.UIView;
import com.touch.code.magazine.Anagrams.anagrams.impl.AudioController;
import com.touch.code.magazine.Anagrams.anagrams.impl.GameData;
import com.touch.code.magazine.Anagrams.anagrams.impl.HUDView;
import com.touch.code.magazine.Anagrams.anagrams.impl.Level;

public abstract class GameController extends NSObject implements
		com.touch.code.magazine.Anagrams.anagrams.TileDragDelegateProtocol {
	/**
	 * The cached value of the '<em>gameView</em>' property.
	 * 
	 * @see #getGameView()
	 * @generated
	 * @ordered
	 */
	public UIView gameView;

	/**
	 * Returns the value of the '<em><b>gameView</b></em>' property.
	 *
	 * @return UIView.
	 * @see #setGameView(UIView)
	 * @generated
	 */
	public UIView getGameView() {
		return this.gameView;
	}

	/**
	 * Sets the value of the '{@link <em>gameView</em>}' property.
	 * 
	 * @param UIView
	 *            the new value of the '<em>gameView</em>' property.
	 * @see #getGameView()
	 * @generated
	 */
	public void setGameView(UIView gameView) {
		this.gameView = gameView;
	}

	/**
	 * The cached value of the '<em>level</em>' property.
	 * 
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	public Level level;

	/**
	 * Returns the value of the '<em><b>level</b></em>' property.
	 *
	 * @return Level.
	 * @see #setLevel(Level)
	 * @generated
	 */
	public Level getLevel() {
		return this.level;
	}

	/**
	 * Sets the value of the '{@link <em>level</em>}' property.
	 * 
	 * @param Level
	 *            the new value of the '<em>level</em>' property.
	 * @see #getLevel()
	 * @generated
	 */
	public void setLevel(Level level) {
		this.level = level;
	}

	/**
	 * The cached value of the '<em>hud</em>' property.
	 * 
	 * @see #getHud()
	 * @generated
	 * @ordered
	 */
	public HUDView hud;

	/**
	 * Returns the value of the '<em><b>hud</b></em>' property.
	 *
	 * @return HUDView.
	 * @see #setHud(HUDView)
	 * @generated
	 */
	public HUDView getHud() {
		return this.hud;
	}

	/**
	 * Sets the value of the '{@link <em>hud</em>}' property.
	 * 
	 * @param HUDView
	 *            the new value of the '<em>hud</em>' property.
	 * @see #getHud()
	 * @generated
	 */
	public void setHud(HUDView hud) {
		this.hud = hud;
	}

	/**
	 * The cached value of the '<em>data</em>' property.
	 * 
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	public GameData data;

	/**
	 * Returns the value of the '<em><b>data</b></em>' property.
	 *
	 * @return GameData.
	 * @see #setData(GameData)
	 * @generated
	 */
	public GameData getData() {
		return this.data;
	}

	/**
	 * Sets the value of the '{@link <em>data</em>}' property.
	 * 
	 * @param GameData
	 *            the new value of the '<em>data</em>' property.
	 * @see #getData()
	 * @generated
	 */
	public void setData(GameData data) {
		this.data = data;
	}

	/**
	 * The cached value of the '<em>audioController</em>' property.
	 * 
	 * @see #getAudioController()
	 * @generated
	 * @ordered
	 */
	public AudioController audioController;

	/**
	 * Returns the value of the '<em><b>audioController</b></em>' property.
	 *
	 * @return AudioController.
	 * @see #setAudioController(AudioController)
	 * @generated
	 */
	public AudioController getAudioController() {
		return this.audioController;
	}

	/**
	 * Sets the value of the '{@link <em>audioController</em>}' property.
	 * 
	 * @param AudioController
	 *            the new value of the '<em>audioController</em>' property.
	 * @see #getAudioController()
	 * @generated
	 */
	public void setAudioController(AudioController audioController) {
		this.audioController = audioController;
	}

	/**
	 * The cached value of the '<em>onAnagramSolved</em>' property.
	 * 
	 * @see #getOnAnagramSolved()
	 * @generated
	 * @ordered
	 */
	public CallbackBlock onAnagramSolved;

	/**
	 * Returns the value of the '<em><b>onAnagramSolved</b></em>' property.
	 *
	 * @return CallbackBlock.
	 * @see #setOnAnagramSolved(CallbackBlock)
	 * @generated
	 */
	public CallbackBlock getOnAnagramSolved() {
		return this.onAnagramSolved;
	}

	/**
	 * Sets the value of the '{@link <em>onAnagramSolved</em>}' property.
	 * 
	 * @param CallbackBlock
	 *            the new value of the '<em>onAnagramSolved</em>' property.
	 * @see #getOnAnagramSolved()
	 * @generated
	 */
	public void setOnAnagramSolved(CallbackBlock onAnagramSolved) {
		this.onAnagramSolved = onAnagramSolved;
	}

	/**
	 * Method : dealRandomAnagram <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public abstract void dealRandomAnagram();
}
