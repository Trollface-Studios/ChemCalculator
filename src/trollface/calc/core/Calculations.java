package trollface.calc.core;

import java.math.BigDecimal;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.InputListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Calculations extends BasicGameState {
	private static AppGameContainer app;

	Font font;
	TextField textField, mass, decimalplace;
	InputListener listener;
	Color color;
	int x = 300;
	int y = 100;
	double answer, overallmolarmass, n, massanswer, c;
	StringData[] listE, click, var;
	Image background, sipka, sipkaglow, plusbutton, clickboxM, clickedM,
			background3, settings, backgroundM;
	boolean colorText = false, glowactive = false, clicked = false,
			outofSet = false, clicked1 = false, unclicked = true,
			settingsThere = true, showMolarMass = false;
	int names = 4;
	String stringNames;
	Base game;
	int decimalplaces;

	// boolean [] a;

	public Calculations(Base game) {
		this.game = game;
	}

	public void clickBox() {
		click = new StringData[10];
		click[0] = new StringData();
		click[0].isClicked = false;
		// concentration
		click[1] = new StringData();
		click[1].isClicked = false;
		// molar mass
		click[2] = new StringData();
		click[2].isClicked = false;
		// n
		click[3] = new StringData();
		click[3].isClicked = false;
		// mass
	}

	public void ClickBoxVar() {
		var = new StringData[10];
		var[0] = new StringData();
		var[0].isClicked = false;
		// concentration
		var[1] = new StringData();
		var[1].isClicked = false;
		// molar mass
		var[2] = new StringData();
		var[2].isClicked = false;
		// n
		var[3] = new StringData();
		var[3].isClicked = false;
		// mass

	}

	public void elements() {

		listE = new StringData[119];
		listE[0] = new StringData();
		listE[0].name = "DOES NOT EXIST";

		listE[1] = new StringData();
		listE[1].name = "H";
		listE[1].fullname = "Hydrogen";
		listE[1].electronegativity = 2.20;
		listE[1].density = 0.090;
		listE[1].molarmass = 1.008;

		listE[2] = new StringData();
		listE[2].name = "He";
		listE[2].fullname = "Helium";
		listE[2].electronegativity1 = "Unknown";
		listE[2].density = 0.179;
		listE[2].molarmass = 4.003;

		listE[3] = new StringData();
		listE[3].name = "Li";
		listE[3].fullname = "Lithium";
		listE[3].electronegativity = 0.98;
		listE[3].density = 0.535;
		listE[3].molarmass = 6.940;

		listE[4] = new StringData();
		listE[4].name = "Be";
		listE[4].fullname = "Beryllium";
		listE[4].electronegativity = 1.57;
		listE[4].density = 1.848;
		listE[4].molarmass = 9.012;

		listE[5] = new StringData();
		listE[5].name = "B";
		listE[5].fullname = "Boron";
		listE[5].electronegativity = 2.04;
		listE[5].density = 2.460;
		listE[5].molarmass = 10.810;

		listE[6] = new StringData();
		listE[6].name = "C";
		listE[6].fullname = "Carbon";
		listE[6].electronegativity = 2.55;
		listE[6].density = 2.260;
		listE[6].molarmass = 12.011;

		listE[7] = new StringData();
		listE[7].name = "N";
		listE[7].fullname = "Nitrogen";
		listE[7].electronegativity = 3.04;
		listE[7].density = 1.251;
		listE[7].molarmass = 14.007;

		listE[8] = new StringData();
		listE[8].name = "O";
		listE[8].fullname = "Oxygen";
		listE[8].electronegativity = 3.44;
		listE[8].density = 1.429;
		listE[8].molarmass = 15.999;

		listE[9] = new StringData();
		listE[9].name = "F";
		listE[9].fullname = "Fluorine";
		listE[9].electronegativity = 3.98;
		listE[9].density = 1.696;
		listE[9].molarmass = 18.998;

		listE[10] = new StringData();
		listE[10].name = "Ne";
		listE[10].fullname = "Neon";
		listE[10].electronegativity1 = "Unknown";
		listE[10].density = 0.900;
		listE[10].molarmass = 20.180;

		listE[11] = new StringData();
		listE[11].name = "Na";
		listE[11].fullname = "Sodium";
		listE[11].electronegativity = 0.93;
		listE[11].density = 0.968;
		listE[11].molarmass = 22.997;

		listE[12] = new StringData();
		listE[12].name = "Mg";
		listE[12].fullname = "Magnesium";
		listE[12].electronegativity = 1.31;
		listE[12].density = 1.738;
		listE[12].molarmass = 24.305;

		listE[13] = new StringData();
		listE[13].name = "Al";
		listE[13].fullname = "Aluminium";
		listE[13].electronegativity = 1.61;
		listE[13].density = 2.7;
		listE[13].molarmass = 26.981;

		listE[14] = new StringData();
		listE[14].name = "Si";
		listE[14].fullname = "Silicon";
		listE[14].electronegativity = 1.9;
		listE[14].density = 2.330;
		listE[14].molarmass = 28.085;

		listE[15] = new StringData();
		listE[15].name = "P";
		listE[15].fullname = "Phosphorus";
		listE[15].electronegativity = 2.19;
		listE[15].density = 1.823;
		listE[15].molarmass = 30.973;

		listE[16] = new StringData();
		listE[16].name = "S";
		listE[16].fullname = "Sulfur";
		listE[16].electronegativity = 2.58;
		listE[16].density = 1.960;
		listE[16].molarmass = 32.060;

		listE[17] = new StringData();
		listE[17].name = "Cl";
		listE[17].fullname = "Chlorine";
		listE[17].electronegativity = 3.16;
		listE[17].density = 3.214;
		listE[17].molarmass = 35.450;

		listE[18] = new StringData();
		listE[18].name = "Ar";
		listE[18].fullname = "Argon";
		listE[18].electronegativity1 = "Unknown";
		listE[18].density = 1.784;
		listE[18].molarmass = 39.948;

		listE[19] = new StringData();
		listE[19].name = "K";
		listE[19].fullname = "Potassium";
		listE[19].electronegativity = 0.82;
		listE[19].density = -0.856;
		listE[19].molarmass = 39.098;

		listE[20] = new StringData();
		listE[20].name = "Ca";
		listE[16].fullname = "Calcium";
		listE[20].electronegativity = 1;
		listE[20].density = 1.550;
		listE[20].molarmass = 40.078;

		listE[21] = new StringData();
		listE[21].name = "Sc";
		listE[21].fullname = "Scandium";
		listE[21].electronegativity = 1.36;
		listE[21].density = 2.985;
		listE[21].molarmass = 44.956;

		listE[22] = new StringData();
		listE[22].name = "Ti";
		listE[22].fullname = "Titanium";
		listE[22].electronegativity = 1.54;
		listE[22].density = 4.507;
		listE[22].molarmass = 47.867;

		listE[23] = new StringData();
		listE[23].name = "V";
		listE[23].fullname = "Vanadium";
		listE[23].electronegativity = 1.63;
		listE[23].density = 6.110;
		listE[23].molarmass = 50.941;

		listE[24] = new StringData();
		listE[24].name = "Cr";
		listE[24].fullname = "Chromium";
		listE[24].electronegativity = 1.66;
		listE[24].density = 7.140;
		listE[24].molarmass = 51.996;

		listE[25] = new StringData();
		listE[25].name = "Mn";
		listE[21].fullname = "Manganese";
		listE[25].electronegativity = 1.55;
		listE[25].density = 7.470;
		listE[25].molarmass = 54.938;

		listE[26] = new StringData();
		listE[26].name = "Fe";
		listE[21].fullname = "Iron";
		listE[26].electronegativity = 1.83;
		listE[26].density = 7.874;
		listE[26].molarmass = 55.845;

		listE[27] = new StringData();
		listE[27].name = "Co";
		listE[27].fullname = "Cobalt";
		listE[27].electronegativity = 1.88;
		listE[27].density = 8.900;
		listE[27].molarmass = 58.933;

		listE[28] = new StringData();
		listE[28].name = "Ni";
		listE[28].fullname = "Nickel";
		listE[28].electronegativity = 1.91;
		listE[28].density = 8.908;
		listE[28].molarmass = 58.6934;

		listE[29] = new StringData();
		listE[29].name = "Cu";
		listE[28].fullname = "Copper";
		listE[29].electronegativity = 1.90;
		listE[29].density = 8.920;
		listE[29].molarmass = 63.546;

		listE[30] = new StringData();
		listE[30].name = "Zn";
		listE[30].fullname = "Zinc";
		listE[30].electronegativity = 1.65;
		listE[30].density = 7.140;
		listE[30].molarmass = 65.380;

		listE[31] = new StringData();
		listE[31].name = "Ga";
		listE[31].fullname = "Gallium";
		listE[31].electronegativity = 1.81;
		listE[31].density = 5.904;
		listE[31].molarmass = 69.723;

		listE[32] = new StringData();
		listE[32].name = "Ge";
		listE[32].fullname = "Germanium";
		listE[32].electronegativity = 2.01;
		listE[32].density = 5.323;
		listE[32].molarmass = 72.630;

		listE[33] = new StringData();
		listE[33].name = "As";
		listE[33].fullname = "Arsenic";
		listE[33].electronegativity = 2.18;
		listE[33].density = 5.727;
		listE[33].molarmass = 74.921;

		listE[34] = new StringData();
		listE[34].name = "Se";
		listE[34].fullname = "Selenium";
		listE[34].electronegativity = 2.55;
		listE[34].density = 4.819;
		listE[34].molarmass = 78.971;

		listE[35] = new StringData();
		listE[35].name = "Br";
		listE[35].fullname = "Bromine";
		listE[35].electronegativity = 2.96;
		listE[35].density = 3.120;
		listE[35].molarmass = 79.904;

		listE[36] = new StringData();
		listE[36].name = "Kr";
		listE[36].fullname = "Krypton";
		listE[36].electronegativity = 3.00;
		listE[36].density = 3.75;
		listE[36].molarmass = 83.798;

		listE[37] = new StringData();
		listE[37].name = "Rb";
		listE[37].fullname = "Rubidium";
		listE[37].electronegativity = 0.82;
		listE[37].density = 1.532;
		listE[37].molarmass = 85.4678;

		listE[38] = new StringData();
		listE[38].name = "Sr";
		listE[38].fullname = "Strontium";
		listE[38].electronegativity = 0.95;
		listE[38].density = 2.630;
		listE[38].molarmass = 87.62;

		listE[39] = new StringData();
		listE[39].name = "Y";
		listE[39].fullname = "Yttrium";
		listE[39].electronegativity = 1.22;
		listE[39].density = 4.472;
		listE[39].molarmass = 88.905;

		listE[40] = new StringData();
		listE[40].name = "Zr";
		listE[40].fullname = "Zirconium";
		listE[40].electronegativity = 1.33;
		listE[40].density = 6.511;
		listE[40].molarmass = 91.224;

		listE[41] = new StringData();
		listE[41].name = "Nb";
		listE[41].fullname = "Niobium";
		listE[41].electronegativity = 1.60;
		listE[41].density = 8.570;
		listE[41].molarmass = 92.906;

		listE[42] = new StringData();
		listE[42].name = "Mo";
		listE[42].fullname = "Molybdenum";
		listE[42].electronegativity = 2.16;
		listE[42].density = 10.280;
		listE[42].molarmass = 95.950;

		listE[43] = new StringData();
		listE[43].name = "Tc";
		listE[43].fullname = "Technetium";
		listE[43].electronegativity = 1.90;
		listE[43].density = 11.500;
		listE[43].molarmass = 98.000;

		listE[44] = new StringData();
		listE[44].name = "Ru";
		listE[44].fullname = "Ruthenium";
		listE[44].electronegativity = 2.20;
		listE[44].density = 12.370;
		listE[44].molarmass = 101.070;

		listE[45] = new StringData();
		listE[45].name = "Rh";
		listE[45].electronegativity = 2.28;
		listE[45].density = 12.450;
		listE[45].molarmass = 102.905;

		listE[46] = new StringData();
		listE[46].name = "Pd";
		listE[46].fullname = "Palladium";
		listE[46].electronegativity = 2.20;
		listE[46].density = 12.023;
		listE[46].molarmass = 106.420;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;
//<<<<<<< HEAD
		
		listE[48] = new StringData();
		listE[48].name = "Cd";
		listE[48].fullname = "Cadmium";
		listE[48].electronegativity = 1.69;
		listE[48].density = 8.650;
		listE[48].molarmass = 112.414;
		
		listE[49] = new StringData();
		listE[49].name = "In";
		listE[49].fullname = "Indium";
		listE[49].electronegativity = 1.78;
		listE[49].density = 7.310;
		listE[49].molarmass = 114.818;
		
		listE[50] = new StringData();
		listE[50].name = "Sn";
		listE[50].fullname = "Tin";
		listE[50].electronegativity = 1.96;
		listE[50].density = 7.310;
		listE[50].molarmass = 118.710;
		
		listE[51] = new StringData();
		listE[51].name = "Sb";
		listE[51].fullname = "Antimony";
		listE[51].electronegativity = 2.05;
		listE[51].density = 6.697;
		listE[51].molarmass = 121.760;
		
		listE[52] = new StringData();
		listE[52].name = "Te";
		listE[52].fullname = "Tellurium";
		listE[52].electronegativity = 2.1;
		listE[52].density = 6.240;
		listE[52].molarmass = 127.600;
		
		listE[53] = new StringData();
		listE[53].name = "I";
		listE[53].fullname = "Iodine";
		listE[53].electronegativity = 2.66;
		listE[53].density = 4.940;
		listE[53].molarmass = 126.900;
		
		listE[54] = new StringData();
		listE[54].name = "Xe";
		listE[54].fullname = "Xenon";
		listE[54].electronegativity = 2.6;
		listE[54].density = 0.0059;
		listE[54].molarmass = 131.293;
		
		listE[55] = new StringData();
		listE[55].name = "Cs";
		listE[55].fullname = "Caesium";
		listE[55].electronegativity = 0.79;
		listE[55].density = 1.879;
		listE[55].molarmass = 132.900;
		
		listE[56] = new StringData();
		listE[56].name = "Ba";
		listE[56].fullname = "Barium";
		listE[56].electronegativity = 0.89;
		listE[56].density = 3.510;
		listE[56].molarmass = 137.327;
		
		listE[57] = new StringData();
		listE[57].name = "La";
		listE[57].fullname = "Lanthanum";
		listE[57].electronegativity = 1.10;
		listE[57].density = 6.146;
		listE[57].molarmass = 138.900;
		
		listE[58] = new StringData();
		listE[58].name = "Ce";
		listE[58].fullname = "Cerium";
		listE[58].electronegativity = 1.12;
		listE[58].density = 6.689;
		listE[58].molarmass = 140.116;
		
		listE[59] = new StringData();
		listE[59].name = "Pr";
		listE[59].fullname = "Praseodymium";
		listE[59].electronegativity = 1.13;
		listE[59].density = 6.640;
		listE[59].molarmass = 140.900;
		
		listE[60] = new StringData();
		listE[60].name = "Nd";
		listE[60].fullname = "Neodymium";
		listE[60].electronegativity = 1.14;
		listE[60].density = 7.010;
		listE[60].molarmass = 144.242;
		
		listE[61] = new StringData();
		listE[61].name = "Pm";
		listE[61].fullname = "Promethium";
		listE[61].electronegativity1 = "Unknown";
		listE[61].density = 7.264;
		listE[61].molarmass = (145);
		
		listE[62] = new StringData();
		listE[62].name = "Sm";
		listE[62].fullname = "Samarium";
		listE[62].electronegativity = 1.17;
		listE[62].density = 7.353;
		listE[62].molarmass = 150.36;
		
		listE[63] = new StringData();
		listE[63].name = "Eu";
		listE[63].fullname = "Europium";
		listE[63].electronegativity1 = "Unknown";
		listE[63].density = 5.244;
		listE[63].molarmass = 151.964;
		
		listE[64] = new StringData();
		listE[64].name = "Gd";
		listE[64].fullname = "Gadolinium";
		listE[64].electronegativity = 1.20;
		listE[64].density = 7.901;
		listE[64].molarmass = 157.250;
		
		listE[65] = new StringData();
		listE[65].name = "Tb";
		listE[65].fullname = "Terbium";
		listE[65].electronegativity1 = "Unknown";
		listE[65].density = 8.219;
		listE[65].molarmass = 158.920;
		
		listE[66] = new StringData();
		listE[66].name = "Dy";
		listE[66].fullname = "Dysprosium";
		listE[66].electronegativity = 1.22;
		listE[66].density = 8.551;
		listE[66].molarmass = 162.500;
		
		listE[67] = new StringData();
		listE[67].name = "Ho";
		listE[67].fullname = "Holmium";
		listE[67].electronegativity = 1.23;
		listE[67].density = 8.795;
		listE[67].molarmass = 164.930;
		
		listE[68] = new StringData();
		listE[68].name = "Er";
		listE[68].fullname = "Erbium";
		listE[68].electronegativity = 1.24;
		listE[68].density = 9.066;
		listE[68].molarmass = 167.259;
		
		listE[69] = new StringData();
		listE[69].name = "Tm";
		listE[69].fullname = "Thulium";
		listE[69].electronegativity = 1.25;
		listE[69].density = 9.321;
		listE[69].molarmass = 168.930;
		
		listE[70] = new StringData();
		listE[70].name = "Yb";
		listE[70].fullname = "Ytterbium";
		listE[70].electronegativity1 = "Unknown";
		listE[70].density = 6.570;
		listE[70].molarmass = 173.054;
		
		listE[71] = new StringData();
		listE[71].name = "Lu";
		listE[71].fullname = "Lutetium";
		listE[71].electronegativity = 1.27;
		listE[71].density = 9.841;
		listE[71].molarmass = 174.967;
		
		listE[72] = new StringData();
		listE[72].name = "Hf";
		listE[72].fullname = "Hafnium";
		listE[72].electronegativity = 1.3;
		listE[72].density = 13.310;
		listE[72].molarmass = 178.49;
		
		listE[73] = new StringData();
		listE[73].name = "Ta";
		listE[73].fullname = "Tantalum";
		listE[73].electronegativity = 1.5;
		listE[73].density = 16.650;
		listE[73].molarmass = 180.49;
		
		listE[74] = new StringData();
		listE[74].name = "W";
		listE[74].fullname = "Tungsten";
		listE[74].electronegativity = 2.36;
		listE[74].density = 19.250;
		listE[74].molarmass = 183.84;
		
		listE[75] = new StringData();
		listE[75].name = "Re";
		listE[75].fullname = "Rhenium";
		listE[75].electronegativity = 1.90;
		listE[75].density = 21.020;
		listE[75].molarmass = 186.207;
		
		listE[76] = new StringData();
		listE[76].name = "Os";
		listE[76].fullname = "Osmium";
		listE[76].electronegativity = 2.20;
		listE[76].density = 22.610;
		listE[76].molarmass = 190.230;
		
		listE[77] = new StringData();
		listE[77].name = "Ir";
		listE[77].fullname = "Iridium";
		listE[77].electronegativity = 2.20;
		listE[77].density = 22.650;
		listE[77].molarmass = 192.217;
		
		listE[78] = new StringData();
		listE[78].name = "Pt";
		listE[78].fullname = "Platinum";
		listE[78].electronegativity = 2.28;
		listE[78].density = 21.090;
		listE[78].molarmass = 195.084;
		
		listE[79] = new StringData();
		listE[79].name = "Au";
		listE[79].fullname = "Gold";
		listE[79].electronegativity = 2.54;
		listE[79].density = 19.300;
		listE[79].molarmass = 196.900;
		
		listE[80] = new StringData();
		listE[80].name = "Hg";
		listE[80].fullname = "Mercury";
		listE[80].electronegativity = 2.00;
		listE[80].density = 13.534;
		listE[80].molarmass = 200.590;
		
		listE[81] = new StringData();
		listE[81].name = "Tl";
		listE[81].fullname = "Thallium";
		listE[81].electronegativity = 1.62;
		listE[81].density = 11.850;
		listE[81].molarmass = 204.380;
		
		listE[82] = new StringData();
		listE[82].name = "Pb";
		listE[82].fullname = "Lead";
		listE[82].electronegativity = 2.33;
		listE[82].density = 11.340;
		listE[82].molarmass = 207.200;
		
		listE[83] = new StringData();
		listE[83].name = "Bi";
		listE[83].fullname = "Bismuth";
		listE[83].electronegativity = 2.02;
		listE[83].density = 9.780;
		listE[83].molarmass = 208.980;
		
		listE[84] = new StringData();
		listE[84].name = "Po";
		listE[84].fullname = "Polonium";
		listE[84].electronegativity = 2.00;
		listE[84].density = 9.196;
		listE[84].molarmass = (209);
		
		listE[85] = new StringData();
		listE[85].name = "At";
		listE[85].fullname = "Astatine";
		listE[85].electronegativity = 2.20;
		listE[85].density1 = "Unknown";
		listE[85].molarmass = (210);
		
		listE[86] = new StringData();
		listE[86].name = "Rn";
		listE[86].fullname = "Radon";
		listE[86].electronegativity1 = "Unknown";
		listE[86].density = 0.00973;
		listE[86].molarmass = (222);
		
		listE[87] = new StringData();
		listE[87].name = "Fr";
		listE[87].fullname = "Francium";
		listE[87].electronegativity = 0.70;
		listE[87].density1 = "Unknown";
		listE[87].molarmass = (223);
		
		listE[88] = new StringData();
		listE[88].name = "Ra";
		listE[88].fullname = "Radium";
		listE[88].electronegativity = 0.90;
		listE[88].density = 5.000;
		listE[88].molarmass = (226);
		
		listE[89] = new StringData();
		listE[89].name = "Ac";
		listE[89].fullname = "Actinium";
		listE[89].electronegativity = 1.10;
		listE[89].density = 10.070;
		listE[89].molarmass = (227);
		
		listE[90] = new StringData();
		listE[90].name = "Th";
		listE[90].fullname = "Thorium";
		listE[90].electronegativity = 1.30;
		listE[90].density = 11.724;
		listE[90].molarmass = 232.038;
		
		listE[91] = new StringData();
		listE[91].name = "Pa";
		listE[91].fullname = "Protactinium";
		listE[91].electronegativity = 1.50;
		listE[91].density = 15.370;
		listE[91].molarmass = 231.030;
		
		listE[92] = new StringData();
		listE[92].name = "U";
		listE[92].fullname = "Uranium";
		listE[92].electronegativity = 1.38;
		listE[92].density = 19.050;
		listE[92].molarmass = 238.020;
		
		listE[93] = new StringData();
		listE[93].name = "Np";
		listE[93].fullname = "Neptunium";
		listE[93].electronegativity = 1.36;
		listE[93].density = 20.450;
		listE[93].molarmass = (237);
		
		listE[94] = new StringData();
		listE[94].name = "Pu";
		listE[94].fullname = "Plutonium";
		listE[94].electronegativity = 1.28;
		listE[94].density = 19.816;
		listE[94].molarmass = (244);
		
		listE[95] = new StringData();
		listE[95].name = "Am";
		listE[95].fullname = "Americium";
		listE[95].electronegativity = 1.30;
		listE[95].density1 = "Unknown";
		listE[95].molarmass = (243);
		
		listE[96] = new StringData();
		listE[96].name = "Cm";
		listE[96].fullname = "Curium";
		listE[96].electronegativity = 1.30;
		listE[96].density = 13.510;
		listE[96].molarmass = (247);
		
		listE[97] = new StringData();
		listE[97].name = "Bk";
		listE[97].fullname = "Berkelium";
		listE[97].electronegativity = 1.30;
		listE[97].density = 14.780;
		listE[97].molarmass = (247);
		
		listE[98] = new StringData();
		listE[98].name = "Cf";
		listE[98].fullname = "Californium";
		listE[98].electronegativity = 1.30;
		listE[98].density = 15.100;
		listE[98].molarmass = (251);
		
		listE[99] = new StringData();
		listE[99].name = "Es";
		listE[99].fullname = "Einsteinium";
		listE[99].electronegativity = 1.30;
		listE[99].density1 = "Unknown";
		listE[99].molarmass = (252);
		
		listE[100] = new StringData();
		listE[100].name = "Fm";
		listE[100].fullname = "Fermium";
		listE[100].electronegativity = 1.30;
		listE[100].density1 = "Unknown";
		listE[100].molarmass = (257);
		
		listE[101] = new StringData();
		listE[101].name = "Md";
		listE[101].fullname = "Mendelevium";
		listE[101].electronegativity = 1.30;
		listE[101].density1 = "Unknown";
		listE[101].molarmass = (258);
		
		listE[102] = new StringData();
		listE[102].name = "No";
		listE[102].fullname = "Nobelium";
		listE[102].electronegativity = 1.30;
		listE[102].density1 = "Unknown";
		listE[102].molarmass = (259);
		
		listE[103] = new StringData();
		listE[103].name = "Lr";
		listE[103].fullname = "Lawrencium";
		listE[103].electronegativity1 = "Unknown";
		listE[103].density1 = "Unknown";
		listE[103].molarmass = (262);
		
		listE[104] = new StringData();
		listE[104].name = "Rf";
		listE[104].fullname = "Rutherfodium";
		listE[104].electronegativity1 = "Unknown";
		listE[104].density1 = "Unknown";
		listE[104].molarmass = (267);
		
		listE[105] = new StringData();
		listE[105].name = "Db";
		listE[105].fullname = "Dubnium";
		listE[105].electronegativity1 = "Unknown";
		listE[105].density1 = "Unknown";
		listE[105].molarmass = (268);
		
		listE[106] = new StringData();
		listE[106].name = "Sg";
		listE[106].fullname = "Seaborgium";
		listE[106].electronegativity1 = "Unknown";
		listE[106].density1 = "Unknown";
		listE[106].molarmass = (271);
		
		listE[107] = new StringData();
		listE[107].name = "Bh";
		listE[107].fullname = "Bohrium";
		listE[107].electronegativity1 = "Unknown";
		listE[107].density1 = "Unknown";
		listE[107].molarmass = (272);
		
		listE[108] = new StringData();
		listE[108].name = "Hs";
		listE[108].fullname = "Hassium";
		listE[108].electronegativity1 = "Unknown";
		listE[108].density1 = "Unknown";
		listE[108].molarmass = (270);
		
		listE[109] = new StringData();
		listE[109].name = "Mt";
		listE[109].fullname = "Meitnerium";
		listE[109].electronegativity1 = "Unknown";
		listE[109].density1 = "Unknown";
		listE[109].molarmass = (276);
		
		listE[110] = new StringData();
		listE[110].name = "Ds";
		listE[110].fullname = "Darmstadtium";
		listE[110].electronegativity1 = "Unknown";
		listE[110].density1 = "Unknown";
		listE[110].molarmass = (281);
		
		listE[111] = new StringData();
		listE[111].name = "Rg";
		listE[111].fullname = "Roentgenium";
		listE[111].electronegativity1 = "Unknown";
		listE[111].density1 = "Unknown";
		listE[111].molarmass = (280);
		
		listE[112] = new StringData();
		listE[112].name = "Cn";
		listE[112].fullname = "Copernicium";
		listE[112].electronegativity1 = "Unknown";
		listE[112].density1 = "Unknown";
		listE[112].molarmass = (285);
		
		listE[113] = new StringData();
		listE[113].name = "Uut";
		listE[113].fullname = "Ununtium";
		listE[113].electronegativity1 = "Unknown";
		listE[113].density1 = "Unknown";
		listE[113].molarmass = (284);
		
		listE[114] = new StringData();
		listE[114].name = "Fl";
		listE[114].fullname = "Flerovium";
		listE[114].electronegativity1 = "Unknown";
		listE[114].density1 = "Unknown";
		listE[114].molarmass = (289);
		
		listE[115] = new StringData();
		listE[115].name = "Uup";
		listE[115].fullname = "Ununpentium";
		listE[115].electronegativity1 = "Unknown";
		listE[115].density1 = "Unknown";
		listE[115].molarmass = (288);
		
		listE[116] = new StringData();
		listE[116].name = "Lv";
		listE[116].fullname = "Livemorium";
		listE[116].electronegativity1 = "Unknown";
		listE[116].density1 = "Unknown";
		listE[116].molarmass = (293);
		
		listE[117] = new StringData();
		listE[117].name = "Uus";
		listE[117].fullname = "Unuseptium";
		listE[117].electronegativity1 = "Unknown";
		listE[117].density1 = "Unknown";
		listE[117].molarmass = (294);
		
		listE[118] = new StringData();
		listE[118].name = "Uuo";
		listE[118].fullname = "Roentgenium";
		listE[118].electronegativity1 = "Unknown";
		listE[118].density1 = "Unknown";
		listE[118].molarmass = (294);
		
//=======
/*
		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;

		listE[47] = new StringData();
		listE[47].name = "Ag";
		listE[47].fullname = "Silver";
		listE[47].electronegativity = 1.93;
		listE[47].density = 10.490;
		listE[47].molarmass = 107.868;
*/
//>>>>>>> origin/master
	}

	
	public void textFields(GameContainer c, StateBasedGame gamae){
		
		
	}
	
	
	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {

		clickBox();
		ClickBoxVar();

		background = new Image("src/images/calc/core/chemBackground.png");
		sipka = new Image("src/images/calc/core/gobackbutton1.png");
		sipkaglow = new Image("src/images/calc/core/gobackbutton.png");
		clickboxM = new Image("src/images/calc/core/clickboxM.png");
		clickedM = new Image("src/images/calc/core/clickedM.png");
		settings = new Image("src/images/calc/core/CalSet.png");
		plusbutton = new Image("src/images/calc/core/plusbutton.png");
		background3 = new Image("src/images/calc/core/chemBackground3.png");
		backgroundM = new Image("src/images/calc/core/chemBackgroundM.png");

		elements();

		for (int o = 0; o < 3; o++) {

		}

		decimalplace = new TextField(c, c.getDefaultFont(), 260, 270, 25, 25, // if
																				// n?
																				// =>
																				// vkladani
																				// hmotnosti
				new ComponentListener() {

					@Override
					public void componentActivated(AbstractComponent source) {
						try {

							TextField decimalplace = (TextField) source;
							String text2 = decimalplace.getText();

							decimalplaces = Integer.parseInt(text2); // change
																		// number
																		// in
																		// String
																		// into
																		// Int
							System.out.println("n decimal places: "
									+ decimalplaces);
							if (decimalplaces != 0) {

								BigDecimal dec = new BigDecimal(n)
										.setScale(decimalplaces,
												BigDecimal.ROUND_HALF_UP);
								/*
								 * double n1 = (double) Math.round(n (10 ^
								 * decimalplaces)) / (10 ^ decimalplaces);
								 */
								System.out.println(dec.toString());
								// not sure why it does not work
							}
						} catch (Exception e) {
							System.out
									.println("No decimal value speicfied; defalting to 10");
							TextField decimalplace = (TextField) source;
							String text2 = decimalplace.getText();

							decimalplaces = 10; // change
												// number
												// in
												// String
												// into
												// Int
							System.out.println("n decimal places: "
									+ decimalplaces);
							if (decimalplaces != 0) {

								BigDecimal dec = new BigDecimal(n)
										.setScale(decimalplaces,
												BigDecimal.ROUND_HALF_UP);
								/*
								 * double n1 = (double) Math.round(n (10 ^
								 * decimalplaces)) / (10 ^ decimalplaces);
								 */
								System.out.println(dec.toString());
								// not sure why it does not work
							}
						}
					}

				});

		mass = new TextField(c, c.getDefaultFont(), 170, 230, 100, 25, // if n?
																		// =>
																		// vkladani
																		// hmotnosti
				new ComponentListener() {

					@Override
					public void componentActivated(AbstractComponent source) {
						// TODO Auto-generated method stub
						TextField mass = (TextField) source;
						String text1 = mass.getText();

						int textnumber = Integer.parseInt(text1); // change
																	// number in
																	// String
																	// into Int
						if (click[2].isClicked == true) {
							n = textnumber / overallmolarmass;
						}
						if (click[3].isClicked == true) {
							massanswer = textnumber * overallmolarmass;
						}
						if (click[0].isClicked == true) {
							// c = n/v;
						}
					}

				});

		textField = new TextField(c, c.getDefaultFont(), 170, 150, 100, 25, // Vkladani
																			// nazvu
																			// slouceniny
				new ComponentListener() {

					@Override
					public void componentActivated(AbstractComponent source) {
						TextField field = (TextField) source;
						String text = field.getText();
						int counter = 0;

						colorText = true;
						for (int i = 0; i < 47; i++) {
							if (text.contains(listE[i].name)) {
								// System.out.println("Name: " +
								// listE[i].fullname
								counter++;

								// System.out.println("The compound contains "
								// + counter + " elements.");
							}
							if (text.contains(listE[i].name)) {
								colorText = false;

							}

						}
						if (colorText == true) {
							textField.setTextColor(color.red);
						}
						if (colorText == false) {
							textField.setTextColor(color.white);
						}

						for (int i = 0; i < text.length(); i++) {
							char c = text.charAt(i);
							if (Character.isDigit(c)) {

								int a = Character.digit(c, 10);

								String b = String.valueOf(a);
								text.indexOf(b);
								double franta = 0;
								String[] mnam = text.split("(?!^)");
								for (int j = 0; j < mnam.length; j++) {
									if (mnam[j].equals(b)) {
										for (int n = 0; n < 47; n++) {
											if (mnam[j - 1]
													.equals(listE[n].name)) {

												franta = franta
														+ listE[n].molarmass
														* a;
												if (click[1].isClicked == true) {

													answer = franta;
												} else {
													showMolarMass = false;
												}
												// System.out.println(listE[n].molarmass*
												// a);

											}
										}
									}
								}
								System.out.println("Collective molar mass: "
										+ franta);
								overallmolarmass = franta;
								System.out.println("C.molarmass: "
										+ overallmolarmass);

							}
						}
					}
				});

		textField.setBorderColor(color.black);
		textField.setBackgroundColor(color.lightGray);

		mass.setBorderColor(color.red);
		mass.setBackgroundColor(color.lightGray);

		decimalplace.setBorderColor(color.red);
		decimalplace.setBackgroundColor(color.lightGray);
	}

	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {

		Input input = c.getInput();

		int posX = Mouse.getX();
		int posY = Mouse.getY();

		// Glow
		if (((Base) game).renderingSmall) {
			if ((posX > 10 && posY > 18) && (posX < 78 && posY < 60)) {
				glowactive = true;

			} else {
				glowactive = false;
			}
		} else {
			if ((posX > 50 && posY < 100) && (posX < 120 && posY > 60)) {
				glowactive = true;
			} else {
				glowactive = false;
			}
		}
		System.out.println(click[0].isClicked);

	}

	public void render(GameContainer c, StateBasedGame game, Graphics g)
			throws SlickException {
		if (((Base) game).renderingSmall) { // work only in small resolution
			background.draw();
			textField.render(c, g);
			mass.render(c, g);
			if (showMolarMass == true) {
				g.drawString("answer: ", 500, 100);
			}
			sipka.draw(10, 420);
			clickboxM.draw(80, 300);
			clickboxM.draw(80, 340);
			clickboxM.draw(80, 380);
			clickboxM.draw(80, 420);
			g.drawString("single compound", 115, 300);

			if (glowactive == true) {
				sipkaglow.draw(10, 420);
			}
			if (click[0].isClicked == true) {
				clickedM.draw(80, 300);
			}
			if (click[1].isClicked == true) {
				clickedM.draw(80, 340);
			}
			if (click[2].isClicked == true) {
				clickedM.draw(80, 380);
			}
		} else { // render for normal resolution
			backgroundM.draw();

			// textfields
			textField.render(c, g);

			if (click[2].isClicked == true || click[3].isClicked == true
					|| click[0].isClicked == true) {
				mass.render(c, g);
			}
			// answer

			if (click[1].isClicked == true) {
				g.drawString("answer: " + answer, 300, 160);
			}
			if (click[2].isClicked == true) {
				g.drawString("answer: " + n, 300, 160);
			}
			if (click[3].isClicked == true) {
				g.drawString("answer: " + massanswer, 300, 160);
			}
			if (click[0].isClicked == true) {
				g.drawString("answer: ", 300, 160);
			}

			sipka.draw(50, 600);
			
			// C,n,mass, etc
			clickboxM.draw(400, 300);
			clickboxM.draw(400, 340);
			clickboxM.draw(400, 380);
			clickboxM.draw(400, 420);
			
			//var
			clickboxM.draw(700, 300);
			clickboxM.draw(700, 340);
			clickboxM.draw(700, 380);
			clickboxM.draw(700, 420);

			g.drawString("Molar mass", 435, 340);
			g.drawString("Mass", 435, 420);
			g.drawString("Name: ", 70, 150);
			if (click[2].isClicked == true) {
				g.drawString("Mass: ", 70, 230);
				g.drawString("N of decimal places: ", 70, 270);
				decimalplace.render(c, g);
			}
			if (click[3].isClicked == true) {
				g.drawString("N: ", 70, 230);
			}

			g.drawString("n", 435, 380);
			if (!click[0].isClicked) {
				g.drawString("Concentration", 435, 300);
			} else {
				g.setColor(Color.black);
				g.drawString("Concentration", 435, 300);
				g.setColor(Color.white);
			}
			
			//pokus
			
//
//			
//		
//		switch(names){
//			case 0: stringNames = "Concentration";
//			break;
//			case 1: stringNames = "Molar mass";
//			break;
//			case 2: stringNames = "n";
//			break;
//			case 3: stringNames = "Mass";
//			break;
//		}
//			for(int y=0; y<3;y++){
//				if(click[y].isClicked == true){
//					g.drawString(stringNames, , y);
//				}
			}
			//konec pokus

			if (glowactive == true) {
				sipkaglow.draw(50, 600);

			}
			// handles checkboxes
			if (click[0].isClicked == true) {
				clickedM.draw(400, 300);

			}
			if (click[1].isClicked == true) {
				clickedM.draw(400, 340);

			}
			if (click[2].isClicked == true) {
				clickedM.draw(400, 380);

			}
			if (click[3].isClicked == true) {
				clickedM.draw(400, 420);
			}
		}
	

	public void mouseClicked(int button, int x, int y, int clickCount) {

		int posX = Mouse.getX();
		int posY = Mouse.getY();
		if (glowactive == true) {

			game.enterState(4);
		}

		// Checkboxes, phew, finally
		if (((Base) game).renderingSmall) {
			if ((posX > 80 && posY > 160) && (posX < 103 && posY < 180)
					&& button == Input.MOUSE_LEFT_BUTTON) {

				click[0].isClicked = !click[0].isClicked;

			}

			if ((posX > 80 && posY > 120) && (posX < 103 && posY < 140)
					&& button == Input.MOUSE_LEFT_BUTTON) {
				int active = 1;
				for (int a = 1; a < 4; a++) {
					if (a == active) {
						click[a].isClicked = !click[a].isClicked;
					} else {

						click[a].isClicked = false;
					}
				}
			}

			if ((posX > 80 && posY > 80) && (posX < 103 && posY < 100)
					&& button == Input.MOUSE_LEFT_BUTTON) {
				int active = 2;
				for (int a = 1; a < 4; a++) {
					if (a == active) {
						click[a].isClicked = !click[a].isClicked;
					} else {

						click[a].isClicked = false;
					}
				}
			}

		} else {
			if ((posX > 400 && posY < 400) && (posX < 423 && posY > 380)
					&& button == Input.MOUSE_LEFT_BUTTON) {
				int active = 0;
				for (int a = 0; a < 4; a++) {
					if (a == active) {
						click[a].isClicked = !click[a].isClicked;
					} else {

						click[a].isClicked = false;
					}
				}

				// click[0].isClicked = !click[0].isClicked;
			}

			if ((posX > 400 && posY < 360) && (posX < 423 && posY > 340)
					&& button == Input.MOUSE_LEFT_BUTTON) {

				int active = 1;
				for (int a = 0; a < 4; a++) {
					if (a == active) {
						click[a].isClicked = !click[a].isClicked;
					} else {

						click[a].isClicked = false;
					}
				}
			}

			if ((posX > 400 && posY < 320) && (posX < 423 && posY > 300)
					&& button == Input.MOUSE_LEFT_BUTTON) {

				int active = 2;
				for (int a = 0; a < 4; a++) {
					if (a == active) {
						click[a].isClicked = !click[a].isClicked;
					} else {

						click[a].isClicked = false;
					}
				}
			}

			if ((posX > 400 && posY < 280) && (posX < 423 && posY > 260)
					&& button == Input.MOUSE_LEFT_BUTTON) {
				int active = 3;
				for (int a = 0; a < 4; a++) {
					if (a == active)
						click[a].isClicked = !click[a].isClicked;
					else
						click[a].isClicked = false;
				}
			}
		}
	}

	public int GetID() {
		return 1;
	}

	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}

}
