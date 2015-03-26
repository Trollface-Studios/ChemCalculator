package trollface.calc.equations;

public enum Properties {

	// Efficiency - demonstration
	Input("Energy Input", "W"), Output("Useful Energy Output", "W"), Efficiency(
			"Efficiency", "%", 'e'), vol1("Volume of first substance", " dm^-3"), mol1(
			"Amount of first substance", " mol"), con1(
			"Concentration of first substance", " mol*dm^-3", 'c'), mass1(
			"Mass of first substance", " g", 'm'), mass2(
			"Mass of second substance", " g", 'm'), mmass1(
			"Molar mass of first substance", " g*mol^-3"), mmass2(
			"Molar mass of second substance", " g*mol^-3"), vol2(
			"Volume of second substance", " dm^-3"), mol2(
			"Amount of second substance", " mol"), con2(
			"Concentration of second substance", " mol*dm^-3", 'c'), comp(
			"Percentage composition", "%"), tempk1(
			"Temperature of first substance", "K", 'T'), tempc1(
			"Temperature of first substance", "°C", 'T'), tempf1(
			"Temperature of first substance", "°F", 'T'), tempk2(
			"Temperature of second substance", "K", 'T'), tempc2(
			"Temperature of second substance", "°C", 'T'), tempf2(
			"Temperature of second substance", "°F", 'T'), pre1(
			"Pressure of first substance", "Pa"), pre2(
			"Pressure of second substance", "Pa"), q1("Quantity of heat", "J"), shc1(
			"Specific heat capacity", "J*K^-1"), dtempc1(
			"Change in temperature", "°C"), dtempk1("Change in temperature",
			"K"), dtempf1("Change in temperature", "°F"), rc1("Rate constant",
			"sec^-1"), pef1("Pre-exponential factor", "sec^-1", 'A'), ea1(
			"Activation energy", "J*mol^-1");

	public final String name;
	public final String units;
	public final char shortened;

	Properties(String name, String units, char shortened) {

		this.name = name;
		this.units = units;
		this.shortened = shortened;
	}

	Properties(String name, String units) {

		this.name = name;
		this.units = units;
		this.shortened = '!';

	}

}