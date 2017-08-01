package practice01;

import java.util.Scanner;

public class Prob1 {
private int a;
	
	public Prob1(int b) {
		
		this.a = b;

	}
	
	public void getDevided() {
		

		if(this.a % 3==0)
			System.out.println("3의배수입니다");
		else
			System.out.println("3의배수가 아닙니다");
	}
	public static void main(String[] args) {
		int b;
		Scanner scan = new Scanner(System.in);
		b = scan.nextInt();
		scan.close();
		Prob1 h = new Prob1(b);
		h.getDevided();
				

	}
}
