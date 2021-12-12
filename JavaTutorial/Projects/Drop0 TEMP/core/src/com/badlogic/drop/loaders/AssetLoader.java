package com.badlogic.drop.loaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class AssetLoader {
    public final AssetManager manager = new AssetManager();

    public Sound dropSound;
    public Music rainMusic;
    public Skin neonSkin;
    public Skin bioSkin;

    public void queueLoadImages(){

    }

    public void queueLoadSounds(){
        // load the drop sound effect and the rain background "music"
        dropSound = Gdx.audio.newSound(Gdx.files.internal("drop.wav"));
        rainMusic = Gdx.audio.newMusic(Gdx.files.internal("rain.mp3"));
    }

    public void queueLoadSkin(){
        // load button skins
        bioSkin = new Skin(Gdx.files.internal("skin/biological-attack/skin/biological-attack-ui.json"));
//        neonSkin = new Skin(Gdx.files.internal("skin/neon-ui.json"));
    }


}
