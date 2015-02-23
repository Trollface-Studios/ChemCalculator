package trollface.calc.equations;

public class Temperature extends Equation {

	public Temperature() {

		
		friendlyName = "Temperature";


		modes = new Properties[][] {
				{ Properties.TempK1, Properties.TempC1 },
				{ Properties.TempK1, Properties.TempF1 },
				{ Properties.TempC1, Properties.TempK1 },
				{ Properties.TempC1, Properties.TempF1 },
				{ Properties.TempF1, Properties.TempC1
				{ Properties.TempF1, Properties.TempK1 }, };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[0] + 273.15 " K";
		case 1:
			return (arguments[0] - 32) * (5/9) + 273.15 " K";
		case 2:
			return arguments[0] - 273.15 " °C";
		case 3:
			return (arguments[0] - 32) * (5/9) " °C";
		case 4:
			return arguments[0] * (9/5) + 32 " °F";
		case 5:
			return (arguments[0] - 273.15) * (9/5) +32 " °F";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}