package trollface.calc.core;

import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.TextField;

import trollface.calc.equations.Properties;

public class Textbox {

	String name, units;
	int poradi;
	public boolean isClicked;

	public TextField field;

	public Textbox(Properties type) {
		name = type.name;
		units = type.units;

		field = new TextField(Calculations3.container,
				Calculations3.container.getDefaultFont(), 0, 0, 100, 25);
		field.addListener(new ComponentListener() {

			@Override
			public void componentActivated(AbstractComponent arg0) {

			}
		});
		field.setConsumeEvents(false);
	}

	public void destroyField() {
		field.setAcceptingInput(false);
		field = null;

	}

}
