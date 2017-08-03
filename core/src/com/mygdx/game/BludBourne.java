package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screens.MainGameScreen;


public class BludBourne extends Game {

	public static final MainGameScreen _mainGameScreen = new MainGameScreen();

	@Override
	public void create(){
		setScreen(_mainGameScreen);
	}

	@Override
	public void dispose(){
		_mainGameScreen.dispose();
	}

}
