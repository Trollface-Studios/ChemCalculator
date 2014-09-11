package trollface.calc.core;

public class VarChoice {
	
	String [] Vars = {"volume","concentration","molarmass","name","mass","n"};
	
	public VarChoice(String name){
	switch(name){
		case "Concentration":
			for(int l =0; l<5; l++){
			System.out.println(Vars[l]);
			//n, V, M, n, name
			}
			break;
		case "Molarmass":
			break;
		case "n":
			
			//V,c,M/name,m
			break;
		case "Mass":
			
			//n,M
			break;
	}
	}
}
