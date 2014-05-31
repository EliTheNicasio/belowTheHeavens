package com.eNic.Helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {
    
    public static Texture logoTexture, bluLftTexture, bluRtTexture;
    public static TextureRegion logo, bluLft, bluRt;
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
    }
    
    public static void dispose() {
	logoTexture.dispose();
    }
}
