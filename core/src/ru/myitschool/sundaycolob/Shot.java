package ru.myitschool.sundaycolob;

public class Shot extends SpaceObject{

    Shot(float x, float y) {
        super(x, y);
        width = height = 50;
        dy = 20;
    }

    @Override
    void move() {
        super.move();
        if(y> GameScreen.SCR_HEIGHT+height/2) isAlive=false;
    }
}
