package test0203;

import java.util.Scanner;

public class IfQuiz8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String hak, name;
		int s1, s2, absence, report;
		int score1, score2, attendScore, reportScore;
		int score;
		char grade;
		
		System.out.print("�й�?");
		hak=sc.next();
		System.out.print("�̸�?");
		name=sc.next();
		System.out.print("�߰��������?");
		s1=sc.nextInt();
		System.out.print("�⸻�������?");
		s2=sc.nextInt();
		System.out.print("�ἮȽ��?");
		absence=sc.nextInt();
		System.out.print("����Ʈ����?");
		report=sc.nextInt();
		
		// ȯ������ ���
		// �߰�/�⸻���
		score1=(int)(s1*0.4);
		score2=(int)(s2*0.4);
		// �Ἦ����
		if(absence>=6)
			attendScore=0;
		else if(absence>=4)
			attendScore=60;
		else if(absence>=2)
			attendScore=80;
		else
			attendScore=100;
		attendScore=(int)(attendScore*0.1);
		// ����Ʈ����
		reportScore=(int)(report*0.1);
		// ����
		score=score1+score2+attendScore+reportScore;
		// ���� ���
		if(score>=90) grade='A';
		else if(score>=80) grade='B';
		else if(score>=70) grade='C';
		else if(score>=60) grade='D';
		else grade='F';
		
		// ���
		System.out.print("�й�\t�̸�\t�߰�\t�⸻\t�⼮\t");
		System.out.println("����Ʈ\t�ջ�����\t����");
		
		System.out.print(hak+"\t"+name+"\t"+score1+"\t");
		System.out.print(score2+"\t"+attendScore+"\t");
		System.out.println(reportScore+"\t"+score+"\t"+grade);

		sc.close();
	}
}
