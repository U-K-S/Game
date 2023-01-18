package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.tankStars;

public class resumeScreen implements Screen {

    public tankStars game;
    private Texture back, gamelist, backButton;
    public resumeScreen(tankStars game){
        this.game=game;
        back= new Texture("resume_back.png");
        gamelist= new Texture("Resume_list.png");
        backButton=new Texture("goBack.jpeg");
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(back,0,0,700,500);
        game.batch.draw(gamelist, 200,100, 250,300);
        game.batch.draw(backButton,3,425, 100,50);

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
