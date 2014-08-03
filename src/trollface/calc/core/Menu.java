package trollface.calc.core;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.InputListener;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu extends BasicGameState {
	private static AppGameContainer app;
	Image background, buttonCal, buttonInfo, buttonSet, buttonExit,
			buttonExitglow, buttonCalglow, buttonInfoglow, buttonSetglow;
	Font font;
	TextField textField;
	MouseListener listener;
	Color color;
	Base game;
	boolean glowactive = false, glowactive1 = false, glowactive2 = false,
			glowactive3 = false;

	public Menu(Base game) {
		this.game = game;
	}

	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {

		background = new Image("src/images/calc/core/chemBackground.png");
		buttonCal = new Image("src/images/calc/core/buttonCalculations.png");
		buttonInfo = new Image("src/images/calc/core/buttonInfo.png");
		buttonSet = new Image("src/images/calc/core/buttonSet.png");
		buttonExit = new Image("src/images/calc/core/buttonExit.png");
		buttonExitglow = new Image("src/images/calc/core/buttonExitglow.png");
		buttonCalglow = new Image(
				"src/images/calc/core/buttonCalculationsglow.png");
		buttonInfoglow = new Image("src/images/calc/core/buttonInfoglow.png");
		buttonSetglow = new Image("src/images/calc/core/buttonSetglow.png");
		// font = new UnicodeFont(new java.awt.Font(java.awt.Font.SANS_SERIF,
		// java.awt.Font.ITALIC, 26));
		// textField = new TextField(c, c.getDefaultFont(), 200, 50, x, y,
		// new ComponentListener() {
		//
		// @Override
		// public void componentActivated(AbstractComponent source) {
		// TextField field = (TextField) source;
		// String text = field.getText();
		// }
	}// 201 153

	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {
		Input input = c.getInput();

		int posX = Mouse.getX();
		int posY = Mouse.getY();

		System.out.println(posX + "   " + posY);
		if ((posX > 220 && posY > 90) && (posX < 400 && posY < 135)) {
			glowactive = true;

		} else {
			glowactive = false;
		}
		if ((posX > 220 && posY < 331) && (posX < 400 && posY > 283)) {
			glowactive1 = true;
		} else {
			glowactive1 = false;
		}
		if ((posX > 220 && posY < 265) && (posX < 400 && posY > 220)) {
			glowactive2 = true;
		} else {
			glowactive2 = false;
		}
		if ((posX > 220 && posY < 201) && (posX < 400 && posY > 153)) {
			glowactive3 = true;
		} else {
			glowactive3 = false;
		}
		System.out.println(glowactive);
	}

	// 331, 283 265 220
	public void render(GameContainer c, StateBasedGame game, Graphics g)
			throws SlickException {

		if (((Base) game).renderingSmall) {
			background.draw();
			buttonCal.draw(220, 140);
			buttonInfo.draw(220, 205);
			buttonSet.draw(220, 270);
			buttonExit.draw(220, 335);

			if (glowactive == true) {
				buttonExitglow.draw(220, 335);
			}
			if (glowactive1 == true) {
				buttonCalglow.draw(220, 140);
			}
			if (glowactive2 == true) {
				buttonInfoglow.draw(220, 205);
			}
			if (glowactive3 == true) {
				buttonSetglow.draw(220, 270);
			}
		} else {

			// TADY VELKEJ RENDER
		}

	}

	public int GetID() {
		return 0;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void mouseClicked(int button, int x, int y, int clickCount) {

		if (glowactive == true) {
			app.exit();
		}
		if (glowactive1 == true) {
			game.enterState(1);
		}
		if (glowactive2 == true) {
			game.enterState(2);
		}
		if (glowactive3 == true) {
			game.enterState(3);
		}

	}
}
