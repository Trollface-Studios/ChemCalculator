package trollface.calc.core;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Crossroad extends BasicGameState {

	Image background, backgroundM, buttonone, buttononeglow, buttontwo,
			buttontwoglow, sipka, sipkaglow;
	Base game;
	boolean glowactive, glowactive2, glowactive1;

	public Crossroad(Base game) {
		this.game = game;
	}

	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {

		background = new Image("src/trollface/calc/images/chemBackground.png");
		backgroundM = new Image("src/trollface/calc/images/chemBackgroundM.png");
		buttonone = new Image(
				"src/trollface/calc/images/singlecompoundbutton.png");
		buttononeglow = new Image(
				"src/trollface/calc/images/singlecompoundbuttonglow.png");
		buttontwo = new Image("src/trollface/calc/images/equationsbutton.png");
		buttontwoglow = new Image(
				"src/trollface/calc/images/equationsbuttonglow.png");
		sipka = new Image("src/trollface/calc/images/gobackbuttonM.png");
		sipkaglow = new Image("src/trollface/calc/images/gobackbuttonMglow.png");

	}

	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {
		c.getInput();

		int posX = Mouse.getX();
		int posY = Mouse.getY();

		if (Base.printRoutineDebug) {
			Base.log(posX + "   " + posY);
		}
		if (Base.renderingSmall) {
			if ((posX > 220 && posY > 90) && (posX < 400 && posY < 135)) {
				glowactive = true;

			} else {
				glowactive = false;
			}
			if ((posX > 220 && posY < 265) && (posX < 400 && posY > 220)) {
				glowactive2 = true;
			} else {
				glowactive2 = false;
			}

		} else {
			if ((posX > 520 && posY < 280) && (posX < 700 && posY > 235)) {
				glowactive = true;

			} else {
				glowactive = false;
			}

			if ((posX > 520 && posY < 420) && (posX < 700 && posY > 375)) {
				glowactive2 = true;
			} else {
				glowactive2 = false;
			}
			if (Base.printRoutineDebug) {
				Base.log(glowactive + "");
			}
		}
		if (Base.renderingSmall) {
			if ((posX > 10 && posY > 18) && (posX < 78 && posY < 60)) {
				glowactive1 = true;

			} else {
				glowactive1 = false;
			}
		} else {
			if ((posX > 50 && posY < 100) && (posX < 120 && posY > 60)) {
				glowactive1 = true;
			} else {
				glowactive1 = false;
			}
		}

	}

	// 331, 283 265 220
	public void render(GameContainer c, StateBasedGame game, Graphics g)
			throws SlickException {

		if (Base.renderingSmall) {
			background.draw();
			buttonone.draw(220, 335);
			buttontwo.draw(220, 205);

			if (glowactive == true) {
				buttononeglow.draw(220, 335);
			}

			if (glowactive2 == true) {
				buttontwoglow.draw(220, 205);
			}

		} else {

			backgroundM.draw();
			sipka.draw(50, 600);
			// buttonone.draw(520, 410);
			buttontwo.draw(520, 270);

			if (glowactive1 == true) {
				sipkaglow.draw(50, 600);

			}

			if (glowactive == true) {
				// buttononeglow.draw(520, 410);
			}

			if (glowactive2 == true) {
				buttontwoglow.draw(520, 270);
			}

		}

	}

	public int GetID() {
		return 4;
	}

	@Override
	public int getID() {

		return 4;
	}

	public void mouseClicked(int button, int x, int y, int clickCount) {

		if (glowactive == true) {
			game.enterState(1);
		}
		if (glowactive1 == true) {

			game.enterState(0);
		}

		if (glowactive2 == true) {
			game.enterState(5);
		}

	}

}
