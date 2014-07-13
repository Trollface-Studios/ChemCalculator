package trollface.calc.core;


import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.Log;

public class Base extends StateBasedGame {

	private AppGameContainer container;
	private static AppGameContainer app;

	public static void main(String[] args) {
		try {
			app = new AppGameContainer(new Base("calculator"));
		} catch (SlickException e) {

			e.printStackTrace();
		}

		app.setSmoothDeltas(true);
		app.setTargetFrameRate(60);
		app.setVSync(true);

		app.setVerbose(false);
		app.setShowFPS(true);

		try {
			app.start();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Base(String name) {
		super(name);
	}

	public void initStatesList(GameContainer c) throws SlickException {
		addState(new Menu());
//		addState(new Info());
//		addState(new Settings());
//		addState(new Calculations());

	}

	public void ChangeState() {

	}

	
	public void mouseClicked(int button, int x, int y, int clickCount) {
		System.out.println("sup nigga");}

	
}


