package trollface.calc.core;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Settings extends BasicGameState{

	private static AppGameContainer app;

	Image background;

	
	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {

		background = new Image("src/images/calc/core/chemBackground.png");

				

	}

	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {
		Input input = c.getInput();

	}

	public void render(GameContainer c, StateBasedGame game, Graphics g)
			throws SlickException {
		background.draw();


	}

	public int GetID() {
		return 3;
	}

	public int getID() {
		// TODO Auto-generated method stub
		return 3;
	}

	 
}


