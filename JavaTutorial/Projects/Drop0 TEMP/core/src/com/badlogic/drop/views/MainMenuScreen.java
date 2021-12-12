package com.badlogic.drop.views;

import com.badlogic.drop.main.RPGGame;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainMenuScreen implements Screen {
    private final RPGGame game;
    private OrthographicCamera camera;
    private Stage stage;
    private Skin skin;

    public MainMenuScreen(final RPGGame game){
        this.game = game;
        this.stage = new Stage();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        game.assetLoader.queueLoadSkin();
        game.assetLoader.manager.finishLoading();
        skin = game.assetLoader.bioSkin;

    }

    @Override
    public void show() {
        // serves almost as a grid
        Table table = new Table();
        table.setFillParent(true);
        table.setDebug(false);
        stage.addActor(table);

        // any input will send a request from stage for response
        Gdx.input.setInputProcessor(stage);

        ImageTextButton fightBtn = new ImageTextButton("Fight", skin);
        ImageTextButton createFighterBtn = new ImageTextButton("Create Fighter", skin);
        ImageTextButton prefsBtn = new ImageTextButton("Preferences", skin);
        ImageTextButton exit = new ImageTextButton("Exit", skin);

        // fillX - fills the remaining space within its cell
        // uniformX - will force the size of any cells within
        //    the row to be the same size (currently none)
        table.add(fightBtn).fillX().uniformX();
        table.row().pad(10, 0, 10, 0);
        table.add(createFighterBtn).fillX().uniformX();
        table.row();
        table.add(prefsBtn).fillX().uniformX();
        table.row();
        table.add(exit).fillX().uniformX();

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
//        game.batch.begin();
//        game.font.draw(game.batch, "Welcome to Drop!!! ", 100, 150);
//        game.font.draw(game.batch, "Tap anywhere to begin!", 100, 100);
//        game.batch.end();
        // act asks our stage to perform as we "draw" the curtains
        stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1/30f));
        // ^ maximum frame rate with this MathMin function

        stage.draw();

//        if(Gdx.input.isTouched()){
//            game.setScreen(new RPGGameScreen(game));
//            dispose();
//        }

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
