package test0207;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_Quiz3 {
//���Ű����� �Է¹޾� ���Ű�����ŭ�� �ζǸ� ����ϴ� ���α׷�.
	//���Ű����� 1~5���̰� �ƴѰ�� �ٽ� �Է¹޴´�.
//1~45������ ���� �߻�. => (int)(Math.ranom()*45+1; 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//	int[]a= {4,6,8,34,33,10};
		int []num=new int[6];
		int cnt; //cnt:���Ű�������
		
		//���Ű��� �Է¹޴� ����.��
		do {
		System.out.println("���Ű���[1~5]? : ");
		cnt=sc.nextInt();
		}while(1>cnt||cnt>5);  //�Է°��� 1-5���� ����� ���Է� ����. 
			
		for(int i=1;i<=cnt;i++) {			
			for(int a=0; a<num.length;a++) { //�Ȱ��� ���ڰ� �ȳ����� �ϴ� ����.
				num[a]=(int)(Math.random()*45)+1; //45���� ���� ������µǴ� �Լ�.
				for(int b=0; b<a;b++) {     
					if(num[a]==num[b]) {
						a--;
						break;
					}
				}
			}
			//����
			Arrays.sort(num); //���������� �������ִ� �Լ�
			System.out.println(i+"��° : ");
			for(int n: num) {
				System.out.printf("%5d",n);
			}
			System.out.println();
		}
		sc.close();
		
	}	
}		
		//Arrays.sort(num);  //���������� �������ִ� �Լ�
	//	for(com=1;com<=45;com++) {
	//		System.out.print(com+" ");
	//		for(n=1;n<6;n++) {
	//		com=(int)(Math.random()*45)+1;
	//	}
	//	}
		//for(int n:num) {
			//System.out.print(n+" ");
	//	}
		//System.out.println();
	


