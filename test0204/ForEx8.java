package test0204;

public class ForEx8 {
//1~100까지 수 중 3또는 5의 배수를 한줄에 5개씩 출력하고,
//마지막에 합과 평균
	public static void main(String[] args) {	
		int n; //1-100까지의 변수
		int cnt=0; //숫자 갯수 세어주는 변수
		int s=0; //합 변수
		
		for(n=1;n<=100;n++) {//1부터100까지 반복
			if(n%3==0 || n%5==0) { //3또는 5일때 if문 안에 들어감
				
			  //System.out.print(n+"\t");
				System.out.printf("%5d",n); //위 식과 비슷한 식. 숫자사이 간격넓혀줌.
				s+=n; //3,5의 배수 합 계산식
				
				cnt++; //출력갯수 세어주는 줌
				if(cnt%5==0) { //5개마다 if문에 들어감
				System.out.println();
				}				
			}			
		}
		int ave=s/cnt; //평균구하는식
		System.out.println();
		System.out.println("합:"+s);
		System.out.println("평균: "+ave);
			

 }
}