package test0203;

import java.util.Scanner;

public class IfQuiz8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String hak,name; //�й�,�̸�
		int jungnum,gimalnum,absence,report; //�߰�����,�⸻����,�ἮȽ��,����Ʈ����
		int score1,score2,attendScore,reportScore; //�߰�ȯ������,�⸻ȯ������,�⼮����,����Ʈȯ������
		int score; //ȯ����������
		char grade;//����
		
		System.out.println("�й�");
		hak=sc.next();
		System.out.println("�̸�?");
		name=sc.next();
		System.out.println("�߰��������?");
		jungnum=sc.nextInt();
		System.out.println("�⸻�������?");
		gimalnum=sc.nextInt();
		System.out.println("�ἮȽ��?");
		absence=sc.nextInt();
		System.out.println("����Ʈ����?");
		report=sc.nextInt();
		
		//ȯ������ ���
		//�߰����,�⸻��� �������
		score1=(int)(jungnum*0.4);  //40%����
		score2=(int)(gimalnum*0.4);	//40%����
		
		//�Ἦ����ȯ��
		if(absence>=6) {
			attendScore=0;
		}else if(absence>=4) {
			attendScore=50;
		}else if(absence>=2) {
			attendScore=80;
		}else {
			attendScore=100;
		}
		//�⼮����  10%�ݿ�(�Ἦ)
		attendScore=(int)(attendScore*0.1);
		
		//����Ʈ���� 10%�ݿ�
		reportScore=(int)(report*0.1);
		//����
		score=score1+score2+attendScore+reportScore;
		//������� (���տ� ����)
		if(score>=90) {
			grade = 'A';
		}
		else if(score>=80) {
			grade = 'B';
		}
		else if(score>=70) {
			grade = 'c';
		}
		else if(score>=60) {
			grade = 'd';
		}
		else grade ='F';
		
		//���
		System.out.println("�й�\t\t�̸�\t�߰����\t�⸻���\t�⼮����\t����Ʈ\t�ջ�����\t����");
		System.out.print(hak+"\t"+name+"\t"+score1+"\t"+score2+"\t");
		System.out.println(attendScore+"\t"+reportScore+"\t"+score+"\t"+grade);
		
		sc.close();	
	}

}
