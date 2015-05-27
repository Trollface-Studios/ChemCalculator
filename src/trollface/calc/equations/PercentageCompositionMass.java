package trollface.calc.equations;

public class PercentageCompositionMass extends Equation {

	public PercentageCompositionMass() {

		
		friendlyName = "% composition by mass";


		modes = new Properties[][] {
				{ Properties.comp4, Properties.mass, Properties.masst },
				{ Properties.comp5, Properties.mmass, Properties.mol, Properties.masst },
				{ Properties.comp3, Properties.mmass, Properties.con, Properties.vol, Properties.masst }, };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[0] / arguments[1] * 100 + " %";
		case 1:
			return arguments[0] * arguments[1] / arguments[2] * 100 + "%";
		case 2:
			return arguments[0] * arguments[1] * arguments[2] / arguments[3] * 100 + "%";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}

}