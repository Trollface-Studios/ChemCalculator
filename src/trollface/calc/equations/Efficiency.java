package trollface.calc.equations;

public class Efficiency extends Equation {

	/*
	 * Takovejhle komentar se vzdycky vztahuje k tomu co je pod nim. Celou
	 * classu si zkopirujte, jen ji zmente jmeno (tady Efficiency), a casti u
	 * kterejch to pisu. DK
	 */
	public Efficiency() {

		/*
		 * Akorat zmente to v uvozovkach na titul oblasti ve ktery se pocita -
		 * Concentration, Temperature change, atd
		 */
		friendlyName = "Efficiency (ex.)";

		/*
		 * Ma to vypadat presne stejne, jeden radek: jeden mod kalkulacky. Prvni
		 * parametr (Properties.XXX) je vzdycky co tenhle mod umi spocitat, a
		 * zbytek (muze jich bejt i vic, treba 5) jsou udaje ktery k tomu
		 * potrebujem, aby nam uzivatel poskytnul.
		 * 
		 * Zase - 1 radek na jeden mod, takze kdyz jsme schopny spocitat treba 6
		 * ruznejch veci, bude tam sest radku.
		 */
		modes = new Properties[][] {
				{ Properties.Efficiency, Properties.Input, Properties.Output },
				{ Properties.Output, Properties.Input, Properties.Efficiency },
				{ Properties.Input, Properties.Output, Properties.Efficiency } };

	}

	/*
	 * Tady se pise ta samotna matematika, co ma kalkulacka udelat v jakym modu.
	 * Ridi se to radkama definovanejma nahore v modes. case 0: je prvni radek,
	 * case 1: je druhej, a tak dale. A argumenty jdou od [0] vejs, podle toho,
	 * v jakym poradi jsou zadefinovany v tom odpovidajicim radku.
	 * 
	 * Takze arguments[0] znamena druhej ten Properties.XXX v odpovidajicim
	 * radku, protoze prvni rika co bude vysledek a pocitac pocita od 0.
	 * arguments[1] bude znamenat treti na tom radku a tak dal a tak dal.
	 * 
	 * Pracujte s nima jako s normalnima cislama, a proste pisete matematicky
	 * rovnice a hodnota ty rovnice co mate za "return" se rekne uzivateli. Nic
	 * vic.
	 */
	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] / arguments[0] * 100 + "%";
		case 1:
			return arguments[0] * arguments[1] / 100f + " W";
		case 2:
			return arguments[0] * (1 / (arguments[1] / 100)) + " W";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}