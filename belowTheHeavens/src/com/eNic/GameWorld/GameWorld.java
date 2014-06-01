package com.eNic.GameWorld;

import com.badlogic.gdx.math.Rectangle;
import com.eNic.GameObjects.Blu;
import com.eNic.GameObjects.ScrollHandler;

public class GameWorld {
    
    private Blu blu;
    private ScrollHandler scroller;
    private Rectangle ground;
    private int score = 0;
    private float runTime = 0;
    private int gameHeight, gameWidth;
    private int midPointY;
    private GameRenderer renderer;
    
    //GameStates go here
    
    public GameWorld( int gameWidth, int gameHeight) {
	//currentState = GameState.MENU
	this.midPointY = midPointY;
	this.gameWidth = gameWidth;
	this.gameHeight = gameHeight;
	blu = new Blu(gameWidth / 2, gameHeight * .9f, gameWidth / 8,
		gameWidth / 8, gameWidth, gameHeight);
	scroller = new ScrollHandler(this, 500);
    }
    
    public void update(float delta) {
	runTime += delta;
	
	//GameStates
//	switch (currentState) {
//	case READY:
//	case MENU:
//		updateReady(delta);
//		break;
//	case RUNNING:
		updateRunning(delta);
//		break;
//	default:
//		break;
//	}
    }
    
    private void updateReady(float delta) {
	//projectile.updateReady(runTime);
	//scroller.updateReadyDelta);
    }
    
    public void updateRunning(float delta) {
	if(delta > .15f) {
	    delta = .15f;
	}
	blu.update(delta);
	scroller.update(delta);
    }
    
    
    //Getters
    
    public Blu getBlu() {
	return blu;
    }
    
    public int getMidPointY() {
	return midPointY;
    }
    
    public int getScore() {
	return score;
    }
    
    public ScrollHandler getScroller() {
	return scroller;
    }
    
    public void addScore(int increment) {
	score+= increment;
    }
    
    //GameStates e.g.- isReady
    
    public void setRenderer(GameRenderer renderer) {
	this.renderer = renderer;
    }
}
