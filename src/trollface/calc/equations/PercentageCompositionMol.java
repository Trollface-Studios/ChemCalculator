package trollface.calc.equations;

import trollface.calc.core.Base;

public class PercentageCompositionMol extends Equation {
	
	public PercentageCompositionMol() {

		
		friendlyName = "% composition by mol";


		modes = new Properties[][] {
				{ Properties.comp1, Properties.mol, Properties.molt },
				{ Properties.comp2, Properties.mass, Properties.mmass, Properties.molt },
				{ Properties.comp3, Properties.con, Properties.vol, Properties.molt } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[0] / arguments[1] * 100 + " %";
		case 1:
			return (arguments[0] / arguments[1]) / arguments[2] * 100 + " %";
		case 2:
			return (arguments[0] * arguments[1]) / arguments[2] * 100 + " %";
		default:
			Base.log(String.format("ERROR: WRONG MODE SPECIFIED: %d\n", mode));
			return "ERROR. LOL";
		}

	}
}
