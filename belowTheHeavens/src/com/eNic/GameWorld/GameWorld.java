package com.eNic.GameWorld;

import com.badlogic.gdx.math.Rectangle;
import com.eNic.GameObjects.Blu;

public class GameWorld {
    
    private Blu blu;
    //private ScrollHandler scroller;
    private Rectangle ground;
    private int score = 0;
    private float runTime = 0;
    private int midPointY;
    private GameRenderer renderer;
    
    //GameStates go here
    
    public GameWorld(int midPointY) {
	//currentState = GameState.MENU
	this.midPointY = midPointY;
	blu = new Blu(0, 1136, 96, 192, midPointY, 480);
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
	blu.update(delta);
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
    
    public void addScore(int increment) {
	score+= increment;
    }
    
    //GameStates e.g.- isReady
    
    public void setRenderer(GameRenderer renderer) {
	this.renderer = renderer;
    }
}
