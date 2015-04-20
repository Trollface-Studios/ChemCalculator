package trollface.calc.equations;

public class PercentageCompositionMass extends Equation {

	public PercentageCompositionMass() {

		
		friendlyName = "Percentage composition by mass";


		modes = new Properties[][] {
				{ Properties.comp, Properties.vol1, Properties.mass2 },
				{ Properties.comp, Properties.mmass1, Properties.mol1, Properties.mass2 },
				{ Properties.comp, Properties.mmass1, Properties.con1, Properties.vol1, Properties.mass2 },
				{ Properties.comp, Properties.mmass2, Properties.mol2, Properties.vol1 },
				{ Properties.comp, Properties.mmass2, Properties.con2, Properties.vol2, Properties.vol1 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] / arguments[2] * 100 + " %";
		case 1:
			return arguments[1] * arguments[2] / arguments[3] * 100 + "%";
		case 2:
			return arguments[1] * arguments[2] * arguments[3] / arguments[4] * 100 + "%";
		case 3:
			return arguments[3] / arguments[1] * arguments[2] * 100 + "%";
		case 4:
			return arguments[4]	/ arguments[1] * arguments[2] * arguments [3] * 100 + "%";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}

}