package com.eNic.GameObjects.Entities;

import com.badlogic.gdx.math.Rectangle;
import com.eNic.GameObjects.Scrollable;

/**
 * Entity extends Scrollable. Entity differs from scrollable in that Entities
 * can interact with one another, and have a hitBox.
 * 
 * @author eNic
 *
 */
public class Entity extends Scrollable{

    protected Rectangle hitBox;
    
    public Entity(float x, float y, int width, int height, int gameWidth,
	    int gameHeight, float scrollSpeed) {
	super(x, y, width, height, gameWidth, gameHeight, scrollSpeed);
	hitBox = new Rectangle(x, y, width, height);
    }

    @Override
    public void update(float delta) {
	super.update(delta);
	hitBox.set(position.x, position.y, width, height);
    }
    
    @Override
    public void reset(float newY) {
	super.reset(newY);
	hitBox.set(position.x, position.y, width, height);
    }
    
    @Override
    public void stop() {
	super.stop();
	hitBox.set(position.x, position.y, width, height);
    }
    
    // Getters
    public Rectangle getHitBox() {
	return hitBox;
    }
}
