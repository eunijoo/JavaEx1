package test0204;

public class ForEx5 {

	public static void main(String[] args) {	
/*
		int n;
		for(n=10;n<=1;n++) {
			System.out.println("안: "+n); //조건을 만족하지 않으면 한번도 실행안됨.
		}
		System.out.println("밖: "+n); //처음에 준 값 10 그대로 나옴.
*/
		int n;
		for(n=10;n>=1;n--) { //처음값 10 ; n이 1보다 크니 -> 구문안으로들어감 -> n-- -> 9가 되서 n이 1보다크니..
			System.out.println("안: "+n); //10 9..2 1
		}
		System.out.println("밖: "+n); //0
}
}
