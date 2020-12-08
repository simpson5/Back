package back_201208;

import java.util.Scanner;

public class Alarm {
	public static void alarm() {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		System.out.println(hour + " : "+ min);
		
		if(min >= 45) {
			System.out.println(hour + " : "+ (min - 45));
		}
		else {
			System.out.println((hour - 1) + " : "+ (min + 15));
		}
	}
}
