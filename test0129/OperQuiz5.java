package test0129;

import java.util.Scanner;

public class OperQuiz5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int dist,speed;
	double time;
	
	System.out.println("주행거리(km) ?");
	dist=sc.nextInt();
	
	System.out.println("시속(km/h) ?");
	speed=sc.nextInt();
	
	time =(double)dist/speed *3600;//도착시간을 초로 변환
	
	int h,m;
	
	h=(int)(time/3600); //h=dist/speed; 와 같음
	time=time-(h*3600); //나머지 시간
	
	m=(int)(time/60); //분계산
	time=time-(m*60); //나머지 계산(초)
	
	System.out.printf("%d km=> %d시간 %d분 %.2f초 소요\n",dist,h,m,time);
	
	sc.close();
}
}
