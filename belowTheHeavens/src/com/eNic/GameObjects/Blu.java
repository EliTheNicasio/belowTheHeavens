package com.eNic.GameObjects;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Blu {
    
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;
    
    private int width, height;
    private int midPointY;
    private int screenWidth;

    private boolean isAlive;

    private Rectangle boundingRec;
    
    public Blu(float x, float y, int width, int height, int midPointY,
	    int screenWidth) {
	this.width = width;
	this.height = height;
	this.midPointY = midPointY;
	this.screenWidth = screenWidth;
	position = new Vector2(x, y);
	velocity = new Vector2(136, 0);
	acceleration = new Vector2(0, 0); //not sure if necessary
	boundingRec = new Rectangle();
	isAlive = true;
    }
    
    public void update(float delta) {
	
	//velocity.add(acceleration.cpy().scl(delta));
	
	if(position.x < 0) {
	    position.x = 0;
	    velocity.x *= -1;
	}
	if(position.x > screenWidth) {
	    position.x = screenWidth;
	    velocity.x *= -1;
	}
	
	position.add(velocity.cpy().scl(delta));
	
	//Setup boundingRec here
    }
    
    //Update GameStates
    
    public void onClick() {
	if(isAlive) {
	    velocity.x *= -1;
	}
    }
    
    public void die() {
	isAlive = false;
    }
    
}
