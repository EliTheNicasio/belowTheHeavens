package com.eNic.belowTheHeavens;

import com.badlogic.gdx.Game;
import com.eNic.Helpers.AssetLoader;
import com.eNic.Screens.SplashScreen;

public class BTHGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}