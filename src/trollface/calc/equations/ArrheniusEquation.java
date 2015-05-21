package trollface.calc.equations;

public class ArrheniusEquation extends Equation {

	public ArrheniusEquation() {

		friendlyName = "Arrhenius Equation";

		modes = new Properties[][] {
				{ Properties.rc1, Properties.pef1, Properties.ea1, Properties.tempk },
				{ Properties.pef1, Properties.rc1	, Properties.ea1, Properties.tempk },
				{ Properties.eaa, Properties.rc1, Properties.pef1, Properties.tempk },
				{ Properties.tempk1, Properties.rc1, Properties.pef1, Properties.ea1 }, 
				{ Properties.eae, Properties.rc1, Properties.tempk1, Properties.rc2, Properties.tempk2 } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[0] * Math.exp( -arguments[1]/ (arguments[2] * 8.3145 )) + " sec^-1";
		case 1:
			return arguments[0] * Math.exp( -arguments[1]/ (arguments[2] * 8.3145 )) + " sec^-1";
		case 2:
			return -(Math.log(arguments[1]/arguments[0])) * arguments[2] * 8.3145 + " J*K^-1";
		case 3:
			return arguments[2] / ((Math.log(arguments[0]) - Math.log(arguments[1])) * 8.3145) + " J*K^-1";
		case 4:
			return -(Math.log(arguments[0]/arguments[2]) * 8.3145) / (1/arguments[1] - 1/arguments[3]) + " J*K^-1";
		
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}	