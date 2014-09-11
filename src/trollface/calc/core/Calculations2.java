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
	Image backgroundM, sipka, sipkaglow;
	boolean glowactive;
	
	public Calculations2(Base game){
		this.game = game;
	}
	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {
		
		backgroundM = new Image ("src/images/calc/core/chemBackgroundM.png");
		sipka = new Image("src/images/calc/core/gobackbutton1.png");
		sipkaglow = new Image("src/images/calc/core/gobackbutton.png");
	}
	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {
		
		Input input = c.getInput();

		int posX = Mouse.getX();
		int posY = Mouse.getY();
		
		if (((Base) game).renderingSmall) {
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
		backgroundM.draw();
		sipka.draw(50, 600);
		if (glowactive == true) {
			sipkaglow.draw(50, 600);

		}
	
	}
		public void mouseClicked(int button, int x, int y, int clickCount) {	

			int posX = Mouse.getX();
			int posY = Mouse.getY();
			
			if (glowactive == true) {

				game.enterState(4);
			}
			}
		public int GetID() {
			return 5;
		}

		public int getID() {
			// TODO Auto-generated method stub
			return 5;
		}

}
