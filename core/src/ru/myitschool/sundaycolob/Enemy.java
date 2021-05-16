package ru.myitschool.sundaycolob;

import com.badlogic.gdx.math.MathUtils;

public class Enemy extends SpaceObject {
    int type;

    Enemy() {
        super(0, 0);
        width = height = 80;
        y = GameScreen.SCR_HEIGHT + height/2;
        x = MathUtils.random(width/2, GameScreen.SCR_WIDTH - width/2);
        dy = MathUtils.random(-2, -1);
        type = MathUtils.random(0, 1);
    }

    @Override
    void move() {
        super.move();
        if(y<-height/2) {
            isAlive=false;
            if(GameScreen.gameState== GameScreen.GAME_PLAY) GameScreen.gameState = GameScreen.GAME_OVER;
        }
    }
}
