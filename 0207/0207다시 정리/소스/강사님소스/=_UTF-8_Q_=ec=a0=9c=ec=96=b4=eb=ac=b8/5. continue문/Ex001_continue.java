public class Ex001_continue {
	public static void main(String[] args) {
/*
		반복문과 continue를 이용한 1~100 사이의 홀수합을 구하는 프로그램
*/
		int n, s;
		n=s=0;
		
		// continue : while, do~while, for 문에서 사용
		while(n<100) {
			n++;
			if(n%2==0)
				continue;
			s+=n;
		}
		System.out.println("결과 : "+s);
	}
}
