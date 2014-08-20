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

public class Calculations2 extends BasicGameState{
	private static AppGameContainer app;
	Base game;
	Image backgroundM;
	
	public Calculations2(Base game){
		this.game = game;
	}
	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {
		
		backgroundM = new Image ("src/images/calc/core/chemBackgroundM.png");
	}
	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {
		
		Input input = c.getInput();

		int posX = Mouse.getX();
		int posY = Mouse.getY();

	
	}
	public void render(GameContainer c, StateBasedGame game, Graphics g)
			throws SlickException {
		backgroundM.draw();
	
	}
		public void mouseClicked(int button, int x, int y, int clickCount) {	

			int posX = Mouse.getX();
			int posY = Mouse.getY();
			}
		public int GetID() {
			return 5;
		}

		public int getID() {
			// TODO Auto-generated method stub
			return 5;
		}

}
