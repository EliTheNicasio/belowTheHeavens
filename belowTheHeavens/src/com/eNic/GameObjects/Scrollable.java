package com.eNic.GameObjects;

import com.badlogic.gdx.math.Vector2;

public class Scrollable {

    protected Vector2 position;
    protected Vector2 velocity;
    protected Vector2 acceleration; //implement later
    
    protected int width;
    protected int height;
    protected int gameWidth, gameHeight;
    protected boolean isScrolledDown;
    
    public Scrollable(float x, float y, int width, int height, int gameWidth, 
	    int gameHeight, float scrollSpeed) {
	position = new Vector2(x, y);
	velocity = new Vector2(0, scrollSpeed);
	this.width = width;
	this.height = height;
	this.gameWidth = gameWidth;
	this.gameHeight = gameHeight;
	isScrolledDown = false;
    }
    
    public void update(float delta) {
	position.add(velocity.cpy().scl(delta));
	
	if(position.y > gameHeight) {
	    isScrolledDown = true;
	}
    }
    
    // Override reset for more specific behavior
    public void reset(float newY) {
	position.y = newY;
	isScrolledDown = false;
    }
    
    public void stop() {
	velocity.x = 0;
	velocity.y = 0;
    }
    
    //Getters
    public boolean isScrolledDown() {
	return isScrolledDown;
    }
    
    public float getTailY() {
	return position.y - height;
    }
    
    public float getX() {
	return position.x;
    }
    
    public float getY() {
	return position.y;
    }
    
    public int getWidth() {
	return width;
    }
    
    public int getHeight() {
	return height;
    }
}
