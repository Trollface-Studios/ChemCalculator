package trollface.calc.core;

public class Textbox {
	
	String name, units;
	int poradi;
	public boolean isClicked; 
	public Textbox(String Type){
		switch(Type){
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
		case "concetration":
			name = "Concentration";
			units = "mol/l";
			poradi = 4;
		}
	}

}
