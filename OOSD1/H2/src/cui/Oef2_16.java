package cui;

import java.util.Scanner;

public class Oef2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_16().method1();
	}
	
	private void method1() {
		Scanner scan = new Scanner(System.in);
		
		int[] nums;
		nums = new int[3]; //VooDoo array magic
		
		int som = 0;
		int biggest = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("Geef %dste getal: ", i);
			nums[i] = scan.nextInt();
			som += nums[i];
			biggest = nums[i]>biggest?nums[i]:biggest;
		}
		
		int gem = som/3;
		int rest = som%gem;
		
		System.out.printf("Van de ingevoerde getalen %d, %d en %d%n", nums[0], nums[1], nums[2]);
		System.out.printf("is de som %d%n", som);
		System.out.printf("het gemidlde %d%n", gem);
		System.out.printf("en de rest %d%n", rest);
		System.out.printf("en het grooste getal %d", biggest);
	}

}
