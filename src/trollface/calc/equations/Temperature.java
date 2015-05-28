package trollface.calc.equations;

import trollface.calc.core.Base;

public class Temperature extends Equation {

	public Temperature() {

		friendlyName = "Temperature Conversions";

		modes = new Properties[][] { { Properties.ctok, Properties.tempc },
				{ Properties.ftok, Properties.tempf },
				{ Properties.ktoc, Properties.tempk },
				{ Properties.ftoc, Properties.tempf },
				{ Properties.ctof, Properties.tempc },
				{ Properties.ktof, Properties.tempk }, };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[0] + 273.15 + " K";
		case 1:
			return (arguments[0] - 32) * (5 / 9) + 273.15 + " K";
		case 2:
			return arguments[0] - 273.15 + " °C";
		case 3:
			return (arguments[0] - 32) * (5 / 9) + " °C";
		case 4:
			return arguments[0] * (9 / 5) + 32 + " °F";
		case 5:
			return (arguments[0] - 273.15) * (9 / 5) + 32 + " °F";
		default:
			Base.log(String.format("ERROR: WRONG MODE SPECIFIED: %d\n", mode));
			return "ERROR. LOL";
		}

	}
}