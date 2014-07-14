package trollface.calc.core;

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
	TextField textField;
	InputListener listener;
	Color color;
	int x = 300;
	int y = 100;
	StringData[] listE;
	Image background, sipka, sipkaglow, clickbox, clickedjej, settings;
	boolean colorText = false, glowactive = false, clicked = false, outofSet=false, clicked1 = false,unclicked = true,settingsThere=true;
	Base game;
	
	public Calculations(Base game) {
		this.game = game;
	}

	public void elements() {

		listE = new StringData[48];
		listE[0] = new StringData();
		listE[0].name = "DOES NOT EXIST";

		listE[1] = new StringData();
		listE[1].name = "H";
		listE[1].fullname = "Hydrogen";
		listE[1].electronegativity = 2.2;
		listE[1].density = 0.090;
		listE[1].molarmass = 1.01;

		listE[2] = new StringData();
		listE[2].name = "He";
		listE[2].fullname = "Hellium";
		listE[2].electronegativity1 = "Unknown";
		listE[2].density = 0.179;
		listE[2].molarmass = 4.00;

		listE[3] = new StringData();
		listE[3].name = "Li";
		listE[3].fullname = "Lithium";
		listE[3].electronegativity = 0.98;
		listE[3].density = 0.535;
		listE[3].molarmass = 6.94;

		listE[4] = new StringData();
		listE[4].name = "Be";
		listE[4].fullname = "Beryllium";
		listE[4].electronegativity = 1.57;
		listE[4].density = 1.85;
		listE[4].molarmass = 9.01;

		listE[5] = new StringData();
		listE[5].name = "B";
		listE[5].fullname = "Boron";
		listE[5].electronegativity = 2.04;
		listE[5].density = 2.46;
		listE[5].molarmass = 10.81;

		listE[6] = new StringData();
		listE[6].name = "C";
		listE[6].fullname = "Carbon";
		listE[6].electronegativity = 2.55;
		listE[6].density = 2.260;
		listE[6].molarmass = 12.01;

		listE[7] = new StringData();
		listE[7].name = "N";
		listE[7].fullname = "Nitrogen";
		listE[7].electronegativity = 3.04;
		listE[7].density = 1.251;
		listE[7].molarmass = 14.01;

		listE[8] = new StringData();
		listE[8].name = "O";
		listE[8].fullname = "Oxygen";
		listE[8].electronegativity = 3.44;
		listE[8].density = 1.429;
		listE[8].molarmass = 16.00;

		listE[9] = new StringData();
		listE[9].name = "F";
		listE[9].fullname = "Fluorine";
		listE[9].electronegativity = 3.98;
		listE[9].density = 1.696;
		listE[9].molarmass = 19.00;

		listE[10] = new StringData();
		listE[10].name = "Ne";
		listE[10].fullname = "Neon";
		listE[10].electronegativity1 = "Unknown";
		listE[10].density = 0.900;
		listE[10].molarmass = 20.18;

		listE[11] = new StringData();
		listE[11].name = "Na";
		listE[11].fullname = "Na";
		listE[11].electronegativity = 0.93;
		listE[11].density = 0.968;
		listE[11].molarmass = 22.99;

		listE[12] = new StringData();
		listE[12].name = "Mg";
		listE[12].electronegativity = 1.31;
		listE[12].density = 1.738;
		listE[12].molarmass = 24.31;

		listE[13] = new StringData();
		listE[13].name = "Al";
		listE[13].electronegativity = 1.61;
		listE[13].density = 2.7;
		listE[13].molarmass = 26.98;

		listE[14] = new StringData();
		listE[14].name = "Si";
		listE[14].electronegativity = 1.9;
		listE[14].density = 2.330;
		listE[14].molarmass = 28.09;

		listE[15] = new StringData();
		listE[15].name = "P";
		listE[15].electronegativity = 2.19;
		listE[15].density = 1.823;
		listE[15].molarmass = 30.97;

		listE[16] = new StringData();
		listE[16].name = "S";
		listE[16].electronegativity = 2.58;
		listE[16].density = 1.960;
		listE[16].molarmass = 32.07;

		listE[17] = new StringData();
		listE[17].name = "Cl";
		listE[17].electronegativity = 3.16;
		listE[17].density = 3.214;
		listE[17].molarmass = 35.45;

		listE[18] = new StringData();
		listE[18].name = "Ar";
		listE[18].electronegativity1 = "Unknown";
		listE[18].density = 1.784;
		listE[18].molarmass = 39.95;

		listE[19] = new StringData();
		listE[19].name = "K";
		listE[19].electronegativity = 0.82;
		listE[19].density = -0.856;
		listE[19].molarmass = 39.10;

		listE[20] = new StringData();
		listE[20].name = "Ca";
		listE[20].electronegativity = 1;
		listE[20].density = 1.550;
		listE[20].molarmass = 40.08;

		listE[21] = new StringData();
		listE[21].name = "Sc";
		listE[21].electronegativity = 1.36;
		listE[21].density = 2.985;
		listE[21].molarmass = 44.96;

		listE[22] = new StringData();
		listE[22].name = "Ti";
		listE[22].electronegativity = 1.54;
		listE[22].density = 4.507;
		listE[22].molarmass = 47.87;

		listE[23] = new StringData();
		listE[23].name = "V";
		listE[23].electronegativity = 1.63;
		listE[23].density = 6.110;
		listE[23].molarmass = 50.94;

		listE[24] = new StringData();
		listE[24].name = "Cr";
		listE[24].electronegativity = 1.66;
		listE[24].density = 7.140;
		listE[24].molarmass = 52.00;

		listE[25] = new StringData();
		listE[25].name = "Mn";
		listE[25].electronegativity = 1.55;
		listE[25].density = 7.470;
		listE[25].molarmass = 54.94;

		listE[26] = new StringData();
		listE[26].name = "Fe";
		listE[26].electronegativity = 1.83;
		listE[26].density = 7.874;
		listE[26].molarmass = 55.85;

		listE[27] = new StringData();
		listE[27].name = "Co";
		listE[27].electronegativity = 1.88;
		listE[27].density = 8.900;
		listE[27].molarmass = 58.93;

		listE[28] = new StringData();
		listE[28].name = "Ni";
		listE[28].electronegativity = 1.91;
		listE[28].density = 8.908;
		listE[28].molarmass = 58.69;
		// neupraveno
		listE[29] = new StringData();
		listE[29].name = "Cu";
		listE[29].electronegativity = 1.31;
		listE[29].density = 1.738;
		listE[29].molarmass = 24.31;

		listE[30] = new StringData();
		listE[30].name = "Mg";
		listE[30].electronegativity = 1.31;
		listE[30].density = 1.738;
		listE[30].molarmass = 24.31;

		listE[31] = new StringData();
		listE[31].name = "Mg";
		listE[31].electronegativity = 1.31;
		listE[31].density = 1.738;
		listE[31].molarmass = 24.31;

		listE[32] = new StringData();
		listE[32].name = "Mg";
		listE[32].electronegativity = 1.31;
		listE[32].density = 1.738;
		listE[32].molarmass = 24.31;

		listE[33] = new StringData();
		listE[33].name = "Mg";
		listE[33].electronegativity = 1.31;
		listE[33].density = 1.738;
		listE[33].molarmass = 24.31;

		listE[34] = new StringData();
		listE[34].name = "Mg";
		listE[34].electronegativity = 1.31;
		listE[34].density = 1.738;
		listE[34].molarmass = 24.31;

		listE[35] = new StringData();
		listE[35].name = "Mg";
		listE[35].electronegativity = 1.31;
		listE[35].density = 1.738;
		listE[35].molarmass = 24.31;

		listE[36] = new StringData();
		listE[36].name = "Mg";
		listE[36].electronegativity = 1.31;
		listE[36].density = 1.738;
		listE[36].molarmass = 24.31;

		listE[37] = new StringData();
		listE[37].name = "Mg";
		listE[37].electronegativity = 1.31;
		listE[37].density = 1.738;
		listE[37].molarmass = 24.31;

		listE[38] = new StringData();
		listE[38].name = "Mg";
		listE[38].electronegativity = 1.31;
		listE[38].density = 1.738;
		listE[38].molarmass = 24.31;

		listE[39] = new StringData();
		listE[39].name = "Mg";
		listE[39].electronegativity = 1.31;
		listE[39].density = 1.738;
		listE[39].molarmass = 24.31;

		listE[40] = new StringData();
		listE[40].name = "Mg";
		listE[40].electronegativity = 1.31;
		listE[40].density = 1.738;
		listE[40].molarmass = 24.31;

		listE[41] = new StringData();
		listE[41].name = "Mg";
		listE[41].electronegativity = 1.31;
		listE[41].density = 1.738;
		listE[41].molarmass = 24.31;

		listE[42] = new StringData();
		listE[42].name = "Mg";
		listE[42].electronegativity = 1.31;
		listE[42].density = 1.738;
		listE[42].molarmass = 24.31;

		listE[43] = new StringData();
		listE[43].name = "Mg";
		listE[43].electronegativity = 1.31;
		listE[43].density = 1.738;
		listE[43].molarmass = 24.31;

		listE[44] = new StringData();
		listE[44].name = "Mg";
		listE[44].electronegativity = 1.31;
		listE[44].density = 1.738;
		listE[44].molarmass = 24.31;

		listE[45] = new StringData();
		listE[45].name = "Mg";
		listE[45].electronegativity = 1.31;
		listE[45].density = 1.738;
		listE[45].molarmass = 24.31;

		listE[46] = new StringData();
		listE[46].name = "Mg";
		listE[46].electronegativity = 1.31;
		listE[46].density = 1.738;
		listE[46].molarmass = 24.31;

		listE[47] = new StringData();
		listE[47].name = "Mg";
		listE[47].electronegativity = 1.31;
		listE[47].density = 1.738;
		listE[47].molarmass = 24.31;
	}

	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {

		background = new Image("src/images/calc/core/chemBackground.png");
		sipka = new Image("src/images/calc/core/gobackbutton1.png");
		sipkaglow = new Image("src/images/calc/core/gobackbutton.png");
		clickbox = new Image("src/images/calc/core/clickbox.png");
		clickedjej = new Image("src/images/calc/core/clicked.png");
		settings = new Image("src/images/calc/core/CalSet.png");



		elements();
		font = new UnicodeFont(new java.awt.Font(java.awt.Font.SANS_SERIF,
				java.awt.Font.ITALIC, 26));
		//if(settingsThere==false){
		textField = new TextField(c, c.getDefaultFont(), 170, 150, x, y,
				new ComponentListener() {

					@Override
					public void componentActivated(AbstractComponent source) {
						TextField field = (TextField) source;
						String text = field.getText();
						int counter = 0;
						for (int i = 0; i < 47; i++) {
							if (text.contains(listE[i].name)) {
								System.out.println("Name: " + listE[i].fullname
										+ "  Molarmass " + listE[i].molarmass);
								counter++;
								colorText = false;
								System.out.println("The compound contains "
										+ counter + " elements.");
							}if(!text.contains(listE[i].name)){
								colorText = true;
								
								
							}else{
								colorText = false;
								
							}
						
						}
						if(colorText ==true){
							textField.setTextColor(color.red);
						}if(colorText == false){
							textField.setTextColor(color.white);
						}

						for (int i = 0; i < text.length(); i++) {
							char c = text.charAt(i);
							if (Character.isDigit(c)) {

								int a = Character.digit(c, 10);
								//System.out.println("debug " + a);

								 String b = String.valueOf(a);
								
								text.indexOf(b);
								String[]mnam = text.split("(?!^)");
								for(int j=0;j<mnam.length;j++){
									if(mnam[j].equals(b)){
										for(int n=0;n<47;n++){
											if(mnam[j-1].equals(listE[n].name)){
												System.out.println(mnam[j-1]);
												System.out.println(listE[n].molarmass*a);
										
									}	
								}
								}
								}
								
//								char[] hamm =new char[text.length()];
//								String newText = text.substring(0, text.length()- text.indexOf(b));
//								
//								 System.out.println(text.indexOf(b));
//								 System.out.println(newText);
								
//								 String newText = text.substring(0,
//								 text.length() - a );
//								 System.out.println(newText);
//								 for (int j = 0; j < 47; j++) {
//								
//								 if(text.contains(listE[j].name)){
//								 System.out.println(listE[j].name);
//								 }
//								 if (newText.equals(listE[j].name)) {
//								 double x = (double) (listE[j].molarmass * a);
//								 System.out.println("molar mass: " + x);
//								 }
								 //}
							}
						}
					}
				});
		
		textField.setBorderColor(color.black);
		textField.setBackgroundColor(color.lightGray);
	}

	//}

	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {
		Input input = c.getInput();
		
		int posX = Mouse.getX();
		int posY = Mouse.getY();

		System.out.println(posX+" "+posY);
		
		if ((posX > 10 && posY > 18) && (posX < 78 && posY < 60)) {
			glowactive = true;
			
		} else {
			glowactive = false;
		}
		if ((posX > 80 && posY > 160) && (posX < 103 && posY < 180)) {
			clicked = true;
			
		} else {
			clicked = false;
		}
//		if((posX<123 && posY>53)&&(posX>55&&posY<94)){
//			outofSet = true;
//		}else{
//			outofSet = false;
//		}
//		System.out.println(outofSet+" "+settingsThere);


	}

	public void render(GameContainer c, StateBasedGame game, Graphics g)
			throws SlickException {
		
		background.draw();
	//	if(settingsThere==false){
		textField.render(c, g);
	//	}
		sipka.draw(10, 420);
		clickbox.draw(80, 300);
		g.drawString("molar mass", 115, 300);
		
		if(glowactive==true){
			sipkaglow.draw(10,420);
		}
		if(clicked1==true){
			clickedjej.draw(80,300);
		}
	//	if(settingsThere==true){
		//settings.draw();
		//}
	//	sipka.draw(55, 387);
		

	}
	public void mouseClicked(int button, int x, int y, int clickCount) {
		if(glowactive==true){
		
			game.enterState(0);
		}
		if(clicked == true){
			clicked1 =true;
		}else{
			clicked1 = false;
		}
//		if(outofSet ==true){
//			settingsThere=false;
//		}

		}	

	public int GetID() {
		return 1;
	}

	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}

	 
}

