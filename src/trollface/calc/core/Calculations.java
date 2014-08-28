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
	double answer, overallmolarmass, n, massanswer;
	StringData[] listE, click;
	Image background, sipka, sipkaglow, plusbutton, clickboxM, clickedM,
			background3, settings, backgroundM;
	boolean colorText = false, glowactive = false, clicked = false,
			outofSet = false, clicked1 = false, unclicked = true,
			settingsThere = true, showMolarMass = false;
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
		// single compound
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

	public void elements() {

		listE = new StringData[48];
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
		
	}

	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {

		clickBox();

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
			if (click[2].isClicked == true || click[3].isClicked == true) {
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

			sipka.draw(50, 600);
			clickboxM.draw(400, 300);
			clickboxM.draw(400, 340);
			clickboxM.draw(400, 380);
			clickboxM.draw(400, 420);
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
			g.drawString("single compound", 435, 300);

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

				click[0].isClicked = !click[0].isClicked;
			}

			if ((posX > 400 && posY < 360) && (posX < 423 && posY > 340)
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

			if ((posX > 400 && posY < 320) && (posX < 423 && posY > 300)
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

			if ((posX > 400 && posY < 280) && (posX < 423 && posY > 260)
					&& button == Input.MOUSE_LEFT_BUTTON) {
				int active = 3;
				for (int a = 1; a < 4; a++) {
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
