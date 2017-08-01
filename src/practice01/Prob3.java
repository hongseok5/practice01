package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
	
		int a;           // 사용자 입력 값
		int sum=0;
		int i=0;           // 누적값
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		if(a%2==0) {
			for(i=0; i<a+1;i+=2)
			sum += i;
		}
			else {
				for(i=1; i<a+1; i+=2)
					sum += i;
		}
		System.out.println(sum);
		while( true ) {       // 사용 안함 
		}
	}
}