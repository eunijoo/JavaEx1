package test0204;

//1+2+4+7+11+...의 20번째 항까지의 합을 구해라.(갯수로 구해야함)
public class WhileQuize8 {

	public static void main(String[] args) {
		int n,s,t;  //n은 20번째까지 숫자변수. s는 합 변수
					//t는 숫자간의 차이값을 나타내는 변수
		
		n=0; s=0; //1부터 시작이여서 0으로 초기화
		t=1;   //숫자간격 최소값이 1이여서 1로 초기화
		while(n<5) {  //20까지 돌아라
			System.out.print("t:"+t+", ");
			s+=t;   // t값을 더해 s변수에 저장
			System.out.println("s:"+s);
			n++;
			t+=n; //t를 증가시켜줌
		}
		System.out.println("결과:"+s);
	}
}


