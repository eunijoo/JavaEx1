package test0207;

import java.util.Scanner;

public class Arr_Quiz2 {
//5���� ����(0~10)�� �Է¹޾� �ִ������� �ּ������� �� ���� ���ϴ� ���α׷�
//0~10������ ������ �ƴѰ�� �ٽ� �Է�
//�Է¹޴� ������ �迭�� ����.
//�������=��ü������ �� - �ִ����� - �ּ�����
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int []score=new int[5];
		int max,min,tot;
		
		tot =0;
		for(int i=0;i<5;i++) {
			do {
			System.out.print((i+1)+"��° ���� : ");
			score[i]=sc.nextInt();//÷�ڴ� 0-4���� �ۿ� ����. 
			//tot+=score[i];  //0~10�� ����� ������ ����ϸ� �ȵǴµ� ���⿡ �θ� �հ��ϰ� ��
			}while(score[i]<0||score[i]>10);
			tot+=score[i];
		}
		//�ִ�,�ּұ��ϴ±���
		max=min=score[0];  //�ִ�,�ּ� �ʱⰪ�� 0���� ����.
		for(int i=1;i<5;i++) {
			if(max<score[i]) { //�ִ밪
				max=score[i];
			}
			else if(min>score[i]) {  //�ּҰ�
				min=score[i];
			}
		}
		System.out.println("������� : "+(tot-max-min));	
		sc.close();
	}
}
