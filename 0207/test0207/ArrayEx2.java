package test0207;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//향상된 for문 못쓴다.
				String [] name=new String[5];
				int []score=new int[5]; //5개 
				int tot,ave;
				
				tot=0;
				for(int i=0;i<name.length;i++) { //배열을 5번까지 줘서5번반복.
					System.out.println((i+1)+"번째 이름 : ");
					name[i]=sc.next(); //입력받은 이름을 저장.
					System.out.println("  점수 : ");
					score[i]=sc.nextInt(); //입력받은 점수의 합구하기.
					
					tot+=score[i];
				}
				//평균계산
				ave=tot /name.length;
				//출력
				System.out.println("이름\t점수\t평균\t");
				for(int i=0; i<name.length;i++) {
					System.out.println(name[i]+"\t"+score[i]+"\t"+(score[i]-ave));
				}
				sc.close();
	}

}
