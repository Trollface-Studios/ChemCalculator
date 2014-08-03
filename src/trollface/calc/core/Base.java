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
		 try {
		 app.setDisplayMode(1200, 700, false);
		 } catch (SlickException e1) {
		 System.out.println("Setting resolution failed, reverting to basics: ");
		 e1.printStackTrace();
		 }
		app.setVerbose(false);
		app.setShowFPS(true);

		try {
			app.start();
		} catch (SlickException e) {
			System.out.println("App didn't start for some goddamn reason. ");
			System.out.println("Here, catch this trace: ");
			e.printStackTrace();
		}
	}

	public Base(String name) {
		super(name);
	}

	public void initStatesList(GameContainer c) throws SlickException {
		addState(new Menu(this));
		addState(new Info(this));
		addState(new Settings(this));
		addState(new Calculations(this));

	}

	public void ChangeState() {

	}

}
