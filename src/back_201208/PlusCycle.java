package back_201208;

import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		PlusCycle p = new PlusCycle();
		p.test2();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두자리 수 정수 입력:");
		int num = sc.nextInt();
		int cnt = 1;
		int one;
		int ten;
		int nNum;
		int num2;
		int num3 = num;
		
		while(true) {
			one = num%10;
			ten = num/10;
			nNum = one+ten;
			num2 = 10*one + nNum;
			
			
			
			System.out.println(cnt + "번째 " + num+ " / " + num2 + " / " + num3);
			
			if(num2 == num3) {
				System.out.println(cnt + ": 정답");
				break;
			}
			else {
				num = num2;
				cnt ++;
			}
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두자리 수 정수 입력:");
		int num = sc.nextInt();
		int cnt = 1;
		int one;
		int ten;
		int nNum;
		int num2;
		int num3 = num;
		
		while(true) {
			one = num%10;
			ten = num/10;
			nNum = one+ten;
			if(nNum > 10) {
				nNum = nNum%10;
			}
			num2 = 10*one + nNum;
			
			if(num2 == num3) {
				System.out.println(cnt + "번째 " + num+ " / " + num2 + " / " + num3);
				System.out.println(cnt);
				break;
			}
			else {
				System.out.println(num+ " / " + num2 + " / " + num3);
				num = num2;
				cnt ++;
			}
		}
	}
}
