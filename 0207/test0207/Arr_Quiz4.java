package test0207;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_Quiz4 {
//��,���� �Է¹޾� �Է¹��� ��¥�� �޷��� ����ϴ� ���α׷�.
//�Է��� ���� 1~12 ������ ���� �ƴϸ� �ٽ� �Է¹޴´�.
//�޷��� �迭�� �̿��Ͽ� �ۼ�.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] month= {31,0,31,30,31,30,31,31,30,31,30,31};
		String [] week = {"��","��","ȭ","��","��","��","��"};
		int y,m,d;
				
		do {
			System.out.println("�⵵? : ");
			y=sc.nextInt();
		}while(y<1900);
		
		do {
			System.out.println("��? : ");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		//2��(������)
		if(y%4==0&&y%100!=0||y%400==0) {
			month[1]=29; //month[1](2������Ǿ�����)�� 29�϶�
		}else {
			month[1]=28; //month[1](2������Ǿ�����)�� 28�϶�
		}

			//	while(d<1 ||d>month[m-1]) {
			//		System.out.println(d);
			//	}
		//1��1��1���� ������
		int tot;  //��ü �� ���� ����
		tot=(y-1)*365 + ((y-1)/4-(y-1)/100+(y-1)/400);//2019��*365�� +(2019/4-2019/100 -2019/400)
		for(int i=0 ; i<m-1;i++) {		//��ü����+= (1��,2��,3��)
			tot+=month[i]; 
		}
		//tot+=d;		//��ü���� += 20��
		System.out.printf("%d�� %d��\n",y,m);

		for(d=1;d<tot;d++) {
		System.out.printf("%d",week[tot%7]);//week[tot%7]���������� �迭������ ���� �������
			if(d%7==0) {
				System.out.println();
			}
		}
		//System.out.printf(y,m); //week[tot%7]���������� �迭������ ���� �������
		sc.close();		
	}	
}		

	


