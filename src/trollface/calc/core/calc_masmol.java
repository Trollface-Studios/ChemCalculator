package trollface.calc.core;

public class calc_masmol {


		float masmol;

		static final String symb[] = {"Ac", "Ag", "Al", "Am", "As", "At", "Au", "B", "Ba",

		"Be", "Bi", "Bk", "Br", "C", "Ca", "Cd", "Ce", "Cf", "Cl", "Co", "Cr", "Cs", "Cu",

		"Dy", "Er", "Es", "Eu", "F", "Fe", "Ga", "Gd", "Ge", "H", "Hf", "Hg", "Ho", "I",

		"In", "Ir", "K", "La", "Li", "Lu", "Lr", "Md", "Mg", "Mn", "Mo", "N", "Na", "Nb",

		"Nd", "Ni", "No", "Np", "Os", "P", "Pa", "Pb", "Pd", "Pm", "Po", "Pr", "Pt", "Pu",

		"Ra", "Rb", "Re", "Rh", "Ru", "S", "Sb", "Sc", "Se", "Si", "Sm", "Sn", "Sr", "Ta",

		"Tb", "Tc", "Te", "Th", "Ti", "Tl", "Tm", "U", "V", "W", "Y", "Yb", "Zn", "Zr", "O"};

		static final float ma[] = {227.0278f, 107.8682f, 26.98f, 243.0614f, 74.9216f, 209.987f,

		196.966f, 10.811f, 137.327f, 9.012f, 208.980f, 247.07f, 79.904f, 12.011f,

		40.078f, 112.411f,140.115f, 251.0796f, 35.4527f, 58.933f, 51.996f, 132.905f,

		63.546f, 162.50f, 167.26f, 252.083f, 151.965f, 18.998f, 55.847f, 69.723f,

		157.25f, 72.61f, 1.00794f, 178.49f, 200.59f, 164.930f, 126.905f, 114.82f,

		192.22f, 39.0983f,138.906f, 6.941f, 174.967f, 260.1053f, 258.099f, 24.305f,

		54.938f, 95.94f, 14.007f, 22.90f, 92.906f, 144.24f, 58.69f, 259.1009f, 237.048f,

		190.2f, 30.974f, 231.036f,207.2f, 106.42f, 146.915f, 208.9824f, 140.908f,

		195.08f, 244.064f, 226.03f, 85.47f, 186.207f, 102.91f, 101.07f, 32.066f, 121.75f,

		44.96f, 78.96f, 28.09f, 150.36f, 118.71f, 87.62f, 180.95f, 158.93f, 98.91f,

		127.6f, 232.04f, 47.88f, 204.38f, 168.93f, 238.029f, 50.94f, 183.85f, 88.91f,

		173.04f, 65.39f, 91.224f, 15.994f};

		calc_masmol(int ed, String s[], float coeff[]){

		float massat[] = new float[ed + 1];

		for (int a = 0; a <= ed; a++){

		for (int i = 0; i<=symb.length-1; i++ ){

		if (s[a].equals(symb[i])){

		massat[a] = ma[i];

		break;

		}

		}

		}

		for (int a = 0; a <= ed; a++)

		if (massat[a] > 0) masmol= masmol + massat[a]*coeff[a];

		else {

		masmol=0;

		break;

		}

		}

		float mt(){return masmol;}

		}
