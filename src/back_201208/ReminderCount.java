package back_201208;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

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
			remind[i] = numArray[i] % 3;
		}
		Array.array(remind);
		
		int count = 1;
		ArrayList<Integer> simp = new ArrayList<Integer>();
		for(int i = 0; i<10; i++) {
			simp.add(remind[i]);
		}
		
		//TreeSet으로 정렬
		TreeSet<Integer> simp2 = new TreeSet<Integer>(simp);
		
		//TreeSet 값을 다시 배열에 대입
		ArrayList<Integer> simp3 = new ArrayList<Integer>(simp2);
		
		for(int print : simp) {
			System.out.print("["+print+"] ");
		}
		
		System.out.println("");
		
		for(int print : simp3) {
			System.out.print("["+print+"] ");
		}
		
		System.out.println("");
		System.out.println("서로 다른 나머지는 " + simp3.size() + "개 입니다");
	}
}
