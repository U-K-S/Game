package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;


public class maingamescreen implements Screen{
    public static final float SPEED =320;
    private Texture backgroundImg, tank1, tank2, backButton, health1, health2, fuel1, fuel2;
    private float x;
    private float y;
     private tankStars game;

     public maingamescreen(tankStars game){
         this.game=game;


         tank1 = new Texture("Helios.png");
         backgroundImg=new Texture("pic1.jpg");
         tank2=new Texture("Helios2.png");
         backButton=new Texture("goBack.jpeg");
         health1=new Texture("health1.png");
         fuel1=new Texture("fuel1.png");
         health2=new Texture("health2.png");
         fuel2=new Texture("fuel2.png");


    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

         if(Gdx.input.isKeyJustPressed(Input.Keys.LEFT)){
             if(x>=0){
                 x-=SPEED *Gdx.graphics.getDeltaTime();
             }

        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)){
            if(x<=445){
                x+=SPEED *Gdx.graphics.getDeltaTime();
            }
        }


        Gdx.gl.glClearColor(1, 0, 0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(backgroundImg, 0,0,640, 590);
        game.batch.draw(tank1, x, y);
        game.batch.draw(tank2, 442,0);
        game.batch.draw(health1,15,370,100,40);
        game.batch.draw(health2,530, 370,100,40);
        game.batch.draw(fuel1,15,300,80,45);
        game.batch.draw(fuel2,545,300,80,45);
        game.batch.draw(backButton,5,425, 50,50);


        /*if(Gdx.input.getX()<5+50 && Gdx.input.getX()>5 && Gdx.graphics.getHeight()-Gdx.input.getY()<425+50 && Gdx.graphics.getHeight()-Gdx.input.getY()>425){
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
