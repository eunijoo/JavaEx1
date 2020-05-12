package test0205;

public class ForExQuiz11 {
/* 이대로 출력해라.
    i:1
	i:1 , j:1
	i:1 , j:2
	--------
	i:2
	i:2 , j:1
	i:2 , j:2
	--------
	i:3
	i:3 , j:1
	i:3 , j:2
	--------
*/public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++) {  //i는 1-3까지 ; 1씩 증가
			System.out.println("i:"+i); //칸마다 i하나만 출력
			for(j=1;j<=2;j++) {   //1-2까지 ; 1씩 증가
				System.out.println("i:"+i+" , "+"j:"+j); //i와 j 둘다 출력
			}
			System.out.println("--------");
		}
	}
}


