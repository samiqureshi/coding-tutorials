package com.badlogic.drop.views;

import com.badlogic.drop.main.FightGame;
import com.badlogic.drop.ui.HealthBar;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.concurrent.TimeUnit;

public class FightScreen implements Screen {
    final FightGame game;
//    Texture dropImage;
//    Texture bucketImage;
    Sound dropSound;
    Music rainMusic;
    OrthographicCamera camera;
//    Rectangle bucket;
//    Array<Rectangle> raindrops;
//    long lastDropTime;
//    int dropsGathered;
    Stage stage;
    private HealthBar h1;
    private HealthBar h2;
    private long lastUpdate = 0L;

    public FightScreen(final FightGame game) {
        this.game = game;
        //Healthbar stuff
        stage = new Stage();
        h1 = new HealthBar(200, 10);
        h2 = new HealthBar(200, 10);
        h1.setPosition(20, Gdx.graphics.getHeight() - 20);
        h2.setPosition(Gdx.graphics.getWidth() - h2.getWidth() - 20, Gdx.graphics.getHeight() - 20);
        stage.addActor(h1);
        stage.addActor(h2);

        // load the images for the droplet and the bucket, 64x64 pixels each
//        dropImage = new Texture(Gdx.files.internal("droplet.png"));
//        bucketImage = new Texture(Gdx.files.internal("bucket.png"));

        // load the drop sound effect and the rain background "music"
//        dropSound = Gdx.audio.newSound(Gdx.files.internal("drop.wav"));
//        rainMusic = Gdx.audio.newMusic(Gdx.files.internal("rain.mp3"));
//        rainMusic.setLooping(true);

        // create the camera and the SpriteBatch
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        // create a Rectangle to logically represent the bucket
//        bucket = new Rectangle();
//        bucket.x = 800 / 2 - 64 / 2; // center the bucket horizontally
//        bucket.y = 20; // bottom left corner of the bucket is 20 pixels above
        // the bottom screen edge
//        bucket.width = 64;
//        bucket.height = 64;

        // create the raindrops array and spawn the first raindrop
//        raindrops = new Array<Rectangle>();
//        spawnRaindrop();

    }

//    private void spawnRaindrop() {
//        Rectangle raindrop = new Rectangle();
//        raindrop.x = MathUtils.random(0, 800 - 64);
//        raindrop.y = 480;
//        raindrop.width = 64;
//        raindrop.height = 64;
////        raindrops.add(raindrop);
////        lastDropTime = TimeUtils.nanoTime();
//    }


    @Override
    public void show() {
        // start the playback of the background music
        // when the screen is shown
//        rainMusic.play();
    }

    @Override
    public void render(float delta) {
        // clear the screen with a dark blue color. The
        // arguments to clear are the red, green
        // blue and alpha component in the range [0,1]
        // of the color to be used to clear the screen.
        ScreenUtils.clear(0, 0, 0.2f, 1);

        // tell the camera to update its matrices.
        camera.update();

        // tell the SpriteBatch to render in the
        // coordinate system specified by the camera.
        game.batch.setProjectionMatrix(camera.combined);

        // begin a new batch and draw the bucket and
        // all drops
        if (System.currentTimeMillis() - lastUpdate > TimeUnit.SECONDS.toMillis(5)) {
            h1.setValue(h1.getValue() - 0.1f);
            h2.setValue(h1.getValue() - 0.1f);
            lastUpdate = System.currentTimeMillis();
        }
        game.batch.begin();
//        game.font.draw(game.batch, "Drops Collected: " + dropsGathered, 0, 480);
//        game.batch.draw(bucketImage, bucket.x, bucket.y, bucket.width, bucket.height);
        stage.draw();
        stage.act();
//        for (Rectangle raindrop : raindrops) {
//            game.batch.draw(dropImage, raindrop.x, raindrop.y);
//        }
        game.batch.end();

        // process user input
        if (Gdx.input.isTouched()) {
            Vector3 touchPos = new Vector3();
            touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            camera.unproject(touchPos);
//            bucket.x = touchPos.x - 64 / 2;
        }
//        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
//            bucket.x -= 200 * Gdx.graphics.getDeltaTime();
//        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
//            bucket.x += 200 * Gdx.graphics.getDeltaTime();

        // make sure the bucket stays within the screen bounds
//        if (bucket.x < 0)
//            bucket.x = 0;
//        if (bucket.x > 800 - 64)
//            bucket.x = 800 - 64;

        // check if we need to create a new raindrop
//        if (TimeUtils.nanoTime() - lastDropTime > 1000000000)
//            spawnRaindrop();

        // move the raindrops, remove any that are beneath the bottom edge of
        // the screen or that hit the bucket. In the later case we increase the
        // value our drops counter and add a sound effect.
//        Iterator<Rectangle> iter = raindrops.iterator();
//        while (iter.hasNext()) {
//            Rectangle raindrop = iter.next();
//            raindrop.y -= 200 * Gdx.graphics.getDeltaTime();
//            if (raindrop.y + 64 < 0)
//                iter.remove();
//            if (raindrop.overlaps(bucket)) {
//                dropsGathered++;
//                dropSound.play();
//                iter.remove();
//            }
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
//        dropImage.dispose();
//        bucketImage.dispose();
        dropSound.dispose();
        rainMusic.dispose();
    }
}
