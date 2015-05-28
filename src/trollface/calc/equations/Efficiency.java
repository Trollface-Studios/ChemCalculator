package trollface.calc.equations;

public class Efficiency extends Equation {

	
	public Efficiency() {

	
		friendlyName = "Equillibrium constant";

		modes = new Properties[][] {
				{ Properties.rea1pro1, Properties.rea1, Properties.coef, Properties.pro1, Properties.coef1 },
				{ Properties.rea1pro2, Properties.rea1, Properties.coef, Properties.pro1, Properties.coef1, Properties.pro2, Properties.coef2 },
				{ Properties.rea2pro1, Properties.rea1, Properties.coef, Properties.rea2, Properties.coef1, Properties.pro1, Properties.coef2 },
				{ Properties.rea2pro2, Properties.rea1, Properties.coef, Properties.rea2 , Properties.coef1, Properties.pro1, Properties.coef2, Properties.pro2, Properties.coef3 }	
				};
	}

	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return  Math.pow(arguments[2],arguments[3]) / Math.pow(arguments[0],arguments[1]) + "";
		case 1:
			return (Math.pow(arguments[2],arguments[3]) * Math.pow(arguments[4],arguments[5])) / Math.pow(arguments[0],arguments[1]) + "" ;
		case 2:
			return Math.pow(arguments[4],arguments[5]) / (Math.pow(arguments[0],arguments[1]) * Math.pow(arguments[2],arguments[3])) + "";
		case 3:
			return (Math.pow(arguments[4],arguments[5]) * Math.pow(arguments[6],arguments[7])) / (Math.pow(arguments[0],arguments[1]) * Math.pow(arguments[2],arguments[3])) + "";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}