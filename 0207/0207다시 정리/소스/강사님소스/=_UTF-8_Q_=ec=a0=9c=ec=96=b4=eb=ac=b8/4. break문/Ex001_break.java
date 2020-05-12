public class Ex001_break {
	public static void main(String[] args) {
/*
		반복문과 break문을 이용한 1~100 사이의 합을 구하는 프로그램
*/
		int n, s;
		n=s=0;
		
		// break : while, do~while, for, switch~case 문에서 사용
		while(true) {  // 무한루프
			n++;
			s+=n;
			if(n>=100)
				break; // 반복문 또는 switch문을 빠져나감
		}
		System.out.println("결과 : "+s);
	}
}
