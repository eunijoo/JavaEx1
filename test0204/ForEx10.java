package test0204;

public class ForEx10 {

	public static void main(String[] args) {	
		int count=0;
		int s=2000000000;//20억
/*
 float a=2000000000,b=2000000050;  //float형에서 2000000050은 2000000000과 같은 숫자로 인식(50이 짤림)
 System.out.println(a==b);  //true
 */
		for(float f=s; f<s+50;f++) { //float형은 반복구문에서 쓰지 않는다.정밀도가 낮아서 값이 변할수 있다.
			count++;				//실수는 증감형식에 쓰지 않는다. 정확한값안나옴.
		}
		System.out.println(count); //0
 }
}