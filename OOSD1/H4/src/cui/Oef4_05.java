package cui;

public class Oef4_05 {

	public static void main(String[] args) {
		new Oef4_05().method1();
	}
	
	private void method1() {
		int[] omzet = new int[]{2100, 450, 1450, 650, 780, 321, 1200, 560, 1850, 960, 420};
		int lowest = Integer.MAX_VALUE, highest = 0, lowMonth = 0, highMonth = 0;
		int i = 1;
		
		for (int num : omzet) {
			if(num < lowest) {
				lowest = num;
				lowMonth = i;
			}
			if(num > highest) {
				highest = num;
				highMonth = i;
			}
			i++;
		}
		
		System.out.printf("Hoogste omzet van %d Euro werd behaald in %d %s maand%n", highest, highMonth, highMonth==1?"ste":"de");
		System.out.printf("Laagste omzet van %d Euro werd behaald in %d %s maand%n", lowest, lowMonth, lowMonth==1?"ste":"de");
	}

}
