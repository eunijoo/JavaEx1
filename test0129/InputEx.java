package test0129;

import java.util.Scanner; //java ������ util�ȿ� scanner�� ��������
public class InputEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //Scanner�� Ű����� �Է��� �޴� Ŭ����
										  //��ü����							
		String name;
		int age;
		char gender;
		double height;
		
		System.out.print("�̸�?");
		name=sc.next();     //next�� ���ڿ� �Է�(�Է½� �߰��� ���� �Է� �Ұ���)
		System.out.print("����?");
		age=sc.nextInt();   // nextInt�� ������ �Է�
		System.out.print("����[M/F]?");
		gender=sc.next().charAt(0); //�����Է�
		System.out.print("Ű?");
		height=sc.nextDouble();  //�Ǽ��Է�
		
	    System.out.println("�̸�: "+name);
	    System.out.println("����: "+age);
	    System.out.println("����: "+gender);
	    System.out.println("Ű: " +height);
	    
	    sc.close(); //Scanner�� �ݴ´�.
	}

}
