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
			System.out.println("인원수?");
			cnt =sc.nextInt();
		}while(cnt<1||cnt>50);
		
		//인원수만큼 배열 메모리 할당
		name=new String[cnt];
		score=new int[cnt];
		rank=new int[cnt];
		
		//인원수 만큼 이름과 점수 입력받기
		for(int i=0;i<cnt;i++) {
			System.out.println((i+1)+"번째 이름? ");
			name[i]=sc.next();
			System.out.println("점수?");
			score[i]=sc.nextInt();
		}
		
		//석차 초기화
		for(int i=0;i<cnt;i++) {
			rank[i]=1;
		}
/*
 		
 */
		//석차 계산
		for(int i=0;i<score.length-1;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i]>score[j]) {
					rank[j]++;
				}else if(score[i]<score[j]) {
					rank[i]++;
				}
			}			
		}
		//출력
		System.out.println("\n이름\t점수\t석차");
		for(int i=0;i<cnt;i++) {
			System.out.println(name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		sc.close();
	}
}

