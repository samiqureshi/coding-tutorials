package com.badlogic.drop.main;

import com.badlogic.drop.loaders.AssetLoader;
import com.badlogic.drop.utils.ScreenTag;
import com.badlogic.drop.views.FightScreen;
import com.badlogic.drop.views.MainMenuScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FightGame extends Game {
	public SpriteBatch batch;
	public BitmapFont font;
	public AssetLoader assetLoader = new AssetLoader();
	private MainMenuScreen mainMenuScreen;
	private FightScreen fightScreen;


	@Override
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		this.mainMenuScreen = new MainMenuScreen(this);
		this.setScreen(mainMenuScreen);
		assetLoader.queueLoadSounds();
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
	public void switchScreen(ScreenTag screenTag){
		switch(screenTag){
			case SPLASH:

				break;
			case MAIN_MENU:
				if(mainMenuScreen == null)
					mainMenuScreen = new MainMenuScreen(this);
				this.setScreen(mainMenuScreen);
				break;
			case SETTINGS:

				break;
			case FIGHT:
				if(fightScreen == null)
					fightScreen = new FightScreen(this);
				this.setScreen(fightScreen);
				break;
			case CHARACTER_SELECTION:

				break;
			case RESULTS:

				break;
			case GAME_OVER:

				break;
		}
	}

}
