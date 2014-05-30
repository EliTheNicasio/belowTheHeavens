package com.eNic.GameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.eNic.GameObjects.Blu;
import com.eNic.Helpers.AssetLoader;

public class GameRenderer {

    private GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    private SpriteBatch batcher;

    private int midPointY, gameWidth, gameHeight;
    
    //Game Objects
    private Blu blu;
    private int x,y;
    
    //Game Assets
    private Sprite[] bluSprite;
    
    public GameRenderer(GameWorld world, int gameWidth, int gameHeight,
	    int midPointY) {
	
	myWorld = world;
	
	this.midPointY = midPointY;
	this.gameWidth = gameWidth;
	this.gameHeight = gameHeight;
	cam = new OrthographicCamera();
	cam.setToOrtho(true, gameWidth, gameHeight);
	
	batcher = new SpriteBatch();
	batcher.setProjectionMatrix(cam.combined);
	shapeRenderer = new ShapeRenderer();
	shapeRenderer.setProjectionMatrix(cam.combined);

	initGameObjects();
	initAssets();
	
	x = y = 0;
    }
    
    private void initGameObjects() {
	blu = myWorld.getBlu();
    }
    
    private void initAssets() {
	bluSprite = new Sprite[] {new Sprite(AssetLoader.blu[0])
				, new Sprite(AssetLoader.blu[1])};
	
	float desiredWidth = gameWidth / 5;
	float scale = desiredWidth / bluSprite[0].getWidth();
	
	for(Sprite spr : bluSprite) {
	    spr.setColor(1, 1, 1, 0);
	    spr.setSize(spr.getWidth() * scale, spr.getHeight() * scale);
	}
    }
    
    //Draw methods
    
    private void drawBlu(float runTime) {
	Sprite bluSpr;
	if(blu.isFacingRight()) {
	    bluSpr = bluSprite[1];
	} else {
	    bluSpr = bluSprite[0];
	}
	batcher.draw(bluSpr, blu.getX(), blu.getY());
    }
    
    public void render(float delta, float runTime) {
	
	shapeRenderer.begin(ShapeType.Filled);
	// Draw Background color
//	if(runTime >= 1) {
	    shapeRenderer.setColor(0 / 255.0f, 0 / 255.0f, 18 / 255.0f, 1);
	    shapeRenderer.rect(0, 0, gameWidth, y += 50);
//	}
	
	shapeRenderer.end();
	
	//Then do gamestates
	batcher.begin();
	batcher.disableBlending();
	
	drawBlu(runTime);
	batcher.end();
    }
}
