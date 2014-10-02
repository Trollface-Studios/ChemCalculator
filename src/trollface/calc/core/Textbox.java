package trollface.calc.core;

import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.TextField;

public class Textbox {

	String name, units;
	int poradi;
	public boolean isClicked;

	public TextField field;

	public Textbox(String Type) { 

		switch (Type) {
		case "molarmass":
			name = "Molar mass";
			units = "g/mol";
			poradi = 1;
			break;
		case "mass":
			name = "Mass";
			units = "g";
			poradi = 2;
			break;
		case "n":
			name = "n";
			units = "mol";
			poradi = 3;
			break;
		case "concentration":
			name = "Concentration";
			units = "mol/l";
			poradi = 4;
			break;
		case "volume":
			name = "Volume";
			units = "l";
			poradi = 5;
			break;
		default:
			System.out.println("Wrong textbox type specified: " + Type);
		}
		field = new TextField(Calculations.con,
				Calculations.con.getDefaultFont(), 0, 0, 100, 25);
		field.addListener(new ComponentListener() {


			@Override
			public void componentActivated(AbstractComponent arg0) {
 
				TextField field = (TextField) arg0;
				

			}
		});
		field.setConsumeEvents(false);
	}

	/**
	 * 
	 */
	public void destroyField() { 
		field.setAcceptingInput(false);
		field = null;
		

	}

}
