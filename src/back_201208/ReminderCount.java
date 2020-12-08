package back_201208;

import java.util.Scanner;

public class ReminderCount {
	public static void remind() {
		Scanner sc = new Scanner(System.in);
		int[] numArray = new int[10];
		for(int i = 0; i<10; i++) {
			System.out.println("숫자를 입력하세요.");
			numArray[i] = sc.nextInt();
		}
		Array.array(numArray);
		
		int[] remind = new int[10];
		for(int i = 0; i<10; i++) {
			remind[i] = numArray[i] % 2;
		}
		Array.array(remind);
		
		int count = 1;
		int[] k = null;
		
		for(int i = 0; i<10; i++) {
			for(int j = i + 1; j<10; j++) {
				if(remind[i] != remind[j]) {
					count++;
				}
				else {
				}
			}
		}
		System.out.println("서로 다른 나머지는 " + count + "개 입니다");
	}
}
