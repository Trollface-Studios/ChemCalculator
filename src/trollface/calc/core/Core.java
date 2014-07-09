/** The Core.java class responsible for running the damn thing 
 *
 * @author xCabbage [github.com/xcabbage]
 *
 * @info for the ChemCalc project [github.com/trollface-studios/chemcalculator]
 *      created 13. 5. 2014 14:12:50
 */

package trollface.calc.core;

import java.util.Scanner;

/**
 * @author David
 * 
 */
public class Core {
	public static void main(String[] args) {
		System.out.println("sup");
		
		StringData[] listE;
    	
	     
    	listE = new StringData[48];
     	listE[0] = new StringData();
     	listE[0].name = "DOES NOT EXIST";
     	
     	listE[1] = new StringData();
     	listE[1].name = "H";
     	listE[1].fullname = "Hydrogen";
     	listE[1].electronegativity =2.2 ;
     	listE[1].density = 0.090;
     	listE[1].molarmass = 1.01;
     	
     	listE[2] = new StringData();
     	listE[2].name = "He";
     	listE[2].fullname = "Hellium";
     	listE[2].electronegativity1 ="Unknown";
     	listE[2].density = 0.179;
     	listE[2].molarmass = 4.00;
     	
     	listE[3] = new StringData();
     	listE[3].name = "Li";
     	listE[3].fullname = "Lithium";
     	listE[3].electronegativity =0.98;
     	listE[3].density =0.535;
     	listE[3].molarmass = 6.94;
     	
     	listE[4] = new StringData();
     	listE[4].name = "Be";
     	listE[4].fullname = "Beryllium";
     	listE[4].electronegativity =1.57;
     	listE[4].density =1.85;
     	listE[4].molarmass = 9.01;
     	
     	listE[5] = new StringData();
     	listE[5].name = "B";
     	listE[5].fullname = "Boron";
     	listE[5].electronegativity =2.04;
     	listE[5].density =2.46;
     	listE[5].molarmass = 10.81;
     	
     	listE[6] = new StringData();
     	listE[6].name = "C";
     	listE[6].fullname = "Carbon";
     	listE[6].electronegativity =2.55;
     	listE[6].density =2.260;
     	listE[6].molarmass = 12.01;
     	
     	listE[7] = new StringData();
     	listE[7].name = "N";
     	listE[7].fullname = "Nitrogen";
     	listE[7].electronegativity =3.04;
     	listE[7].density =1.251;
     	listE[7].molarmass = 14.01;
     	
     	listE[8] = new StringData();
     	listE[8].name = "O";
     	listE[8].fullname = "Oxygen";
     	listE[8].electronegativity =3.44;
     	listE[8].density =1.429;
     	listE[8].molarmass = 16.00;
     	
     	listE[9] = new StringData();
     	listE[9].name = "F";
     	listE[9].fullname = "Fluorine";
     	listE[9].electronegativity =3.98;
     	listE[9].density =1.696;
     	listE[9].molarmass = 19.00;
     	
     	listE[10] = new StringData();
     	listE[10].name = "Ne";
     	listE[10].fullname = "Neon";
     	listE[10].electronegativity1 ="Unknown";
     	listE[10].density =0.900;
     	listE[10].molarmass = 20.18;
     	
     	listE[11] = new StringData();
     	listE[11].name = "Na";
     	listE[11].fullname = "Na";
     	listE[11].electronegativity =0.93;
     	listE[11].density =0.968;
     	listE[11].molarmass = 22.99;
     	
     	listE[12] = new StringData();
     	listE[12].name = "Mg";
     	listE[12].electronegativity =1.31;
     	listE[12].density =1.738;
     	listE[12].molarmass = 24.31;

     	
     	listE[13] = new StringData();
     	listE[13].name = "Al";
     	listE[13].electronegativity =1.61;
     	listE[13].density =2.7;
     	listE[13].molarmass = 26.98;
     	
     	listE[14] = new StringData();
     	listE[14].name = "Si";
     	listE[14].electronegativity =1.9;
     	listE[14].density =2.330;
     	listE[14].molarmass = 28.09;
     	
     	listE[15] = new StringData();
     	listE[15].name = "P";
     	listE[15].electronegativity =2.19;
     	listE[15].density =1.823;
     	listE[15].molarmass = 30.97;
     	
     	listE[16] = new StringData();
     	listE[16].name = "S";
     	listE[16].electronegativity =2.58;
     	listE[16].density =1.960;
     	listE[16].molarmass = 32.07;

     	listE[17] = new StringData();
     	listE[17].name = "Cl";
     	listE[17].electronegativity =3.16;
     	listE[17].density =3.214;
     	listE[17].molarmass = 35.45;

     	listE[18] = new StringData();
     	listE[18].name = "Ar";
     	listE[18].electronegativity1 ="Unknown";
     	listE[18].density =1.784;
     	listE[18].molarmass = 39.95;

     	listE[19] = new StringData();
     	listE[19].name = "K";
     	listE[19].electronegativity =0.82;
     	listE[19].density =-0.856;
     	listE[19].molarmass = 39.10;
     	
     	listE[20] = new StringData();
     	listE[20].name = "Ca";
     	listE[20].electronegativity =1;
     	listE[20].density =1.550;
     	listE[20].molarmass = 40.08;

     	listE[21] = new StringData();
     	listE[21].name = "Sc";
     	listE[21].electronegativity =1.36;
     	listE[21].density =2.985;
     	listE[21].molarmass = 44.96;

     	listE[22] = new StringData();
     	listE[22].name = "Ti";
     	listE[22].electronegativity =1.54;
     	listE[22].density =4.507;
     	listE[22].molarmass = 47.87;

     	listE[23] = new StringData();
     	listE[23].name = "V";
     	listE[23].electronegativity =1.63;
     	listE[23].density =6.110;
     	listE[23].molarmass = 50.94;

     	listE[24] = new StringData();
     	listE[24].name = "Cr";
     	listE[24].electronegativity =1.66;
     	listE[24].density =7.140;
     	listE[24].molarmass = 52.00;

     	listE[25] = new StringData();
     	listE[25].name = "Mn";
     	listE[25].electronegativity =1.55;
     	listE[25].density =7.470;
     	listE[25].molarmass = 54.94;

     	listE[26] = new StringData();
     	listE[26].name = "Fe";
     	listE[26].electronegativity =1.83;
     	listE[26].density =7.874;
     	listE[26].molarmass = 55.85;

     	listE[27] = new StringData();
     	listE[27].name = "Co";
     	listE[27].electronegativity =1.88;
     	listE[27].density =8.900;
     	listE[27].molarmass = 58.93;

     	listE[28] = new StringData();
     	listE[28].name = "Ni";
     	listE[28].electronegativity =1.91;
     	listE[28].density =8.908;
     	listE[28].molarmass = 58.69;
//neupraveno
     	listE[29] = new StringData();
     	listE[29].name = "Cu";
     	listE[29].electronegativity =1.31;
     	listE[29].density =1.738;
     	listE[29].molarmass = 24.31;

     	listE[30] = new StringData();
     	listE[30].name = "Mg";
     	listE[30].electronegativity =1.31;
     	listE[30].density =1.738;
     	listE[30].molarmass = 24.31;

     	listE[31] = new StringData();
     	listE[31].name = "Mg";
     	listE[31].electronegativity =1.31;
     	listE[31].density =1.738;
     	listE[31].molarmass = 24.31;

     	listE[32] = new StringData();
     	listE[32].name = "Mg";
     	listE[32].electronegativity =1.31;
     	listE[32].density =1.738;
     	listE[32].molarmass = 24.31;
     	
     	listE[33] = new StringData();
     	listE[33].name = "Mg";
     	listE[33].electronegativity =1.31;
     	listE[33].density =1.738;
     	listE[33].molarmass = 24.31;
     	
     	listE[34] = new StringData();
     	listE[34].name = "Mg";
     	listE[34].electronegativity =1.31;
     	listE[34].density =1.738;
     	listE[34].molarmass = 24.31;
     	
     	listE[35] = new StringData();
     	listE[35].name = "Mg";
     	listE[35].electronegativity =1.31;
     	listE[35].density =1.738;
     	listE[35].molarmass = 24.31;
     	
     	listE[36] = new StringData();
     	listE[36].name = "Mg";
     	listE[36].electronegativity =1.31;
     	listE[36].density =1.738;
     	listE[36].molarmass = 24.31;
     	
     	listE[37] = new StringData();
     	listE[37].name = "Mg";
     	listE[37].electronegativity =1.31;
     	listE[37].density =1.738;
     	listE[37].molarmass = 24.31;
     	
     	listE[38] = new StringData();
     	listE[38].name = "Mg";
     	listE[38].electronegativity =1.31;
     	listE[38].density =1.738;
     	listE[38].molarmass = 24.31;
     	
     	listE[39] = new StringData();
     	listE[39].name = "Mg";
     	listE[39].electronegativity =1.31;
     	listE[39].density =1.738;
     	listE[39].molarmass = 24.31;
     	
     	listE[40] = new StringData();
     	listE[40].name = "Mg";
     	listE[40].electronegativity =1.31;
     	listE[40].density =1.738;
     	listE[40].molarmass = 24.31;
     	
     	listE[41] = new StringData();
     	listE[41].name = "Mg";
     	listE[41].electronegativity =1.31;
     	listE[41].density =1.738;
     	listE[41].molarmass = 24.31;
     	
     	listE[42] = new StringData();
     	listE[42].name = "Mg";
     	listE[42].electronegativity =1.31;
     	listE[42].density =1.738;
     	listE[42].molarmass = 24.31;
     	
     	listE[43] = new StringData();
     	listE[43].name = "Mg";
     	listE[43].electronegativity =1.31;
     	listE[43].density =1.738;
     	listE[43].molarmass = 24.31;
     	
     	listE[44] = new StringData();
     	listE[44].name = "Mg";
     	listE[44].electronegativity =1.31;
     	listE[44].density =1.738;
     	listE[44].molarmass = 24.31;
     	
     	listE[45] = new StringData();
     	listE[45].name = "Mg";
     	listE[45].electronegativity =1.31;
     	listE[45].density =1.738;
     	listE[45].molarmass = 24.31;
     	
     	listE[46] = new StringData();
     	listE[46].name = "Mg";
     	listE[46].electronegativity =1.31;
     	listE[46].density =1.738;
     	listE[46].molarmass = 24.31;
     
     	listE[47] = new StringData();
     	listE[47].name = "Mg";
     	listE[47].electronegativity =1.31;
     	listE[47].density =1.738;
     	listE[47].molarmass = 24.31;

     	
    	Scanner sc1 = new Scanner(System.in);
    	Scanner sc2 = new Scanner(System.in);

    	System.out.println("welcome, select your element.");
    	String n = sc1.nextLine();
    	boolean found = false;
    	for(int j= 0; j<47;j++){
    		if(listE[j].name.equals(n)){
    			System.out.println("VICTORY");
    			found = true;
    			System.out.println("element:  " + listE[j].name);
	    		System.out.println("molarmass: "+listE[j].molarmass);
	    		if(listE[j].electronegativity !=0){
	    			System.out.println("electronegativity: "+listE[j].electronegativity);
	    		}else{
	    			System.out.println("electronegativity: "+listE[j].electronegativity1);
	    		}
	    		System.out.println("density: "+listE[j].density);
	    		System.out.println("number of protons: "+j);
    		}
    		
    		}

		if (!found) System.out.println("SUP, you entered a wrong parameter");
		System.out.println("Dumb fuck.");
	}
}
