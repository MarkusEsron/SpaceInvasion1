package ru.myitschool.sundaycolob.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ru.myitschool.sundaycolob.GameScreen;
import ru.myitschool.sundaycolob.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = GameScreen.SCR_WIDTH;
		config.height = GameScreen.SCR_HEIGHT;
		//config.fullscreen = true;
		new LwjglApplication(new MyGdxGame(), config);
	}
}