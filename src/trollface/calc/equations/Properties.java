package trollface.calc.equations;

public enum Properties {

	// Efficiency - demonstration
	Input("Energy Input", " W"), Output("Useful Energy Output", " W"), Efficiency("Efficiency", " %", 'e'), 
	tempk("Temperature", " K", 'T'), 
	tempc("Temperature", " °C", 'T'), 
	tempf("Temperature", " °F", 'T'),
	tempk1("Temp. of 1st substance", " K", 'T'), 
	tempk2("Temp. of 2nd substance", " K", 'T'), 
	pre1("Pressure of 1st substance", " Pa"), 
	pre2("Pressure of 2nd substance", " Pa"), 
	q1("Quantity of heat", " J"), 
	shc1("Specific heat capacity", " J*K^-1"), 
	dtempk1("Change in temp.", " K"), 
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
	eaa("Act. energy with pre-exponential factor", " J*mol^-1"),
	eae("Act. enregy empirically", " J*mol^-1"),
	cacid("Concentration of acid", " mol*dm^-3" ),
	cbase("Concentration of base", " mol*dm^-3"),
	pka("pKa",""),
	ph("pH", ""), ph1("pH of buffer", " "), ph2("pH from H+ concentration"," "),
	poh("pOH", ""), poh1("pOH of buffer", " "), poh2("pOH from OH- concentration", " "),
	ka("Acid dissociation constant", ""),
	kb("Base dissociation cosntant", ""),
	pkb("pKb", ""),
	hcon("Concentration of H+ ions", " mol*dm^-3"),
	ohcon("Concentration of OH- ions", " mol*dm^-3"),
	;
	
	
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