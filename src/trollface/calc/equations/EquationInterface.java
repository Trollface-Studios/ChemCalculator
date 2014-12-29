package trollface.calc.equations;

public interface EquationInterface {
	String friendlyName = "New Equation";
	String[][] modes = null;

	public double calculate(int mode, double... arguments);
}
