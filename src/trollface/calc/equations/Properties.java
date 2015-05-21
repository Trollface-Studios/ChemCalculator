package trollface.calc.equations;

public enum Properties {

	// Efficiency - demonstration
<<<<<<< HEAD
	Input("Energy Input", " W"), Output("Useful Energy Output", " W"), Efficiency("Efficiency", " %", 'e'), 
	vol1("Volume of 1st substance", " dm^-3"), 
=======
	Input("Energy Input", "W"), Output("Useful Energy Output", "W"), Efficiency("Efficiency", "%", 'e'), 
<<<<<<< HEAD
	vol1("Volume of 1st substance", " dm^3"), 
>>>>>>> origin/master
=======
	vol1("Volume of 1st substance", " dm^-3"), 
>>>>>>> af23009e1f13e634357bb2dc20be5794f2ec8aea
	mol1("Amount of 1st substance", " mol"), 
	con1("Conc. of 1st substance", " mol*dm^-3", 'c'),
	mass1("Mass of 1st substance", " g", 'm'),
	mass2("Mass of 2nd substance", " g", 'm'),
	mmass1("Molar mass of 1st substance", " g*mol^-3"),
	mmass2("Molar mass of 2nd substance", " g*mol^-3"), 
	vol2("Volume of 2nd substance", " dm^-3"),
	mol2("Amount of 2nd substance", " mol"),
	con2("Conc. of 2nd substance", " mol*dm^-3", 'c'),
<<<<<<< HEAD
	comp(" Percentage composition", " %"),
	tempk("Temperature in Kelvin", " K", 'T'), 
	tempc("Temperature in Celsius", " °C", 'T'), 
	tempf("Temperature in Farenheit", " °F", 'T'),
	tempk1("Temp. of 1st substance in Kelvin", " K", 'T'), 
	tempc1("Temp. of 1st substance in Celsius", " °C", 'T'), 
	tempf1("Temp. of 1st substance in Farenheit", " °F", 'T'), 
	tempk2("Temp. of 2nd substance in Kelvin", " K", 'T'), 
	tempc2("Temp. of 2nd substance in Celsius", " °C", 'T'), 
	tempf2("Temp. of 2nd substance in Farenheit", " °F", 'T'),
	pre1("Pressure of 1st substance", " Pa"), 
	pre2("Pressure of 2nd substance", " Pa"), 
	q1("Quantity of heat", " J"), 
	shc1("Specific heat capacity", " J*K^-1"), 
	dtempc1("Change in temp.", " °C"), 
	dtempk1("Change in temp.", " K"), 
	dtempf1("Change in temp.", " °F"), 
	rc("Rate constant"," sec^-1"),
	rc1("First rate constant", " sec^-1"),
	rc2("Second rate constant", " sec^-1"),
	pef1("Pre-exponential factor", " sec^-1", 'A'), 
	ea1("Activation energy", " J*mol^-1"), 
	ctok("Celsius to Kelvin", " K", 'T'), 
	ftok("Farenheit to Kelvin", " K", 'T'),
	ktoc("Kelvin to Celsius", " °C", 'T'),
	ftoc("Farenheit to Celsius", " °C", 'T'),
	ctof("Celsius to Farenheit", " °F", 'T'),
	ktof("Kelvin to Farenheit", " °F", 'T'),
	comp1("From number of mol", " %"),
	comp2("From mass and molar mass", " %"),
	comp3("From volume and concentration", " %"),
	molt("Total number mol"," mol"),
	mol("Number of mol", " mol"),
	con("Concentration"," mol*dm^-3"),
	vol("Volume"," dm^-3"),
	mass("Mass", " g"),
	mmass("Molar mass", " g*mol^-3"),
	masst("Total mass", " g"),
	comp4("From mass", " %"),
	comp5("From number of mol", " %"),
	pre("Pressure", " Pa"),
	dtemp("Change in temperature"," °C/K"),
	eaa("Activation energy with pre-exponential factor", " J*mol^-1"),
	eae("Activation energy empirically", " J*mol^-1"),
	
	
	;

=======
	comp(" % composition", "%"),
	tempk("Temperature in Kelvin", "K", 'T'), 
	tempc("Temperature in Celsius", "°C", 'T'), 
	tempf("Temperature in Farenheit", "°F", 'T'),
	tempk1("Temp. of 1st substance in Kelvin", "K", 'T'), 
	tempc1("Temp. of 1st substance in Celsius", "°C", 'T'), 
	tempf1("Temp. of 1st substance in Farenheit", "°F", 'T'), 
	tempk2("Temp. of 2nd substance in Kelvin", "K", 'T'), 
	tempc2("Temp. of 2nd substance in Celsius", "°C", 'T'), 
	tempf2("Temp. of 2nd substance in Farenheit", "°F", 'T'),
	pre1("Pressure of 1st substance", "Pa"), 
	pre2("Pressure of 2nd substance", "Pa"), 
	q1("Quantity of heat", "J"), 
	shc1("Specific heat capacity", "J*K^-1"), 
	dtempc1("Change in temp.", "°C"), 
	dtempk1("Change in temp.", "K"), 
	dtempf1("Change in temp.", "°F"), 
	rc1("Rate constant","sec^-1"), 
	pef1("Pre-exponential factor", "sec^-1", 'A'), 
	ea1("Activation energy", "J*mol^-1"), 
	ctok("From Celsius to Kelvin", "K", 'T'), 
	ftok("From Farenheit to Kelvin", "K", 'T'),
	ktoc("From Kelvin to Celsius", "°C", 'T'),
	ftoc("From Farenheit to Celsius", "°C", 'T'),
	ctof("From Celsius to Farenheit", "°F", 'T'),
<<<<<<< HEAD
	ktof("From Kelvin to Farenheit", "°F", 'T'),
	cacid("Concentration of acid", " mol*dm^-3" ),
	cbase("Concentration of base", " mol*dm^-3"),
	pka("pKa",""),
	ph ("   pH  ", "");
	
	
>>>>>>> origin/master
=======
	ktof("From Kelvin to Farenheit", "°F", 'T');

>>>>>>> af23009e1f13e634357bb2dc20be5794f2ec8aea
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