package test0131;

import java.util.Scanner;

public class IfEx6 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ���������� ū�� ������ ���
		Scanner sc=new Scanner(System.in);  //Scanner �Ǽ�,������ �޴°ǵǴµ� ���ڹ޴°� �ȵ�.
		char ch;
		//if~else if �� �ڵ��ϴ� ���� �� ȿ����
		//ù��° ������ �����ص� ������ ������ �� �����غ�(�ð������ɸ�)
		System.out.println("�� ����?");
		ch=sc.next().charAt(0); //charAt(0)�� ���ڿ� �� ���� 1���� ù��°���ڸ� �Է¹���
		
		if(ch>= 'A'&& ch <='Z') {
			System.out.println("�Է¹��ڴ� �빮��");
		}
		if(ch>='a'&& ch<='z') {
			System.out.println("�Է¹��ڴ� �ҹ���");
		}
		if(!(ch>='a'&& ch<='z')&& !(ch>= 'A'&& ch <='Z')) { //not�ҹ��� && not�빮��
			System.out.println("�Է¹��ڴ� ��Ÿ����");
		}
		sc.close();	
	}

}
