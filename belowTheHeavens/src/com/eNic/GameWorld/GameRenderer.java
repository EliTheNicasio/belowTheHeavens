package com.eNic.GameWorld;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.eNic.GameObjects.Background;
import com.eNic.GameObjects.Blu;
import com.eNic.GameObjects.ScrollHandler;
import com.eNic.Helpers.AssetLoader;

public class GameRenderer {

    private GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    private SpriteBatch batcher;

    private int gameWidth, gameHeight;
    
    //Game Objects
    private Blu blu;
    private ScrollHandler scroller;
    private Background bg1, bg2;
    
    //Game Assets
    private Sprite bg1Spr, bg2Spr;
    private Sprite[] bluSprite;
    
    public GameRenderer(GameWorld world, int gameWidth, int gameHeight) {
	
	myWorld = world;
	
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
    }
    
    private void initGameObjects() {
	blu = myWorld.getBlu();
	scroller = myWorld.getScroller();
	bg1 = scroller.getBg1();
	bg2 = scroller.getBg2();
    }
    
    private void initAssets() {
	initBlu();
	bg1Spr = new Sprite(AssetLoader.bg1);
	bg2Spr = new Sprite(AssetLoader.bg2);
    }
    
    private void initBlu() {
	bluSprite = new Sprite[] {new Sprite(AssetLoader.blu[0])
				, new Sprite(AssetLoader.blu[1])};

	float desiredWidth = gameWidth / 8;
	float scale = desiredWidth / bluSprite[0].getWidth();

	for(Sprite spr : bluSprite) {
	    spr.setColor(1, 1, 1, 0);
	    spr.setSize(spr.getWidth() * scale, spr.getHeight() * scale);
}
    }
    
    //Draw methods
    
    private void drawBackgrounds() {
	bg1Spr.setPosition(bg1.getX(), bg1.getY());
	bg1Spr.draw(batcher);
	bg2Spr.setPosition(bg2.getX(), bg2.getY());
	bg2Spr.draw(batcher);
    }
    
    private void drawBlu(float runTime) {
	Sprite bluSpr;
	if(blu.isFacingRight()) {
	    bluSpr = bluSprite[0];
	} else {
	    bluSpr = bluSprite[1];
	}
	bluSpr.setPosition(blu.getX(), blu.getY());
	bluSpr.draw(batcher);
    }
    
    public void render(float delta, float runTime) {
	
	shapeRenderer.begin(ShapeType.Filled);
	// Draw Background color
//	if(runTime >= 1) {
//	    shapeRenderer.setColor(0 / 255.0f, 0 / 255.0f, 18 / 255.0f, 1);
//	    shapeRenderer.rect(0, 0, gameWidth, y += 50);
//	    shapeRenderer.rect(0, 0, gameWidth, gameHeight);
//	}
	
	shapeRenderer.end();
	
	//Then do gamestates
	batcher.begin();
	batcher.disableBlending();
	
	drawBackgrounds();
	drawBlu(runTime);
	batcher.end();
    }
}
