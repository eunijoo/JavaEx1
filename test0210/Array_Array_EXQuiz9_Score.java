package test0210;

import java.util.Scanner;

//5���� �̸��� ����,����,���� ������ �Է¹޾� ����,��� �� ������ ó���ϴ� ����ó�� ���α׷� �ۼ�.
public class Array_Array_EXQuiz9_Score {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String [] name =new String[5];
		int [][]score = new int[5][3];
		int [] tot = new int[5];
		int [] rank = new int[5];
		
		String []title= {"����?","����?","����?"};		
		
		for(int i=0;i<5;i++) {
			
			//�̸��Է�
			System.out.println((i+1)+"�̸�? ");
			name[i]=sc.next();

			//��,��,�� �Է� �� ���� ���� ���
			for(int j=0;j<3;j++) {
				System.out.println(title[j]);
				
				score[i][j]=sc.nextInt();
				tot[i]+=score[i][j];
			}
		}
		//���� �ʱ�ȭ
		for(int i=0;i<5;i++) {//������ 1���� �����ϴϱ� 1�� �ʱ�ȭ��Ŵ.
			rank[i]=1;
		}
		//���� ���
		for(int i=0;i<tot.length;i++) {
			for(int j=i+1;j<tot.length;j++) {
				if(tot[i]<tot[j]) {  //���ذ� ������ �񱳰������� �������� ���ذ��� ������ ���1���߰�
				rank[i]++;
				}else if(tot[i]>tot[j]) {//���ذ� ������ �񱳰������� �������� �񱳰��� ������ ���1���߰�
				rank[j]++;
				}
			}
		}
		
		//���
		for(int i=0;i<5;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.print(score[i][j]+"\t");
			}		
			System.out.print(tot[i]+"\t"); //����
			System.out.print((tot[i]/3)+"\t"); //��� : ����/3
			System.out.println(rank[i]); //����
		}
		sc.close();
	}
}


		
		
