package trollface.calc.equations;

public enum Properties {

	// Efficiency - demonstration
	Input("Energy Input", "W"), Output("Useful Energy Output", "W"), Efficiency(		
			"Efficiency", "%", 'e'), vol1("Volume", " dm-3"), mol1("Amount of substance", " mol"), con1(
			"Concentration", " mol dm-3", 'c');

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