package com.eNic.GameWorld;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameRenderer {

    private GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    private SpriteBatch batcher;

    private int midPointY;
    
    public GameRenderer(GameWorld world, int gameWidth, int gameHeight,
	    int midPointY) {
	
	myWorld = world;
	
	this.midPointY = midPointY;
	cam = new OrthographicCamera();
	cam.setToOrtho(true, gameWidth, gameHeight);
	
	batcher = new SpriteBatch();
	batcher.setProjectionMatrix(cam.combined);
	shapeRenderer = new ShapeRenderer();
	shapeRenderer.setProjectionMatrix(cam.combined);

	initGameObjects();
	initAssets();
    }
    
    private void initGameObjects() {
	//init game objects
    }
    
    private void initAssets() {
	//init assets
    }
    
    //Draw methods
    
    public void render(float delta, float runTime) {
	
	//Draw everything here
	
	//Then do gamestates
    }
}
