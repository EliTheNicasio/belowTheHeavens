package com.eNic.belowTheHeavens;

import com.badlogic.gdx.Game;
import com.eNic.Helpers.AssetLoader;
import com.eNic.Screens.GameScreen;

public class BTHGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
//		setScreen(new SplashScreen(this));
		setScreen(new GameScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}