package com.eNic.GameWorld;

import com.badlogic.gdx.math.Rectangle;

public class GameWorld {
    //private Projectile projectile;
    //private ScrollHandler scroller;
    private Rectangle ground;
    private int score = 0;
    private float runTime = 0;
    private int midPointX, midPointY;
    private GameRenderer renderer;
    
    //GameStates go here
    
    public GameWorld(int midPointX, int midPointY) {
	//currentState = GameState.MENU
	this.midPointX = midPointX;
	this.midPointY = midPointY;
	//projectile = new Projectile
	//scroller = new ScrollHandler
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
//		updateRunning(delta);
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
    }
}
