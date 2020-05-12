package test0210;

import java.util.Scanner;

//5명의 이름과 국어,영어,수학 점수를 입력받아 총점,평균 및 석차를 처리하는 성적처리 프로그램 작성.
public class Array_Array_EXQuiz9_Score {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String [] name =new String[5];
		int [][]score = new int[5][3];
		int [] tot = new int[5];
		int [] rank = new int[5];
		
		String []title= {"국어?","영어?","수학?"};		
		
		for(int i=0;i<5;i++) {
			
			//이름입력
			System.out.println((i+1)+"이름? ");
			name[i]=sc.next();

			//국,영,수 입력 및 개인 총점 계산
			for(int j=0;j<3;j++) {
				System.out.println(title[j]);
				
				score[i][j]=sc.nextInt();
				tot[i]+=score[i][j];
			}
		}
		//석차 초기화
		for(int i=0;i<5;i++) {//석차는 1부터 시작하니깐 1로 초기화시킴.
			rank[i]=1;
		}
		//석차 계산
		for(int i=0;i<tot.length;i++) {
			for(int j=i+1;j<tot.length;j++) {
				if(tot[i]<tot[j]) {  //기준값 점수가 비교값점수랑 비교했을때 기준값이 작으면 등수1등추가
				rank[i]++;
				}else if(tot[i]>tot[j]) {//기준값 점수가 비교값점수랑 비교했을때 비교값이 작으면 등수1등추가
				rank[j]++;
				}
			}
		}
		
		//출력
		for(int i=0;i<5;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.print(score[i][j]+"\t");
			}		
			System.out.print(tot[i]+"\t"); //총점
			System.out.print((tot[i]/3)+"\t"); //평균 : 총점/3
			System.out.println(rank[i]); //석차
		}
		sc.close();
	}
}


		
		
