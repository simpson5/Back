package back_201208;

public class Snail {
	public static void main(String[] args) {
		int x= 10;
		int[][] arr = new int[x][x];
		int num = 1;
		arr[0][0]=1;
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				if(i==0) {
					arr[i][j] = arr[0][0]+j;
					System.out.print("["+i+"]"+"["+j+"]"+"/."+arr[i][j]); //첫번째 행
				}
				num= (4*(i)*x)-((2*i)*(2*i)); //기준점 숫자
				int k =i-1;
				if(i!=0 && i<(x-1)) {
					if(i<=(x/2) ||(i>(x/2) && j<(x-i))){ 
						if(j==k){
							arr[i][j]=num;
							System.out.print("["+i+"]"+"["+j+"]"+"/"+arr[i][j]); 
							//기준점 숫자 생성
						}
						else if(j>=i && j<(x-i)) {
							arr[i][j]=arr[i][j-1]+1;
							System.out.print("["+i+"]"+"["+j+"]"+"/"+arr[i][j]); 
							//왼쪽 열보다 1증가
						}
						else if(j>=(x-i)) {
							arr[i][j]=arr[i-1][j]+1;
							System.out.print("["+i+"]"+"["+j+"]"+"/"+arr[i][j]); 
							//위쪽 행보다 1증가
						}
						else if(j<=(x/2)) {
							arr[i][j]=arr[i-1][j]-1;
							System.out.print("["+i+"]"+"["+j+"]"+"/"+arr[i][j]); 
							//위쪽 보다 1감소
						}
					}
					else{
						if(j<=i){
							arr[i][j]=arr[i][j-1]-1;
							System.out.print("["+i+"]"+"["+j+"]"+"/"+arr[i][j]); 
							//왼쪽 열보다 1감소
						}
						else if(j>=(x-i)) {
							arr[i][j]=arr[i-1][j]+1;
							System.out.print("["+i+"]"+"["+j+"]"+"/"+arr[i][j]); 
							//위쪽 행보다 1 증가
						}
					}
				}
				else if(i==(x-1)) {
					num = 3*x-2-j;
					arr[i][j] = num;
					System.out.print("["+i+"]"+"["+j+"]"+"/"+arr[i][j]); 
					//마지막 행
				}
			}
			System.out.println();
		}
	}
}


