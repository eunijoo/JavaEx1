package test0204;

//1-2+3-4+...+9-10의 연산결과를 출력하는 프로그램 작성.
public class WhileQuize2 {

	public static void main(String[] args) {
		
		int n,s;
		n=s=0; //1부터 계산해줘야하니간 0으로 초기값을 줌
		while(n<9) {
			n++;
			s+=n; //홀수 일때 +
			n++;
			s-=n; //짝수 일때 -
		}			
		System.out.println("결과 :"+s);
	}
}


