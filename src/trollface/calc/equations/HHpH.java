package trollface.calc.equations;

public class HHpH extends Equation {

	public HHpH() {

		friendlyName = "Henderson-Hasselbalch (pH-pKa)";

		modes = new Properties[][] {
				{ Properties.ph, Properties.cacid, Properties.cbase, Properties.pka } } ;

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
//				return arguments[3] + arguments[1] + arguments[2] + " ";

		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}