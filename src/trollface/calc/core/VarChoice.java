package trollface.calc.core;

public class VarChoice {

	boolean isClicked;
	String[] Vars = { "volume", "concentration", "molarmass", "name", "mass",
			"n" };

	public VarChoice(String name) {
		switch (name) {
		case "Concentration":

			Base.log("AHOOOOJJ");
			// n, V, M, n, name

			break;
		case "Molarmass":
			break;
		case "n":

			// V,c,M/name,m
			break;
		case "Mass":

			// n,M
			break;
		default:
			Base.log("sup");
			break;
		}

	}
}