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
import com.myappconverter.java.foundations.ExpressNullable;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSMutableArray;
import com.myappconverter.java.foundations.NSObjCRuntime;
import com.myappconverter.java.foundations.NSRange;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSTimer;
import com.myappconverter.java.uikit.UIControl;
import com.myappconverter.java.uikit.UIScreen;
import com.myappconverter.java.uikit.UIView;
import com.myappconverter.java.uikit.UIView.UIViewBlock;
import com.myappconverter.mapping.utils.Math;
import com.touch.code.magazine.Anagrams.anagrams.config;

public class GameController extends
		com.touch.code.magazine.Anagrams.anagrams.GameController {

	// tile lists
	NSMutableArray _tiles;
	NSMutableArray _targets;

	// stopwatch variables
	int _secondsLeft;
	NSTimer _timer;

	/**
	 * Method : init <!-- begin-user-doc -->
	 * 
	 * @return GameController.
	 * @generated
	 */
	public GameController init() {
		super.init();
		if (this != null) {
			this.setData((GameData) (new GameData()).init());
			this.setAudioController((AudioController) (new AudioController())
					.init());
			this.getAudioController().preloadAudioEffects(
					config.kAudioEffectFiles);
		}
		return this;
	}

	/**
	 * Method : dealRandomAnagram <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void dealRandomAnagram() {
		int randomIndex = Math.arc4random()
				% this.getLevel().getAnagrams().count();
		NSArray anaPair = (NSArray) this.getLevel().getAnagrams()
				.objectAtIndex(randomIndex);
		NSString anagram1 = (NSString) anaPair.objectAtIndex(0);
		NSString anagram2 = (NSString) anaPair.objectAtIndex(1);
		int ana1len = anagram1.length();
		int ana2len = anagram2.length();
		double maxx = NSObjCRuntime.MAX(ana1len, ana2len);
		float tileSide = Math.ceilf(UIScreen.mainScreen().bounds.size.height
				* 0.9f / (float) NSObjCRuntime.MAX(ana1len, ana2len)) - 20;
		float xOffset = (float) ((UIScreen.mainScreen().bounds.size.height - NSObjCRuntime
				.MAX(ana1len, ana2len) * (tileSide + 20)) / 2);
		xOffset += tileSide / 2;
		_targets = NSMutableArray.arrayWithCapacity(ana2len);
		for (int i = 0; i < ana2len; i++) {
			NSString letter = anagram2.substringWithRange(NSRange.NSMakeRange(
					i, 1));
			if (!ExpressNullable.assertCondition(letter
					.isEqualToString(new NSString(" ")))) {
				TargetView target = (new TargetView()).initWithLetter(letter,
						tileSide);
				target.setCenter(CGGeometry.CGPointMake(xOffset + i
						* (tileSide + 20),
						UIScreen.mainScreen().getBounds().size.width / 4));
				this.getGameView().addSubview(target);
				_targets.addObject(target);
			}
		}
		_tiles = NSMutableArray.arrayWithCapacity(ana1len);
		for (int i = 0; i < ana1len; i++) {
			NSString letter = anagram1.substringWithRange(NSRange.NSMakeRange(
					i, 1));
			if (!com.myappconverter.java.foundations.ExpressNullable
					.assertCondition(letter.isEqualToString(new NSString(" ")))) {
				TileView tile = (new TileView()).initWithLetter(letter,
						tileSide);
				tile.setCenter(CGGeometry
						.CGPointMake(
								xOffset + i * (tileSide + 20),
								UIScreen.mainScreen().getBounds().size.width / 4 * 3 - 150));
				tile.randomize();
				tile.setDragDelegate(this);
				this.getGameView().addSubview(tile);
				_tiles.addObject(tile);
			}
		}
		this.startStopwatch();
	}

	/**
	 * Method : tileView <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void tileView(TileView tileView, CGPoint pt) {
		TargetView targetView = null;
		for (Object tvInter : _targets) {
			TargetView tv = (TargetView) tvInter;
			if (CGGeometry.CGRectContainsPoint(tv.getFrame(), pt)) {
				targetView = tv;
				break;
			}
		}
		if (targetView != null) {
			if (ExpressNullable.assertCondition(targetView.getLetter()
					.isEqualToString(tileView.getLetter()))) {
				this.placeTile(tileView, targetView);
				this.getAudioController().playEffect(new NSString("ding.mp3"));
				this.getData().setPoints(
						this.getData().getPoints()
								+ this.getLevel().getPointsPerTile());
				this.getHud().getGamePoints()
						.countTo(this.getData().getPoints(), 1.5f);
				this.checkForSuccess();
			} else {
				final UIView fTileView = tileView;
				tileView.randomize();
				UIView.animateWithDurationDelayOptionsAnimationsCompletion(
						0.35f,
						0.0f,
						UIView.UIViewAnimationOptions.UIViewAnimationOptionCurveEaseOut,
						new UIViewBlock() {

							@Override
							public void perform() {
								fTileView.setCenterForAnimation(CGGeometry.CGPointMake(
										fTileView.center().x
												+ (((float) Math.arc4random() % (20 - (-20) + 1)) - 20f),
										fTileView.center().y
												+ (((float) Math.arc4random() % (30 - 20 + 1)) + 20f)));
								fTileView.commitAnimation(0.35f, this, null);
							}

							@Override
							public void perform(boolean finished) {

							}
						}, null);
				this.getAudioController().playEffect(new NSString("wrong.mp3"));
				this.getData().setPoints(
						this.getData().getPoints()
								- this.getLevel().getPointsPerTile() / 2);
				this.getHud().getGamePoints()
						.countTo(this.getData().getPoints(), 0.75f);
			}
		}
	}

	/**
	 * Method : placeTile <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void placeTile(final TileView tileView, final TargetView targetView) {
		targetView.setIsMatched(true);
		tileView.setIsMatched(true);
		tileView.setUserInteractionEnabled(false);
		final UIViewBlock complitionBlock = new UIViewBlock() {
			@Override
			public void perform(boolean finished) {
				targetView.setHidden(true);
			}

			@Override
			public void perform() {

			}
		};
		UIView.animateWithDurationDelayOptionsAnimationsCompletion(
				0.35f,
				0.0f,
				UIView.UIViewAnimationOptions.UIViewAnimationOptionCurveEaseOut,
				new UIViewBlock() {
					@Override
					public void perform() {
						tileView.setCenterForAnimation(targetView.getCenter());
						tileView.commitAnimation(0.35f, this, complitionBlock);
					}

					@Override
					public void perform(boolean finished) {

					}
				}, complitionBlock);

	}

	/**
	 * Method : checkForSuccess <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void checkForSuccess() {
		for (Object tInter : _targets) {
			TargetView t = (TargetView) tInter;
			if (t.getIsMatched() == false) {
				return;
			}
		}
		NSObjCRuntime.NSLog(new NSString("Game Over!"));
		this.stopStopwatch();
		this.getAudioController().playEffect(new NSString("win.mp3"));
		TargetView firstTarget = (TargetView) _targets.objectAtIndex(0);
		int startX = 0;
		final int endX = (int) (UIScreen.mainScreen().getBounds().size.height + 300);
		final int startY = (int) firstTarget.getCenter().y;
		final UIViewBlock complitionBlock = new UIViewBlock() {
			@Override
			public void perform(boolean finished) {

				GameController.this.clearBoard();
				GameController.this.getOnAnagramSolved().perform();
			}

			@Override
			public void perform() {

			}
		};
		UIView.animateWithDurationDelayOptionsAnimationsCompletion(
				3,
				0,
				UIView.UIViewAnimationOptions.UIViewAnimationOptionCurveEaseOut,
				new UIViewBlock() {
					@Override
					public void perform() {
					}

					@Override
					public void perform(boolean finished) {

					}
				}, complitionBlock);

		complitionBlock.perform(true);
	}

	/**
	 * Method : startStopwatch <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void startStopwatch() {
		_secondsLeft = this.getLevel().getTimeToSolve();
		this.getHud().getStopwatch().setSeconds(_secondsLeft);
		_timer = NSTimer
				.scheduledTimerWithTimeIntervalTargetSelectorUserInfoRepeats(
						1.0f, this,
						new com.myappconverter.java.foundations.SEL(
								new NSString("tick")), null, true);
	}

	/**
	 * Method : stopStopwatch <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void stopStopwatch() {
		_timer.invalidate();
		_timer = null;
	}

	/**
	 * Method : tick <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void tick(NSTimer timer) {
		_secondsLeft--;
		this.getHud().getStopwatch().setSeconds(_secondsLeft);
		if (_secondsLeft == 0) {
			this.stopStopwatch();
		}
	}

	/**
	 * Method : setHud <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void setHud(HUDView hud) {
		this.hud = hud;
		hud.getBtnHelp().addTargetActionForControlEvents(
				this,
				new com.myappconverter.java.foundations.SEL(new NSString(
						"actionHint")), UIControl.UIControlEventTouchUpInside);
	}

	/**
	 * Method : actionHint <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void actionHint() {
		this.getHud().getBtnHelp().setEnabled(false);
		this.getData().setPoints(
				this.getData().getPoints() - this.getLevel().getPointsPerTile()
						/ 2);
		this.getHud().getGamePoints().countTo(this.getData().getPoints(), 1.5f);
		TargetView target = null;
		for (Object tInter : _targets) {
			TargetView t = (TargetView) tInter;
			if (t.getIsMatched() == false) {
				target = t;
				break;
			}
		}
		TileView tile = null;
		for (Object tInter : _tiles) {
			TileView t = (TileView) tInter;
			if (t.getIsMatched() == false
					&& com.myappconverter.java.foundations.ExpressNullable
							.assertCondition(t.getLetter().isEqualToString(
									target.getLetter()))) {
				tile = t;
				break;
			}
		}
		this.getGameView().bringSubviewToFront(tile);
		final TileView fTile = tile;
		final TargetView fTarget = target;
		final UIViewBlock complitionBlock = new UIViewBlock() {
			@Override
			public void perform(boolean finished) {
				GameController.this.placeTile(fTile, fTarget);
				GameController.this.checkForSuccess();
				GameController.this.getHud().getBtnHelp().setEnabled(true);
			}

			@Override
			public void perform() {

			}
		};
		UIView.animateWithDurationDelayOptionsAnimationsCompletion(
				1.5f,
				0,
				UIView.UIViewAnimationOptions.UIViewAnimationOptionCurveEaseOut,
				new UIViewBlock() {
					@Override
					public void perform() {
						fTile.setCenterForAnimation(fTarget.getCenter());
						fTile.commitAnimation(1.5f, this, complitionBlock);
					}

					@Override
					public void perform(boolean finished) {

					}
				}, complitionBlock);
	}

	/**
	 * Method : clearBoard <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void clearBoard() {
		_tiles.removeAllObjects();
		_targets.removeAllObjects();
		for (Object viewInter : this.getGameView().subviews()) {
			UIView view = (UIView) viewInter;
			view.removeFromSuperview();
		}
	}

}
