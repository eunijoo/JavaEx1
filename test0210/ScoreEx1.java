package test0210;

import java.util.Scanner;

public class ScoreEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt;
		String[] name;
		int[] score;
		int[] rank;
		
		do {
			System.out.println("�ο���?");
			cnt =sc.nextInt();
		}while(cnt<1||cnt>50);
		
		//�ο�����ŭ �迭 �޸� �Ҵ�
		name=new String[cnt];
		score=new int[cnt];
		rank=new int[cnt];
		
		//�ο��� ��ŭ �̸��� ���� �Է¹ޱ�
		for(int i=0;i<cnt;i++) {
			System.out.println((i+1)+"��° �̸�? ");
			name[i]=sc.next();
			System.out.println("����?");
			score[i]=sc.nextInt();
		}
		
		//���� �ʱ�ȭ
		for(int i=0;i<cnt;i++) {
			rank[i]=1;
		}
/*
 		
 */
		//���� ���
		for(int i=0;i<score.length-1;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i]>score[j]) {
					rank[j]++;
				}else if(score[i]<score[j]) {
					rank[i]++;
				}
			}			
		}
		//���
		System.out.println("\n�̸�\t����\t����");
		for(int i=0;i<cnt;i++) {
			System.out.println(name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		sc.close();
	}
}

