package test0214;

import java.util.Scanner;

/*
�̸��� �Է¹޾� �Է¹��� �̸� �� �达�� �ο��� ���ϱ�
��, �Է¹��� �̸��� end�̸� ���α׷� ����
	---���---
	�̸�? ������
	�̸�? ������
	�̸�? �踻��
	�̸�? end
	�达  : 1��
 */
public class Api_String_Ex10 {
	public static void main(String[] ss) {
		Scanner sc=new Scanner(System.in);
		
		String name; //�Է¹޴� �̸�����
		int cnt;  //�ο��� ���� ����
		
		cnt=0;
		
		do {
			System.out.println("�̸� �Է�[����:end] : ");
			name=sc.next();	
			if(name.startsWith("��")) {
				cnt++;
			}
		}while(! name.equals("end"));  	//end�Է½� ����
		
		System.out.println("�ο���: "+cnt);
		
		sc.close();
	}
}
