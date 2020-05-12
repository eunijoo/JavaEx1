package test0204;

//1~100까지 수 중 3또는 5의 배수 합과 평균을 구하는 프로그램 작성.
public class WhileQuize4 {

	public static void main(String[] args) {
		
		int n,s,cnt;
		
		n=s=cnt=0;
		
		while(n<100) {  //1-100까지 반복
			n++; //초기값 0부터 시작
			if(n%3==0 || n%5==0) {  //3또는 5 일 경우 if문으로 들어옴.
				//System.out.println(n+" ");  //3,5단위로출력됨
				s+=n; //합 구하기
				cnt++; // 3,5에 해당되는 수의 갯수		
			}
		}
		System.out.println("합:"+s);
		System.out.println("평균:"+(s/cnt)); 
	}
}


