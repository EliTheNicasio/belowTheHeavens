package com.eNic.belowTheHeavens;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
    public static void main(String[] args) {
	LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
	cfg.title = "belowTheHeavens";
	cfg.width = 480;
	cfg.height = 1136;
		
	new LwjglApplication(new BTHGame(), cfg);
	}
}
