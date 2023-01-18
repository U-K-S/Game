package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;


public class chooseTankScreen implements Screen{

    private Texture tank1, tank2, tank3,back, choose, backButton;
    private float x;
    private float y;
    public tankStars game;
     public chooseTankScreen(tankStars game){
         this.game=game;

         tank1=new Texture("Helios.png");
         tank2=new Texture("Pumpkin.png");
         tank3=new Texture("pinky.png");
         back=new Texture("plainBack.jpg");
         choose=new Texture("choose.png");
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
        game.batch.draw(choose,190,420,290,50);
        game.batch.draw(backButton,3,425, 100,50);
        game.batch.draw(tank1, 280, 300, 130, 140);
        game.batch.draw(tank2,280, 180, 110, 100);
        game.batch.draw(tank3,280, 40, 130, 100);


        /*
        if(Gdx.input.getX()<5+50 && Gdx.input.getX()>5 && Gdx.graphics.getHeight()-Gdx.input.getY()<425+50 && Gdx.graphics.getHeight()-Gdx.input.getY()>425){
            if(Gdx.input.isTouched()){
                this.dispose();
                game.setScreen(new MainMenuScreen(game));

            }
        }

         */
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
