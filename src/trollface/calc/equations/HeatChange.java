package trollface.calc.equations;

public class HeatChange extends Equation {

	public HeatChange() {

		friendlyName = "Heat Change";

		modes = new Properties[][] {
				{ Properties.q1, Properties.mass, Properties.dtemp, Properties.shc1 },
				{ Properties.mass, Properties.q1, Properties.dtemp, Properties.shc1 },
				{ Properties.shc1, Properties.q1, Properties.mass, Properties.dtemp },
				{ Properties.dtemp, Properties.q1, Properties.mass, Properties.shc1 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[0] * arguments[1] * arguments[2] + " J";
		case 1:
			return arguments[0] / (arguments[1] * arguments[2]) + " g";
		case 2:
			return arguments[0] / (arguments[1] * arguments[2]) + " J*K^-1";
		case 3:
			return arguments[0] / (arguments[1] * arguments[2]) + " K";
		case 4:
			return arguments[0] / (arguments[1] * arguments[2]) + " °C/K";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}