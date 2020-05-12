package test0217;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Random_Class_Lotto_EX19 {
	public static void main(String[] args) {
		Lotto ob=new Lotto();  //�޸� �Ҵ�
		ob.buy(); 
		}
	
	}
class Lotto{
	private Scanner sc=new Scanner(System.in);
	private int[] num;
	
	public Lotto() {
		num=new int[6];  //�����ڿ��� �޸� �Ҵ�.
	}
	
//�ζ� 6�� ������(�ζǹ�ȣ����) �޼ҵ�
	protected void lottoNum() {   //�ζ� ����
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
	
//��ȣ �����ϴ� �޼ҵ�
	private void sorting() {   //sort�� «
		Arrays.sort(num);
	}
	
//���� ����ϴ� �޼ҵ�
	public void write() {
		for(int n: num) {
			System.out.printf("%4d",n);
		}
		System.out.println();
	}
	
//�����ϴ� �޼ҵ�	
	public void buy() {
		int n;
		
		do {
			System.out.println("���� ����[1~5] ?");			
			n=sc.nextInt();
		}while(n<1||n>5);
		
		for(int i=1;i<=n;i++) {
			lottoNum();
			System.out.println(i+"��° : ");
			write();
		}
	}
	
}


