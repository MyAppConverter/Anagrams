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

import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.uikit.UIImageView;

public abstract class TileView extends UIImageView {
	/**
	 * The cached value of the '<em>letter</em>' property.
	 * 
	 * @see #getLetter()
	 * @generated
	 * @ordered
	 */
	public NSString letter;

	/**
	 * Returns the value of the '<em><b>letter</b></em>' property.
	 *
	 * @return NSString.
	 * @see #setLetter(NSString)
	 * @generated
	 */
	public NSString getLetter() {
		return this.letter;
	}

	/**
	 * Sets the value of the '{@link <em>letter</em>}' property.
	 * 
	 * @param NSString
	 *            the new value of the '<em>letter</em>' property.
	 * @see #getLetter()
	 * @generated
	 */
	public void setLetter(NSString letter) {
		this.letter = letter;
	}

	/**
	 * The cached value of the '<em>isMatched</em>' property.
	 * 
	 * @see #getIsMatched()
	 * @generated
	 * @ordered
	 */
	public boolean isMatched;

	/**
	 * Returns the value of the '<em><b>isMatched</b></em>' property.
	 *
	 * @return boolean.
	 * @see #setIsMatched(boolean)
	 * @generated
	 */
	public boolean getIsMatched() {
		return this.isMatched;
	}

	/**
	 * Sets the value of the '{@link <em>isMatched</em>}' property.
	 * 
	 * @param boolean the new value of the '<em>isMatched</em>' property.
	 * @see #getIsMatched()
	 * @generated
	 */
	public void setIsMatched(boolean isMatched) {
		this.isMatched = isMatched;
	}

	/**
	 * The cached value of the '<em>dragDelegate</em>' property.
	 * 
	 * @see #getDragDelegate()
	 * @generated
	 * @ordered
	 */
	public TileDragDelegateProtocol dragDelegate;

	/**
	 * Returns the value of the '<em><b>dragDelegate</b></em>' property.
	 *
	 * @return TileDragDelegateProtocol.
	 * @see #setDragDelegate(TileDragDelegateProtocol)
	 * @generated
	 */
	public TileDragDelegateProtocol getDragDelegate() {
		return this.dragDelegate;
	}

	/**
	 * Sets the value of the '{@link <em>dragDelegate</em>}' property.
	 * 
	 * @param TileDragDelegateProtocol
	 *            the new value of the '<em>dragDelegate</em>' property.
	 * @see #getDragDelegate()
	 * @generated
	 */
	public void setDragDelegate(TileDragDelegateProtocol dragDelegate) {
		this.dragDelegate = dragDelegate;
	}

	/**
	 * Method : initWithLetter <!-- begin-user-doc -->
	 * 
	 * @return TileView.
	 * @generated
	 */
	public abstract TileView initWithLetter(NSString letter, float sideLength);

	/**
	 * Method : randomize <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public abstract void randomize();
}
