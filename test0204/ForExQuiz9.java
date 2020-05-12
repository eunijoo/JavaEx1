package test0204;

public class ForExQuiz9 {
//1~10까지의 정수의 합을 출력하는 프로그램 //무한루프&break 이용해서
	public static void main(String[] args) {
		
		int n,s; //n:정수변수, s:합계변수
		n=s=0; //1부터니깐 0으로 초기화
		for(;;) { //무한루프
			n++; //1씩 증가
			s+=n; //n의 합을 s에 저장
			if(n>=10) { //n이 10과 같거나 크면 break로 무한루프 빠져나옴
				break;
			}
		}
		System.out.println("1~10 합: "+s);
	}
}


