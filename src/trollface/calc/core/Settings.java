package trollface.calc.core;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Settings extends BasicGameState {

	private static AppGameContainer app;

	Image background, sipka, sipkaglow, backgroundM;
	boolean glowactive = false;
	Base game;

	public Settings(Base game) {
		this.game = game;
	}

	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {

		background = new Image("src/images/calc/core/chemBackground.png");
		sipka = new Image("src/images/calc/core/gobackbutton1.png");
		sipkaglow = new Image("src/images/calc/core/gobackbutton.png");
		backgroundM = new Image ("src/images/calc/core/chemBackgroundM.png");
	}

	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {
		Input input = c.getInput();

		int posX = Mouse.getX();
		int posY = Mouse.getY();

		System.out.println(posX + " " + posY);
		// 10, 78 60 18
		if (((Base) game).renderingSmall) {
			if ((posX > 10 && posY > 18) && (posX < 78 && posY < 60)) {
				glowactive = true;

			} else {
				glowactive = false;
			}
		} else {
			if ((posX > 60 && posY < 100) && (posX < 120 && posY > 60)) {
				glowactive = true;

			} else {
				glowactive = false;
			}
		}
	}

	public void render(GameContainer c, StateBasedGame game, Graphics g)
			throws SlickException {

		if (((Base) game).renderingSmall) {
			background.draw();
			sipka.draw(10, 420);
			if (glowactive == true) {
				sipkaglow.draw(10, 420);
			}
		} else {
			backgroundM.draw();
			sipka.draw(50, 600);
			if (glowactive == true) {
				sipkaglow.draw(50, 600);
			}

		}

	}

	public void mouseClicked(int button, int x, int y, int clickCount) {
		if (glowactive == true) {

			game.enterState(0);
		}
	}

	public int GetID() {
		return 3;
	}

	public int getID() {
		// TODO Auto-generated method stub
		return 3;
	}

}
