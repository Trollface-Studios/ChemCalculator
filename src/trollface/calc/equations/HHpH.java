package trollface.calc.equations;

public class HHpH extends Equation {

	public HHpH() {

		friendlyName = "Henderson-Hasselbalch (pH)";

		modes = new Properties[][] {
				{ Properties.ph, Properties.pka, Properties.cacid, Properties.cbase } } ;

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
				return arguments[1] + Math.log10(arguments[3]/ arguments[2]) + " ";
		case 1:
				return arguments[0] - Math.log10(arguments[3]/ arguments[2]) + " ";

		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}

