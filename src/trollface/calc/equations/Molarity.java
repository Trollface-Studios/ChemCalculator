package trollface.calc.equations;

public class Molarity extends Equation {

	public Molarity() {

		
		friendlyName = "Molarity";


		modes = new Properties[][] {
<<<<<<< HEAD
				{ Properties.con, Properties.mol, Properties.vol },
				{ Properties.mol, Properties.vol, Properties.con },
				{ Properties.vol, Properties.mol, Properties.con } };
=======
				{ Properties.con1, Properties.mol1, Properties.vol1 },
				{ Properties.mol1, Properties.vol1, Properties.con1 },
				{ Properties.vol1, Properties.mol1, Properties.con1 } };
>>>>>>> af23009e1f13e634357bb2dc20be5794f2ec8aea

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] / arguments[0] + " mol dm-3";
		case 1:
			return arguments[0] * arguments[1] + " mol";
		case 2:
<<<<<<< HEAD
			return arguments[0] * arguments[1] + " dm^-3";
=======
			return arguments[0] * arguments[1] + " dm-3";
>>>>>>> af23009e1f13e634357bb2dc20be5794f2ec8aea
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}