package trollface.calc.core;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Base extends StateBasedGame {
	private static final boolean LOG_ENABLED = false;
	public static boolean renderingSmall = false;
	public static boolean printErrors = false;
	public static boolean printRoutineDebug = false;

	private static AppGameContainer app;

	public static void main(String[] args) {
		try {
			System.out.println("Running ChemCalc v1.0...");
			app = new AppGameContainer(new Base("calculator"));
		} catch (SlickException e) {

			if (Base.printErrors) {
				if (Base.printErrors) {
					e.printStackTrace();
				}
			}
		}

		app.setSmoothDeltas(true);
		app.setTargetFrameRate(60);
		app.setVSync(true);

		// ADD RES DETECTION HERE
		if (!renderingSmall) {

			try {
				app.setDisplayMode(1200, 700, false);
			} catch (SlickException e1) {
				System.out
						.println("Setting resolution failed, reverting to basics: ");
				e1.printStackTrace();
			}
		}
		app.setVerbose(false);
		app.setShowFPS(true);

		try {
			app.start();
		} catch (SlickException e) {
			Base.log("App didn't start for some goddamn reason. ");
			Base.log("Here, catch this trace: ");
			if (Base.printErrors) {
				if (Base.printErrors) {
					if (Base.printErrors) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void log(String string) {
		if (LOG_ENABLED) {
			System.out.print(string);
		}
	}

	public Base(String name) {
		super(name);
	}

	public void initStatesList(GameContainer c) throws SlickException {

		addState(new Menu(this));
		addState(new Info(this));
		addState(new Credits(this));
		addState(new Crossroad(this));
		addState(new Calculations3(this));

	}

}
