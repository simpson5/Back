package back_201208;

import java.util.Scanner;

public class CountNum {
	public static void count() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 3번 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int k = a*b*c;
		int count;

		System.out.println(k);
		
		String ks = Integer.toString(k);

		for(int i = 0; i < 10 ; i++) {
			count = 0;
			int x = k;
			for(int j = 0; j <= ks.length()-1; j++) {
				if(x%10 == i) {
					count ++;
				}
				x = x /10;
			}
			System.out.println(i+" 의 갯수 : ["+count+"]");
		}
	}
}
