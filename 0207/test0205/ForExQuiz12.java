package test0205;

public class ForExQuiz12 {
/* 이대로 출력해라.
    i:1
	i:1 , j:1
	--------
	i:2
	i:2 , j:1
	i:2 , j:2
	--------
	i:3
	i:3 , j:1
	i:3 , j:2
	i:3 , j:3
	--------
*/public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++) {  //i는 1-3까지 ; 1씩 증가
			System.out.println("i:"+i); //칸마다 i하나만 출력
			for(j=1;j<=i;j++) {   //1-i값 까지 ; 1씩 증가 //i의 값대로 j출력갯수가 변함
				System.out.println("i:"+i+" , "+"j:"+j); //i와 j 둘다 출력
			}
			System.out.println("--------");
		}
	}
}


