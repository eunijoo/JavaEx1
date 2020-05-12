package test0204;
import java.util.Scanner;
public class HapEx {
//원하는 번호를 입력받아 합 계산
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num,s;
		int ch;
		int start,offset;
		
		while(true) { //무한루프하려고 조건에 true를 줌.
			do {
				System.out.println("1.전체 합  2.홀수합  3.짝수합  4.종료 =>");
				ch=sc.nextInt();
			}while(ch<1||ch>4);
			
			if(ch==4)break; // 4가 되면 while(true) 문을 빠져나감.
			
			System.out.println("원하는 수?");
			num=sc.nextInt();
			
			switch(ch) {
			case 1: start=1; offset=1; break; //자연수합
			case 2: start=1; offset=2; break; //홀수합
			default: start=2; offset=2; break; //짝수합
			}
			
			s=0;
			for(int i=start; i<=num;i+=offset) {  //합구하는 식
				s+=i;
			}
			/*합구하는구문을 간결하게 하기위해 변하는 값이 바뀌는 부분만 변수로 줘서 값이 변할수 있게 해줌.
			  (위의 switch문에서 변수값을 줌)
			  	s=0;
				for(int i=1; i<=num;i+=1) {  //자연수 전체합
					s+=i;
				}
				for(int i=1; i<=num;i+=2) {  //홀수합
					s+=i;
				}
				for(int i=2; i<=num;i+=2) {  //짝수합
					s+=i;
				}
			 */
			System.out.println("결과 : "+s);
		}	
		sc.close();
	}
}


