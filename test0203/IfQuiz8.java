package test0203;

import java.util.Scanner;

public class IfQuiz8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String hak,name; //학번,이름
		int jungnum,gimalnum,absence,report; //중간점수,기말점수,결석횟수,레포트점수
		int score1,score2,attendScore,reportScore; //중간환산점수,기말환산점수,출석점수,레포트환산점수
		int score; //환산점수총합
		char grade;//학점
		
		System.out.println("학번");
		hak=sc.next();
		System.out.println("이름?");
		name=sc.next();
		System.out.println("중간고사점수?");
		jungnum=sc.nextInt();
		System.out.println("기말고사점수?");
		gimalnum=sc.nextInt();
		System.out.println("결석횟수?");
		absence=sc.nextInt();
		System.out.println("레포트점수?");
		report=sc.nextInt();
		
		//환산점수 계산
		//중간고사,기말고사 점수계산
		score1=(int)(jungnum*0.4);  //40%비율
		score2=(int)(gimalnum*0.4);	//40%비율
		
		//결석점수환산
		if(absence>=6) {
			attendScore=0;
		}else if(absence>=4) {
			attendScore=50;
		}else if(absence>=2) {
			attendScore=80;
		}else {
			attendScore=100;
		}
		//출석점수  10%반영(결석)
		attendScore=(int)(attendScore*0.1);
		
		//레포트점수 10%반영
		reportScore=(int)(report*0.1);
		//총합
		score=score1+score2+attendScore+reportScore;
		//학점계산 (총합에 따라서)
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
		
		//출력
		System.out.println("학번\t\t이름\t중간고사\t기말고사\t출석점수\t레포트\t합산점수\t학점");
		System.out.print(hak+"\t"+name+"\t"+score1+"\t"+score2+"\t");
		System.out.println(attendScore+"\t"+reportScore+"\t"+score+"\t"+grade);
		
		sc.close();	
	}

}
