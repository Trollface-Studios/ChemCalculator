package trollface.calc.core;

import java.awt.Font;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import trollface.calc.equations.Efficiency;
import trollface.calc.equations.Equation;
import trollface.calc.equations.Properties;

public class Calculations3 extends BasicGameState {
	public static final int equationCount = 2;

	// Keep track of globals
	Base game;
	public static GameContainer container;

	// Keep track of what is enabled and showing atm
	static int EquationEnabled, ModeEnabled = -2;
	Textbox activeVars[] = new Textbox[20];

	// Keep every calculation option in memory
	Equation[] equations = new Equation[equationCount];
	String answer;

	// Buttons
	MouseOverArea[] buttons = new MouseOverArea[equationCount];
	MouseOverArea returnButton, sendButton;
	MouseOverArea[] modeButtons;

	// Declare images and fonts
	Image backgroundM, sipka, plusbutton, genericButton, i_sendButton;
	TrueTypeFont f_heading, f_subheading, f_answer, f_rest;

	// Remember whether we're already rendering, and what we're rendering
	private boolean rendering;
	private boolean inSelection = true;

	// Math constants
	int width, height;
	private static final int MODE_BUTTON_EDGE = 140, MODE_BUTTON_SPACE = 20;
	private static final int MODE_BUTTON_HEIGHT = 50;

	// ------- BASIC METHODS ------

	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {

		// Note container's position, initialize values
		container = c;
		answer = "";
		width = c.getWidth();
		height = c.getHeight();

		// Create images
		backgroundM = new Image("src/trollface/calc/images/chemBackgroundM.png");
		sipka = new Image("src/trollface/calc/images/gobackbuttonM.jpg");
		plusbutton = new Image("src/trollface/calc/images/plusbutton.png");
		genericButton = new Image(
				"src/trollface/calc/images/generic_button.png")
				.getScaledCopy(0.35f);
		i_sendButton = new Image("src/trollface/calc/images/send_button.png");

		rendering = true;

		// Load fonts
		f_heading = new TrueTypeFont(new Font("Cambria", Font.BOLD, 25), true);
		f_subheading = new TrueTypeFont(new Font("Cambria", Font.PLAIN, 18),
				true);
		f_answer = new TrueTypeFont(new Font("Times New Roman", Font.BOLD, 25),
				true);
		f_rest = new TrueTypeFont(new Font("Cambria", Font.PLAIN, 15), true);

		// Load equations
		equations[0] = new Efficiency();
		equations[1] = new Efficiency();

		// Selection buttons
		for (int a = 0; a < equationCount; a++) {
			buttons[a] = new MouseOverArea(c, genericButton, new Rectangle(60,
					120 + 40 * a, 20, 20));
			buttons[a].setMouseOverImage(plusbutton);
		}

		// Return button
		returnButton = new MouseOverArea(c, sipka, new Rectangle(50, 600, 50,
				50));

		// Send button
		sendButton = new MouseOverArea(c, i_sendButton, new Rectangle(50, 550,
				50, 50));

	}

	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {

		Mouse.getX();
		Mouse.getY();

	}

	public void render(GameContainer c, StateBasedGame game, Graphics g)

	throws SlickException {

		if (rendering) {

			// Draw background
			backgroundM.draw();

			// Draw buttons
			returnButton.render(c, g);

			if (inSelection) {
				for (int a = 0; a < buttons.length; a++) {
					MouseOverArea button = buttons[a];
					button.render(c, g);
					g.drawString(equations[a].friendlyName, button.getX(),
							button.getY());

				}

			} else {

				if (ModeEnabled >= 0) {
					sendButton.render(c, g);
					// Draw input fields

					try {

						for (int a = 0; a < activeVars.length; a++) {

							activeVars[a].field.render(c, g);

							g.drawString(activeVars[a].name,
									activeVars[a].field.getX() - 200,
									activeVars[a].field.getY() + 5);
							g.drawString(activeVars[a].units,
									activeVars[a].field.getX() + 105,
									activeVars[a].field.getY() + 5);

						}
					} catch (Exception e) {
						if (Base.printErrors)
							e.printStackTrace();

					}
				}
				// Equation name
				g.setFont(f_heading);
				String header = equations[EquationEnabled].friendlyName;
				g.drawString(header,
						width / 2 - f_heading.getWidth(header) / 2, 125);

				// MODES
				g.setFont(f_subheading);
				g.drawString(
						"What do you want to calculate?",
						width
								/ 2
								- f_subheading
										.getWidth("What do you want to calculate?")
								/ 2, 160);

				g.setFont(f_rest);

				for (int a = 0; a < modeButtons.length; a++) {
					MouseOverArea button = modeButtons[a];
					if (a == ModeEnabled) {
						g.setColor(Color.orange);
					}
					g.fill(new Rectangle(button.getX(), button.getY(), button
							.getWidth(), button.getHeight()));
					g.setColor(Color.green);
					g.drawString(equations[EquationEnabled].modes[a][0].name,
							button.getX(), button.getY());
					g.setColor(Color.white);
				}

				// Answer
				g.setFont(f_subheading);
				g.drawString("ANSWER:",
						width / 2 - f_subheading.getWidth("ANSWER:") / 2, 560);
				g.setFont(f_answer);
				g.drawString(answer, width / 2 - f_answer.getWidth(answer) / 2,
						600);

			}
		} else
			init(c, game);
	}

	// -------- UPDATES -----

	public void mouseClicked(int button, int x, int y, int clickCount) {

		if (inSelection) {

			// Equation picker buttons
			for (int a = 0; a < buttons.length; a++) {
				if (buttons[a].isMouseOver()) {
					flipSelection();
					switchVars(a, -1);
				}

				// Return button
				if (returnButton.isMouseOver()) {

					game.enterState(0);

				}
			}
		} else {
			// Not in selection
			if (returnButton.isMouseOver()) {
				flipSelection();
				clearFields();
			}
			if (sendButton.isMouseOver()) {
				calculate();

			}
			try {
				for (int a = 0; a < modeButtons.length; a++) {
					if (modeButtons[a].isMouseOver()) {
						switchVars(EquationEnabled, a);
					}
				}
			} catch (Exception e) {
			}
		}

	}

	@Override
	public void keyPressed(int key, char c) {

		switch (key) {

		case Input.KEY_ENTER:
		case Input.KEY_SPACE:
			calculate();
			break;

		case Input.KEY_ESCAPE:
			game.enterState(0);
			break;
		}
	}

	void calculate() {
		try {
			switch (equations[EquationEnabled].modes[ModeEnabled].length) {
			case 2:
				answer = equations[EquationEnabled].calculate(ModeEnabled,
						Double.parseDouble(activeVars[0].field.getText())) + "";
				break;
			case 3:
				answer = equations[EquationEnabled].calculate(ModeEnabled,
						Double.parseDouble(activeVars[0].field.getText()),
						Double.parseDouble(activeVars[1].field.getText()))
						+ "";
				break;
			case 4:
				answer = equations[EquationEnabled].calculate(ModeEnabled,
						Double.parseDouble(activeVars[0].field.getText()),
						Double.parseDouble(activeVars[1].field.getText()),
						Double.parseDouble(activeVars[2].field.getText()))
						+ "";
				break;
			case 5:
				answer = equations[EquationEnabled].calculate(ModeEnabled,
						Double.parseDouble(activeVars[0].field.getText()),
						Double.parseDouble(activeVars[1].field.getText()),
						Double.parseDouble(activeVars[2].field.getText()),
						Double.parseDouble(activeVars[3].field.getText()))
						+ "";
				break;
			case 6:
				answer = equations[EquationEnabled].calculate(ModeEnabled,
						Double.parseDouble(activeVars[0].field.getText()),
						Double.parseDouble(activeVars[1].field.getText()),
						Double.parseDouble(activeVars[2].field.getText()),
						Double.parseDouble(activeVars[3].field.getText()),
						Double.parseDouble(activeVars[4].field.getText()))
						+ "";
				break;
			default:
				System.out.println("Unsupported parameter count, sorry.");

			}

		} catch (Exception e) {
			answer = "ERROR O__O";
		}

	}

	void clearFields() {
		ModeEnabled = -2;
		modeButtons = null;

	}

	void flipSelection() {
		inSelection = !inSelection;

		for (MouseOverArea button : buttons) {
			button.setAcceptingInput(!button.isAcceptingInput());
		}

	}

	void purgeVars() {
		for (int a = 0; a < activeVars.length; a++) {
			try {
				activeVars[a].destroyField();
			} catch (Exception e) {
				;
			}
			activeVars[a] = null;

		}
	}

	public void switchVars(int equation, int mode) {

		// Ensure we're actually switching
		if (!(ModeEnabled == mode && EquationEnabled == equation)) {
			if (mode == -1) {
				modeButtons = new MouseOverArea[equations[equation].modes.length];

				for (int a = 0; a < modeButtons.length; a++) {
					modeButtons[a] = new MouseOverArea(
							container,
							sipka,
							new Rectangle(
									width
											/ 2
											- (modeButtons.length
													* (MODE_BUTTON_EDGE + MODE_BUTTON_SPACE) / 2)
											+ ((MODE_BUTTON_EDGE + MODE_BUTTON_SPACE) * a),
									190, MODE_BUTTON_EDGE, MODE_BUTTON_HEIGHT));
				}

			} else {

				System.out.println("Switching to " + equation + " " + mode);
				ModeEnabled = mode;
				EquationEnabled = equation;

				// Clear out the vars
				purgeVars();

				// Set new vars

				Properties[] myMode = equations[equation].modes[mode];
				activeVars = new Textbox[myMode.length - 1];

				for (int a = 0; a < myMode.length - 1; a++) {
					activeVars[a] = new Textbox(myMode[a + 1]);
				}

				// Create fields for new vars
				int initX = 300, initY = 350, count = 0;
				for (int a = 0; a < activeVars.length; a++) {
					if (activeVars[a] != null) {
						activeVars[a].field.setLocation(initX, initY
								+ ((count - 1) * 40));
						count++;

					}
				}
			}
		} else {
			System.out.println("The type " + equation + " " + mode
					+ " is already selected!");
		}

	}

	// ------- CONSTRUCTOR --------
	public Calculations3(Base game) {
		this.game = game;
	}

	public int getID() {
		return 5;
	}

}