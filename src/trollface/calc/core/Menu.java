package trollface.calc.core;

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
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu extends BasicGameState{
	private static AppGameContainer app;
	
	Font font;
	TextField textField;
	InputListener listener;
	Color color;
	int x =300;
	int y=100;
	
	
	public void elements(){
		
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
     	
//     	listE[4] = new StringData();
//     	listE[4].name = "Be";
//     	listE[4].fullname = "Beryllium";
//     	listE[4].electronegativity =1.57;
//     	listE[4].density =1.85;
//     	listE[4].molarmass = 9.01;
//     	
//     	listE[5] = new StringData();
//     	listE[5].name = "B";
//     	listE[5].fullname = "Boron";
//     	listE[5].electronegativity =2.04;
//     	listE[5].density =2.46;
//     	listE[5].molarmass = 10.81;
//     	
//     	listE[6] = new StringData();
//     	listE[6].name = "C";
//     	listE[6].fullname = "Carbon";
//     	listE[6].electronegativity =2.55;
//     	listE[6].density =2.260;
//     	listE[6].molarmass = 12.01;
//     	
//     	listE[7] = new StringData();
//     	listE[7].name = "N";
//     	listE[7].fullname = "Nitrogen";
//     	listE[7].electronegativity =3.04;
//     	listE[7].density =1.251;
//     	listE[7].molarmass = 14.01;
//     	
//     	listE[8] = new StringData();
//     	listE[8].name = "O";
//     	listE[8].fullname = "Oxygen";
//     	listE[8].electronegativity =3.44;
//     	listE[8].density =1.429;
//     	listE[8].molarmass = 16.00;
//     	
//     	listE[9] = new StringData();
//     	listE[9].name = "F";
//     	listE[9].fullname = "Fluorine";
//     	listE[9].electronegativity =3.98;
//     	listE[9].density =1.696;
//     	listE[9].molarmass = 19.00;
//     	
//     	listE[10] = new StringData();
//     	listE[10].name = "Ne";
//     	listE[10].fullname = "Neon";
//     	listE[10].electronegativity1 ="Unknown";
//     	listE[10].density =0.900;
//     	listE[10].molarmass = 20.18;
//     	
//     	listE[11] = new StringData();
//     	listE[11].name = "Na";
//     	listE[11].fullname = "Na";
//     	listE[11].electronegativity =0.93;
//     	listE[11].density =0.968;
//     	listE[11].molarmass = 22.99;
//     	
//     	listE[12] = new StringData();
//     	listE[12].name = "Mg";
//     	listE[12].electronegativity =1.31;
//     	listE[12].density =1.738;
//     	listE[12].molarmass = 24.31;
//
//     	//neupraveno
//     	listE[13] = new StringData();
//     	listE[13].name = "Mg";
//     	listE[13].electronegativity =1.31;
//     	listE[13].density =1.738;
//     	listE[13].molarmass = 24.31;
//     	
//     	listE[14] = new StringData();
//     	listE[14].name = "Mg";
//     	listE[14].electronegativity =1.31;
//     	listE[14].density =1.738;
//     	listE[14].molarmass = 24.31;
//     	
//     	listE[15] = new StringData();
//     	listE[15].name = "Mg";
//     	listE[15].electronegativity =1.31;
//     	listE[15].density =1.738;
//     	listE[15].molarmass = 24.31;
//     	
//     	listE[16] = new StringData();
//     	listE[16].name = "Mg";
//     	listE[16].electronegativity =1.31;
//     	listE[16].density =1.738;
//     	listE[16].molarmass = 24.31;
//
//     	listE[17] = new StringData();
//     	listE[17].name = "Mg";
//     	listE[17].electronegativity =1.31;
//     	listE[17].density =1.738;
//     	listE[17].molarmass = 24.31;
//
//     	listE[18] = new StringData();
//     	listE[18].name = "Mg";
//     	listE[18].electronegativity =1.31;
//     	listE[18].density =1.738;
//     	listE[18].molarmass = 24.31;
//
//     	listE[19] = new StringData();
//     	listE[19].name = "Mg";
//     	listE[19].electronegativity =1.31;
//     	listE[19].density =1.738;
//     	listE[19].molarmass = 24.31;
//     	
//     	listE[20] = new StringData();
//     	listE[20].name = "Mg";
//     	listE[20].electronegativity =1.31;
//     	listE[20].density =1.738;
//     	listE[20].molarmass = 24.31;
//
//     	listE[21] = new StringData();
//     	listE[21].name = "Mg";
//     	listE[21].electronegativity =1.31;
//     	listE[21].density =1.738;
//     	listE[21].molarmass = 24.31;
//
//     	listE[22] = new StringData();
//     	listE[22].name = "Mg";
//     	listE[22].electronegativity =1.31;
//     	listE[22].density =1.738;
     	listE[22].molarmass = 24.31;

     	listE[23] = new StringData();
     	listE[23].name = "Mg";
     	listE[23].electronegativity =1.31;
     	listE[23].density =1.738;
     	listE[23].molarmass = 24.31;

     	listE[24] = new StringData();
     	listE[24].name = "Mg";
     	listE[24].electronegativity =1.31;
     	listE[24].density =1.738;
     	listE[24].molarmass = 24.31;

     	listE[25] = new StringData();
     	listE[25].name = "Mg";
     	listE[25].electronegativity =1.31;
     	listE[25].density =1.738;
     	listE[25].molarmass = 24.31;
     	listE[26] = new StringData();
     	listE[26].name = "Mg";
     	listE[26].electronegativity =1.31;
     	listE[26].density =1.738;
     	listE[26].molarmass = 24.31;

     	listE[27] = new StringData();
     	listE[27].name = "Mg";
     	listE[27].electronegativity =1.31;
     	listE[27].density =1.738;
     	listE[27].molarmass = 24.31;

     	listE[28] = new StringData();
     	listE[28].name = "Mg";
     	listE[28].electronegativity =1.31;
     	listE[28].density =1.738;
     	listE[28].molarmass = 24.31;

     	listE[29] = new StringData();
     	listE[29].name = "Mg";
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
	}
	
	public void init(GameContainer c, StateBasedGame game)throws SlickException{
		

		font = new UnicodeFont(new java.awt.Font(java.awt.Font.SANS_SERIF, java.awt.Font.ITALIC, 26));
		textField = new TextField(c,c.getDefaultFont(), 200, 50, x, y, (ComponentListener) listener);
		textField.setBorderColor(color.green);
		textField.setBackgroundColor(color.darkGray);
		
	}
	public void update(GameContainer c, StateBasedGame game, int delta)throws SlickException{
		Input input = c.getInput();
		if(input.isKeyDown(Input.KEY_ENTER)){
			
			y = y-10;
			
		}
	}
	public void render(GameContainer c, StateBasedGame game, Graphics g)throws SlickException{
		textField.render(c, g);
	
	}
	
	public int GetID(){
		return 0;
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
