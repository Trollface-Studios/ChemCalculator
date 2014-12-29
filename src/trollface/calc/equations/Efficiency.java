package trollface.calc.equations;

public class Efficiency extends Equation {
	static String friendlyName = "Efficiency (performance)";

	static String[][] modes = {
			{ "% efficiency", "Energy Input", "Useful Energy Output" },
			{ "Output", "Energy Input", "Efficiency (in %)" },
			{ "Input", "Useful Energy Output", "Efficiency (in %)" } };

	@Override
	public double calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[0] / arguments[1];
		case 1:
			return arguments[0] * arguments[1] / 100f;
		case 2:
			return arguments[0] * (1 / (arguments[1] / 100));
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return -1;
		}

	}
}
