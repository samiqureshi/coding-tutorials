package com.badlogic.drop;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;

import java.awt.*;

public class HealthScreen implements Screen {
    Rectangle healthBar1;
    Rectangle healthBar2;
    final Drop game;
    OrthographicCamera camera;

    public HealthScreen(final Drop game){
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        healthBar1 = new Rectangle();
        healthBar1.x = 10;
        healthBar1.y = 475;
        healthBar1.width = 20;
        healthBar1.height = 2;
    }


    @Override
    public void show() {
        //Show Health Bars
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();

        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
