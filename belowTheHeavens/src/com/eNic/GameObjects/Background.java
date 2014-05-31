package com.eNic.GameObjects;

public class Background extends Scrollable{

    public Background(float x, float y, int width, int height, int gameWidth,
	    int gameHeight, float scrollSpeed) {
	super(x, y, width, height, gameWidth, gameHeight, scrollSpeed);
    }

    public void onRestart(float y, float scrollSpeed) {
	position.y = y;
	velocity.y = scrollSpeed;
    }
}
