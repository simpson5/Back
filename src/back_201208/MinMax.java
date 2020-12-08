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
		Array.array(numArray);
		
		int max = numArray[0];
		int numMax = 0;
		int min = numArray[0];
		int numMin = 0;
		
		for(int i = 0; i<5; i++) {
			if(numArray[i] > max) {
				max = numArray[i];
				numMax = i+1;
			}
			if(numArray[i] < min) {
				min = numArray[i];
				numMin = i+1;
			}
		}
		
		System.out.printf("%d번 :[%d] / %d번 : [%d]", numMax, max, numMin, min);
	}
}
