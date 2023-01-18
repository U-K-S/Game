package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MainMenuScreen implements Screen {
    private tankStars game;

    private Texture newgameButton;
    private Texture resumeButton;
    private Texture exitButton;
    private Texture choosetankButton;
    private Texture background;

    private Music music;

    public  MainMenuScreen(tankStars game){
        this.game=game;
        newgameButton=new Texture("startButton.jpg");
        resumeButton=new Texture("resumeGame.png");
        exitButton=new Texture("exitButton.png");
        choosetankButton=new Texture("tanks.png");
        background=new Texture("tank-stars.jpg");
        music=Gdx.audio.newMusic(Gdx.files.internal("Bande.mp3"));
        music.setVolume(0.2f);
        music.setLooping(true);
        music.play();

    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(background, 0,0, 640, 500);
        game.batch.draw(newgameButton,290,50,110,40);
        game.batch.draw(resumeButton,300,0,90,40);
        game.batch.draw(exitButton,570, 5,50,70);
        game.batch.draw(choosetankButton,10,430,90,40);

        //Mouse input for new gameButton
        if(Gdx.input.getX()<300+90 && Gdx.input.getX()>300 && Gdx.graphics.getHeight()-Gdx.input.getY()<50+40 && Gdx.graphics.getHeight()-Gdx.input.getY()>50){
            if(Gdx.input.isTouched()){
                game.setScreen(new maingamescreen(game));
            }
        }

        //Mouse input for resume Button
        if(Gdx.input.getX()<300+90 && Gdx.input.getX()>300 && Gdx.graphics.getHeight()-Gdx.input.getY()<40 && Gdx.graphics.getHeight()-Gdx.input.getY()>0){
            if(Gdx.input.isTouched()){
                game.setScreen((new resumeScreen(game)));
            }
        }

        //mouse input for exit button
        if(Gdx.input.getX()<570+50 && Gdx.input.getX()>570 && Gdx.graphics.getHeight()-Gdx.input.getY()<5+70 && Gdx.graphics.getHeight()-Gdx.input.getY()>5){
            if (Gdx.input.isTouched()){
                Gdx.app.exit();
            }
        }

        //mouse input for choose tank button
        if(Gdx.input.getX()<10+90 && Gdx.input.getX()>10 && Gdx.graphics.getHeight()-Gdx.input.getY()<430+40 && Gdx.graphics.getHeight()-Gdx.input.getY()>430){
            if (Gdx.input.isTouched()){
                game.setScreen(new chooseTankScreen(game));
            }
        }
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
