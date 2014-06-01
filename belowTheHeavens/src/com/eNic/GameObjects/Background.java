package com.eNic.GameObjects;

import com.badlogic.gdx.math.Vector2;

public class Background extends Scrollable{

    public Background(float x, float y, int width, int height, int gameWidth,
	    int gameHeight, float scrollSpeed) {
	super(x, y, width, height, gameWidth, gameHeight, scrollSpeed);
	acceleration = new Vector2(0, 500);
    }

    @Override
    public void update(float delta) {
	velocity.add(acceleration.cpy().scl(delta));
	if(velocity.y > 5000) {
	    velocity.y = 5000;
	    acceleration.y *= -1;
	}
	if(velocity.y < 0) {
	    velocity.y = 0;
	    acceleration.y *= -1;
	}
	super.update(delta);
    }
    
    public void onRestart(float y, float scrollSpeed) {
	position.y = y;
	velocity.y = scrollSpeed;
    }
}
