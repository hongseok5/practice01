package practice01;

public class Prob5 {
	public static void main(String[] args) {
int num = 1 ;
		
		for(int i=0; i<10; i++) {
		
			for (int j=1; j<11; j++) {				
				
				
				
					
				if(j%3==0 && (i==0 || i%3!=0))
				System.out.println(num+"짝");
				else if(j%3==0 && i%3==0)
				System.out.println(num+"짝짝");
				num++;
		} // in for 

		} // out for 
		//i를 스트링으로 바꾼다
		//i에 3이 있으면 갯수에 따라 짝을 출력한다

	}
}