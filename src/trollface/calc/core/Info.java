package trollface.calc.core;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Info extends BasicGameState {
	Image background, sipka, sipkaglow, backgroundM_PTE;
	boolean glowactive = false;
	Base gam;

	public Info(Base game) {
		gam = game;
	}

	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {

		background = new Image("src/trollface/calc/images/chemBackground.png");
		sipka = new Image("src/trollface/calc/images/gobackbuttonM.png");
		sipkaglow = new Image("src/trollface/calc/images/gobackbuttonMglow.png");
		backgroundM_PTE = new Image(
				"src/trollface/calc/images/chemBackgroundM_PTE.png");
	}

	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {
		c.getInput();

		int posX = Mouse.getX();
		int posY = Mouse.getY();

		Base.log(posX + " " + posY);
		// 10, 78 60 18
		if (Base.renderingSmall) {
			if ((posX > 10 && posY > 18) && (posX < 78 && posY < 60)) {
				glowactive = true;

			} else {
				glowactive = false;
			}
		} else {
			if ((posX > 50 && posY < 100) && (posX < 120 && posY > 60)) {
				glowactive = true;

			} else {
				glowactive = false;
			}
		}
	}

	public void render(GameContainer c, StateBasedGame game, Graphics g)
			throws SlickException {

		if (Base.renderingSmall) {

			background.draw();
			sipka.draw(10, 420);
			if (glowactive == true) {
				sipkaglow.draw(10, 420);

			}
		} else {

			backgroundM_PTE.draw();
			sipka.draw(50, 600);
			if (glowactive == true) {
				sipkaglow.draw(50, 600);

			}
		}

	}

	public void mouseClicked(int button, int x, int y, int clickCount) {
		if (glowactive == true) {

			gam.enterState(0);
		}
	}

	public int GetID() {
		return 2;
	}

	public int getID() {
		// TODO Auto-generated method stub
		return 2;
	}

}
