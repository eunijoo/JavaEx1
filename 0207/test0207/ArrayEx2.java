package test0207;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//���� for�� ������.
				String [] name=new String[5];
				int []score=new int[5]; //5�� 
				int tot,ave;
				
				tot=0;
				for(int i=0;i<name.length;i++) { //�迭�� 5������ �༭5���ݺ�.
					System.out.println((i+1)+"��° �̸� : ");
					name[i]=sc.next(); //�Է¹��� �̸��� ����.
					System.out.println("  ���� : ");
					score[i]=sc.nextInt(); //�Է¹��� ������ �ձ��ϱ�.
					
					tot+=score[i];
				}
				//��հ��
				ave=tot /name.length;
				//���
				System.out.println("�̸�\t����\t���\t");
				for(int i=0; i<name.length;i++) {
					System.out.println(name[i]+"\t"+score[i]+"\t"+(score[i]-ave));
				}
				sc.close();
	}

}
