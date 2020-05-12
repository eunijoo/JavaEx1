import java.util.Arrays;
import java.util.Scanner;

public class Quiz103_Lotto {

	public static void main(String[] args) {
/*	
		구매 개수를 입력 받아 로또를 출력하는 프로그램
*/	
		Scanner sc=new Scanner(System.in);
		int num[] = new int[6];
		int cnt;

		do{
			System.out.print("구매개수[1~5] ? ");
			cnt = sc.nextInt();
		}while(cnt<1 || cnt>5);

		for(int i=1; i<=cnt; i++){
			for(int j=0; j<num.length; j++){
				num[j] = (int)(Math.random()*45)+1;
				for(int k=0; k<j; k++){
					if(num[j]==num[k]) { 
						j--;
						break;
					}
				}
			}

			// 정렬
			Arrays.sort(num);

			System.out.print(i+"번째: ");
			for(int n : num){
				System.out.printf("%5d", n);
			}

			System.out.println();
		}
		
		sc.close();
	}
}
