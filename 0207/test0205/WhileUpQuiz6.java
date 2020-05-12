package test0205;
//1~100까지의 난수를 발생시켜 몇번에 맞추는지 출력하는  프로그램.
//1~100사이 난수 발생하는 방법  int com=(int)(Math.random()*100+1);
import java.util.Scanner;

public class WhileUpQuiz6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int com,user,cnt; //com:컴퓨터변수,user:입력하는사람 변수,cnt : 입력을 몇번 받았는지 세는 변수
		
		com=(int)(Math.random()*100+1);
		
		cnt=0;
		while(true) {
			System.out.println("수?");
			user=sc.nextInt();
			cnt++; //입력을 몇번 받았는지 세는 구문,
			
			if(com>user) {
				System.out.println("입력한 수보다 더 큽니다.");
			}else if(com<user) {
				System.out.println("입력한 수보다 더 작은수니다.");
			}else {
				System.out.println(cnt+"번에 성공했습니다.");
				break;
			}
		}
		sc.close();
	}

}
