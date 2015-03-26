package trollface.calc.equations;

public class IdealGasEquation extends Equation {

	public IdealGasEquation() {

		friendlyName = "Ideal gas equation";

		modes = new Properties[][] {
				{ Properties.pre1, Properties.mol1, Properties.tempk1,
						Properties.vol1 },
				{ Properties.vol1, Properties.mol1, Properties.tempk1,
						Properties.pre1 },
				{ Properties.mol1, Properties.pre1, Properties.vol1,
						Properties.tempk1 },
				{ Properties.tempk1, Properties.pre1, Properties.vol1,
						Properties.mol1 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] * arguments[2] / arguments[3] * 8.3145 + " Pa";
		case 1:
			return arguments[1] * arguments[2] / arguments[3] * 8.3145
					+ " dm-3";
		case 2:
			return arguments[1] * arguments[2] / arguments[3] * 8.3145 + " mol";
		case 3:
			return arguments[1] * arguments[2] / arguments[3] * 8.3145 + " K";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}