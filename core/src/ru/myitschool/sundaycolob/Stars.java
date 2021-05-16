package ru.myitschool.sundaycolob;

public class Stars extends SpaceObject {

	Stars(float x, float y){
		super(x, y);
		width = GameScreen.SCR_WIDTH;
		height = GameScreen.SCR_HEIGHT;
		dy = -0.5f;
	}

	@Override
	void move(){
		super.move();
		if(y<-GameScreen.SCR_HEIGHT) y = GameScreen.SCR_HEIGHT;
	}
}
