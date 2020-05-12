package test0217;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Random_Class_Lotto_EX19 {
	public static void main(String[] args) {
		Lotto ob=new Lotto();  //메모리 할당
		ob.buy(); 
		}
	
	}
class Lotto{
	private Scanner sc=new Scanner(System.in);
	private int[] num;
	
	public Lotto() {
		num=new int[6];  //생성자에서 메모리 할당.
	}
	
//로또 6개 돌리는(로또번호생성) 메소드
	protected void lottoNum() {   //로또 생성
		Random rnd = new Random();
		for(int i=0;i<6;i++) {
			num[i]=rnd.nextInt(45)+1;
			for(int j=0; j<i;j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
		}
		sorting();
	}
	
//번호 정렬하는 메소드
	private void sorting() {   //sort만 짬
		Arrays.sort(num);
	}
	
//숫자 출력하는 메소드
	public void write() {
		for(int n: num) {
			System.out.printf("%4d",n);
		}
		System.out.println();
	}
	
//구매하는 메소드	
	public void buy() {
		int n;
		
		do {
			System.out.println("구매 개수[1~5] ?");			
			n=sc.nextInt();
		}while(n<1||n>5);
		
		for(int i=1;i<=n;i++) {
			lottoNum();
			System.out.println(i+"번째 : ");
			write();
		}
	}
	
}


