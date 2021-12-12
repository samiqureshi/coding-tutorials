package com.badlogic.drop.main;

import com.badlogic.drop.loaders.AssetLoader;
import com.badlogic.drop.views.MainMenuScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RPGGame extends Game {
	public SpriteBatch batch;
	public BitmapFont font;
	public AssetLoader assetLoader = new AssetLoader();

	@Override
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		this.setScreen(new MainMenuScreen(this));
		assetLoader.queueLoadSounds();
//		assetLoader.queueLoadSkin();
		assetLoader.manager.finishLoading();
		assetLoader.rainMusic.setLooping(true);
		assetLoader.rainMusic.play();




	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {
		batch.dispose();
		font.dispose();
	}
}
