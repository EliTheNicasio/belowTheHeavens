package com.eNic.Helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {
    
    public static Texture logoTexture, bluLftTexture, bluRtTexture, bg1Texture, bg2Texture;
    public static TextureRegion logo, bluLft, bluRt, bg1, bg2;
    public static TextureRegion[] blu;
    //rest of textures and assets
    
    public static void load() {
	logoTexture = new Texture(Gdx.files.internal("data/logo.png"));
	logoTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);

	logo = new TextureRegion(logoTexture, 0, 0, 1024, 1024);
	
	bluLftTexture = new Texture(Gdx.files.internal("data/bluLft.png"));
	bluLftTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
	
	bluLft = new TextureRegion(bluLftTexture, 0, 0, 1024, 1024);
	
	bluRtTexture = new Texture(Gdx.files.internal("data/bluRt.png"));
	bluRtTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
	
	bluRt = new TextureRegion(bluRtTexture, 0, 0, 1024, 1024);
	
	blu = new TextureRegion[] {bluLft, bluRt}; 
	
	bg1Texture = new Texture(Gdx.files.internal("data/bg1.png"));
	logoTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
	
	bg1 = new TextureRegion(bg1Texture, 0, 0, 480, 1136);
	bg1.flip(false, true);
	
	bg2Texture = new Texture(Gdx.files.internal("data/bg2.png"));
	logoTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
	
	bg2 = new TextureRegion(bg2Texture, 0, 0, 480, 1136);
	bg2.flip(false, true);
    }
    
    public static void dispose() {
	logoTexture.dispose();
    }
}
