package CommandCampane;

import java.util.HashMap;
import java.util.Random;

public class Simulatore {
	

	public static void main(String[] args) {
		int lunghezza = 20;
		CampanaCommand din = new CampanaCommand(new CampanaDin());
		CampanaCommand dinTic =new CampanaCommand(new CampanaTic(new CampanaDin()));
		CampanaCommand dinEco =new CampanaCommand(new CampanaEco(new CampanaDin()));
		CampanaCommand dinVento =new CampanaCommand(new CampanaVento(new CampanaDin()));
		
		CampanaCommand don = new CampanaCommand(new CampanaDon());
		CampanaCommand donTic =new CampanaCommand(new CampanaTic(new CampanaDon()));
		CampanaCommand donEco =new CampanaCommand(new CampanaEco(new CampanaDon()));
		CampanaCommand donVento =new CampanaCommand(new CampanaVento(new CampanaDon()));
		
		CampanaCommand dan = new CampanaCommand(new CampanaDan());
		CampanaCommand danTic =new CampanaCommand(new CampanaTic(new CampanaDan()));
		CampanaCommand danEco =new CampanaCommand(new CampanaEco(new CampanaDan()));
		CampanaCommand danVento =new CampanaCommand(new CampanaVento(new CampanaDan()));
		
		Scheduler s = new Scheduler();
		//s.setCommand(dinEco);
		//s.suona();

		HashMap<Integer,CampanaCommand> hm = new HashMap<Integer,CampanaCommand>();
		hm.put(1, din);
		hm.put(2, dinTic);
		hm.put(3, dinEco);
		hm.put(4, dinVento);
		
		hm.put(5, don);
		hm.put(6, donTic);
		hm.put(7, donEco);
		hm.put(8, donVento);
		
		hm.put(9, dan);
		hm.put(10, danTic);
		hm.put(11, danEco);
		hm.put(12, danVento);
		Random random = new Random();
		
		for(int i=0; i<lunghezza; i++) {
			int miavar = random.nextInt(11)+1;
			s.setCommand(hm.get(miavar));
			s.suona();
		}
		
		
		
		
	}

}
