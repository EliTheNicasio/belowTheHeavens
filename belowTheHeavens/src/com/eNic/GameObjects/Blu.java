package com.eNic.GameObjects;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Blu {
    
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;
    
    private int width, height;
    private int gameWidth, gameLength;

    private boolean isAlive, facingRight;

    private Rectangle hitBox;
    
    public Blu(float x, float y, int width, int height, int screenWidth,
	    int screenLength) {
	this.width = width;
	this.height = height;
	this.gameWidth = screenWidth;
	this.gameLength = screenLength;
	position = new Vector2(x, y);
	velocity = new Vector2(500, 0);
	acceleration = new Vector2(0, 0); //not sure if necessary
	hitBox = new Rectangle(x, y, width, height);
	isAlive = true;
	facingRight = true;
    }
    
    public void update(float delta) {
	
	//velocity.add(acceleration.cpy().scl(delta));
	
	facingRight = velocity.x > 0;
	
	if(position.x < 0) {
	    position.x = 0;
	    velocity.x *= -1;
	}
	if(position.x + width > gameWidth) {
	    position.x = gameWidth - width;
	    velocity.x *= -1;
	}
	if(position.y + height < 0) {
	    position.y = gameLength - height;
	}
	
	position.add(velocity.cpy().scl(delta));
	
	hitBox.set(position.x, position.y, width, height);// Might want to change width and height
	// Hitbox may not be desired to be actual size of Blu
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
    
    public float getX() {
	return position.x;
    }
    
    public float getY()	{
	return position.y;
    }
    
    public float getWidth() {
	return width;
    }
    
    public float getHeight() {
	return height;
    }
    
    public Rectangle getHitBox() {
	return hitBox;
    }
    
    public boolean isAlive() {
	return isAlive;
    }
    
    public boolean isFacingRight() {
	return facingRight;
    }
}
