package trollface.calc.core;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Calculations2 extends BasicGameState{
	Base game;
	
	public Calculations2(Base game){
		this.game = game;
	}
	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {
	}
	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {
		
		Input input = c.getInput();

		int posX = Mouse.getX();
		int posY = Mouse.getY();

	
	}
	public void render(GameContainer c, StateBasedGame game, Graphics g)
			throws SlickException {
	
	}
		public void mouseClicked(int button, int x, int y, int clickCount) {	

			int posX = Mouse.getX();
			int posY = Mouse.getY();
//			if (glowactive == true) {

//				game.enterState(4);
//			}

			
//			if (((Base) game).renderingSmall) {
//				if ((posX > 80 && posY > 160) && (posX < 103 && posY < 180)
//						&& button == Input.MOUSE_LEFT_BUTTON) {
//
//					click[0].isClicked = !click[0].isClicked;
//				}
//
//				if ((posX > 80 && posY > 120) && (posX < 103 && posY < 140)
//						&& button == Input.MOUSE_LEFT_BUTTON) {
//
//					click[1].isClicked = !click[1].isClicked;
//				}
//
//				if ((posX > 80 && posY > 80) && (posX < 103 && posY < 100)
//						&& button == Input.MOUSE_LEFT_BUTTON) {
//
//					click[2].isClicked = !click[2].isClicked;
//				}
//			} else {
//				if ((posX > 400 && posY < 400) && (posX < 423 && posY > 380)
//						&& button == Input.MOUSE_LEFT_BUTTON) {
//
//					click[0].isClicked = !click[0].isClicked;
//				}
//
//				if ((posX > 400 && posY < 360) && (posX < 423 && posY > 340)
//						&& button == Input.MOUSE_LEFT_BUTTON) {
//
//					click[1].isClicked = !click[1].isClicked;
//				}
//
//				if ((posX > 400 && posY < 320) && (posX < 423 && posY > 300)
//						&& button == Input.MOUSE_LEFT_BUTTON) {
//
//					click[2].isClicked = !click[2].isClicked;
//				}
//				
//				if ((posX > 400 && posY < 280) && (posX < 423 && posY > 260)
//						&& button == Input.MOUSE_LEFT_BUTTON) {
//
//					click[3].isClicked = !click[3].isClicked;
//				}
//
//			}
//
//}
}
		public int GetID() {
			return 5;
		}
		@Override
		public int getID() {
			// TODO Auto-generated method stub
			return 5;
		}
}
