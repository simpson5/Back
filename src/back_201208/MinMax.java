package back_201208;

import java.util.Scanner;

public class MinMax {
	public static void mm() {
		Scanner sc = new Scanner(System.in);
		int[] numArray = new int[5];
		for(int i = 0; i<5; i++) {
			System.out.println("숫자를 입력하세요.");
			numArray[i] = sc.nextInt();
		}
		for(int simp : numArray) {
			System.out.printf("[%d]",simp);
		}
		
		System.out.println("");
		
		int max = numArray[0];
		int min = numArray[0];
		
		for(int i = 0; i<5; i++) {
			if(numArray[i] > max) {
				max = numArray[i];
			}
			if(numArray[i] < min) {
				min = numArray[i];
			}
		}
		
		System.out.printf("[%d] [%d]", max, min);
	}
}
