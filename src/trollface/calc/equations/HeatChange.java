package trollface.calc.equations;

public class HeatChange extends Equation {

	public HeatChange() {

		friendlyName = "Heat Change";

		modes = new Properties[][] {
				{ Properties.q1, Properties.mass1, Properties.tempk1, Properties.tempk2, Properties.shc1 },
				{ Properties.q1, Properties.mass1, Properties.dtempk1, Properties.shc1 },
				{ Properties.mass1, Properties.q1, Properties.tempk1, Properties.tempk2, Properties.shc1 },
				{ Properties.shc1, Properties.q1, Properties.mass1, Properties.tempk1, Properties.tempk2 },
				{ Properties.dtempk1, Properties.tempk1, Properties.tempk2 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] * arguments[2] * (arguments[4] - arguments[3]) + " J";
		case 1:
			return arguments[1] * arguments[2] * arguments[3] + " J";
		case 2:
			return arguments[1] / (arguments[2]) * arguments[4] + " g";
		case 3:
			return arguments[1] / ((arguments[4] - arguments[3]) * arguments[2]) + " J*K^-1";
		case 4:
			return arguments[2] - arguments[1] + " K";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}