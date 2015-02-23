package trollface.calc.equations;

public class HHpH extends Equation {

	public HHpH() {

		
		friendlyName = "Henderson-Hasselbach (pH-pKa)";


		modes = new Properties[][] {
				{ Properties.con1, Properties.mol1, Properties.vol1 },
				{ Properties.mol1, Properties.vol1, Properties.con1 },
				{ Properties.vol1, Properties.mol1, Properties.con1 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] / arguments[0] + " ";
		case 1:
			return arguments[0] * arguments[1] + " ";
		case 2:
			return arguments[0] * arguments[1] + " ";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}