package com.eNic.GameObjects;

import com.eNic.GameObjects.Entities.Entity;
import com.eNic.GameWorld.GameWorld;

public class ScrollHandler {

    private Background bg1, bg2;
    private Entity enemy;
    private int scrollSpeed;
    
    private GameWorld gameWorld;
    
    public ScrollHandler(GameWorld gameWorld, int scrollSpeed) {
	this.gameWorld = gameWorld;
	this.scrollSpeed = scrollSpeed;
	bg1 = new Background(0, 0, 480, 1136, 480, 1136, scrollSpeed);
	bg2 = new Background(0, bg1.getTailY(), 480, 1136, 480,
					1136, scrollSpeed);
//	enemy = new Entity()
    }
    
    public void update(float delta) {
	bg1.update(delta);
	bg2.update(delta);
	
	if(bg1.isScrolledDown()) {
	    bg1.reset(bg2.getTailY());
	} else if(bg2.isScrolledDown()) {
	    bg2.reset(bg1.getTailY());
	}
    }
    
    public void stop() {
	bg1.stop();
	bg2.stop();
    }
    
    public void onRestart() {
	bg1.onRestart(0, scrollSpeed);
	bg2.onRestart(bg1.getTailY(), scrollSpeed);
    }
    
    // Getters
    public Background getBg1() {
	return bg1;
    }
    
    public Background getBg2() {
	return bg2;
    }
    
    public int getScrollSpeed() {
	return scrollSpeed;
    }
}
