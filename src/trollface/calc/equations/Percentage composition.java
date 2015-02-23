package trollface.calc.equations;

public class Percentage composition extends Equation {

	public Percentage composition by mass() {

		
		friendlyName = "Percentage composition by mass";


		modes = new Properties[][] {
				{ Properties.Mass1, Properties.Mass2 },
				{ Properties.Mmass1, Properties.Mol1, Properties.Mass2 },
				{ Properties.Mmass1, Properties.Con1, Properties.Vol1, Properties.Mass2 },
				{ Properties.Mmass2, Properties.Mol2, Properties.Mass1 },
				{ Properties.Mmass2, Properties.Con2, Properties.Vol2, Properties.Mass1 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[0] / arguments[1] * 100 " %";
		case 1:
			return arguments[0] * arguments[1] / arguments[2] * 100 " %";
		case 2:
			return arguments[0] * arguments[1] * arguments[2] / arguments[3] * 100 " %";
		case 3:
			return arguments[2] / arguments[0] * arguments[1] * 100 " %";
		case 4:
			return arguments[3]	/ arguments[0] * arguments[1] * arguments [2] * 100 " %";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}

	public Percentage composition by mol() {

		
		friendlyName = "Percentage composition by mol";


		modes = new Properties[][] {
				{ Properties.Mol1, Properties.Mol2 },
				{ Properties.Mass1, Properties.Mmass1, Properties.Mol2 },
				{ Properties.Con1, Properties.Vol1, Properties.Mol2 },
				{ Properties.Mass2, Properties.Mmass2, Properties.Mol1 },
				{ Properties.Con2, Properties.Vol2, Properties.Mol1 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[0] / arguments[1] * 100 " %";
		case 1:
			return arguments[0] / arguments[1] / arguments[2] * 100 " %";
		case 2:
			return arguments[0] * arguments[1] / arguments[2] * 100 " %";
		case 3:
			return arguments[2] / arguments[0] * arguments[1] * 100 " %";
		case 4:
			return arguments[2]	/ arguments[0] * arguments[1] * 100 " %";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}