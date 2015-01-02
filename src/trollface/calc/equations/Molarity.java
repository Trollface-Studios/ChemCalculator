package trollface.calc.equations;

public class Molarity extends Equation {

	public Molarity() {

		
		friendlyName = "Molarity";


		modes = new Properties[][] {
				{ Properties.con1, Properties.mol1, Properties.vol1 },
				{ Properties.mol1, Properties.vol1, Properties.con1 },
				{ Properties.vol1, Properties.mol1, Properties.con1 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] / arguments[0] + " mol dm-3";
		case 1:
			return arguments[0] * arguments[1] + " mol";
		case 2:
			return arguments[0] * arguments[1] + " dm-3";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}