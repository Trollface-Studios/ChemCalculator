package trollface.calc.equations;

public class ArrheniusEquation extends Equation {

	public ArrheniusEquation() {

		friendlyName = "ArrheniusEquation";

		modes = new Properties[][] {
				{ Properties.rc1, Properties.pef1, Properties.ea1, Properties.tempk1 },
				{ Properties.pef1, Properties.rc1, Properties.ea1, Properties.tempk1 },
				{ Properties.ea1, Properties.rc1, Properties.pef1, Properties.tempk1 },
				{ Properties.tempk1, Properties.rc1, Properties.pef1, Properties.ea1 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] * Math.exp( -arguments[2]/ (arguments[3] * 8.3145 )) + " sec^-1";
		case 1:
			return arguments[1] * Math.exp( -arguments[2]/ (arguments[3] * 8.3145 )) + " sec^-1";
		case 2:
			return (Math.log(arguments[1]) - Math.log(arguments[2])) * arguments[3] * 8.3145 + " J*K^-1";
		case 3:
			return arguments[3] / ((Math.log(arguments[1]) - Math.log(arguments[2])) * 8.3145) + " J*K^-1";
		
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}	