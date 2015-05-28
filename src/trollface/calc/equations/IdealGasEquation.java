package trollface.calc.equations;

import trollface.calc.core.Base;

public class IdealGasEquation extends Equation {

	public IdealGasEquation() {

		friendlyName = "Ideal gas equation";

		modes = new Properties[][] {
				{ Properties.pre, Properties.mol, Properties.tempk, Properties.vol },
				{ Properties.vol, Properties.mol, Properties.tempk, Properties.pre },
				{ Properties.mol, Properties.pre, Properties.vol, Properties.tempk },
				{ Properties.tempk, Properties.pre, Properties.vol, Properties.mol } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[0] * arguments[1] / arguments[2] * 8.3145 + " Pa";
		case 1:
			return arguments[0] * arguments[1] / arguments[2] * 8.3145
					+ " dm-3";
		case 2:
			return arguments[0] * arguments[1] / arguments[2] * 8.3145 + " mol";
		case 3:
			return arguments[0] * arguments[1] / arguments[2] * 8.3145 + " K";
		default:
			Base.log(String.format("ERROR: WRONG MODE SPECIFIED: %d\n", mode));
			return "ERROR. LOL";
		}

	}
}