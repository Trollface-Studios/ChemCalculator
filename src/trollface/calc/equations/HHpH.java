package trollface.calc.equations;

import trollface.calc.core.Base;

public class HHpH extends Equation {

	public HHpH() {

		friendlyName = "Henderson-Hasselbalch (pH)";

		modes = new Properties[][] {
				{ Properties.ph1, Properties.pka, Properties.cacid, Properties.cbase },
				{ Properties.poh1, Properties.pkb, Properties.cacid, Properties.cbase },
				{ Properties.ph2, Properties.hcon },
				{ Properties.pka1, Properties.ka1 },
				{ Properties.hcon, Properties.ph2 },
		
				
		} ;

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
				return arguments[0] + Math.log10(arguments[2] / arguments[1]) + " ";
		case 1:
				return arguments[0] + Math.log(arguments[1]  / arguments[2]) + " ";
		case 2:
				return -Math.log10(arguments[0]) + " ";
		case 3:
				return -Math.log10(arguments[0]) + " ";
		case 4:
				return Math.pow(10, -arguments[0]) +" ";
		default:
			Base.log(String.format("ERROR: WRONG MODE SPECIFIED: %d\n", mode));
			return "ERROR. LOL";
		}

	}
}

