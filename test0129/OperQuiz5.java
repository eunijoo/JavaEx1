package test0129;

import java.util.Scanner;

public class OperQuiz5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int dist,speed;
	double time;
	
	System.out.println("����Ÿ�(km) ?");
	dist=sc.nextInt();
	
	System.out.println("�ü�(km/h) ?");
	speed=sc.nextInt();
	
	time =(double)dist/speed *3600;//�����ð��� �ʷ� ��ȯ
	
	int h,m;
	
	h=(int)(time/3600); //h=dist/speed; �� ����
	time=time-(h*3600); //������ �ð�
	
	m=(int)(time/60); //�а��
	time=time-(m*60); //������ ���(��)
	
	System.out.printf("%d km=> %d�ð� %d�� %.2f�� �ҿ�\n",dist,h,m,time);
	
	sc.close();
}
}
