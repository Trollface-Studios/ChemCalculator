package trollface.calc.equations;

public class PercentageCompositionMol extends Equation {
	
	public PercentageCompositionMol() {

		
		friendlyName = "Percentage composition by mol";


		modes = new Properties[][] {
				{ Properties.comp, Properties.mol1, Properties.mol2 },
				{ Properties.comp, Properties.mass1, Properties.mmass1, Properties.mol2 },
				{ Properties.comp, Properties.con1, Properties.vol1, Properties.mol2 },
				{ Properties.comp, Properties.mass2, Properties.mmass2, Properties.mol1 },
				{ Properties.comp, Properties.con2, Properties.vol2, Properties.mol1 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] / arguments[2] * 100 + " %";
		case 1:
			return arguments[1] / arguments[2] / arguments[3] * 100 + " %";
		case 2:
			return arguments[1] * arguments[2] / arguments[3] * 100 + " %";
		case 3:
			return arguments[3] / arguments[1] * arguments[2] * 100 + " %";
		case 4:
			return arguments[3]	/ arguments[1] * arguments[2] * 100 + " %";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}
