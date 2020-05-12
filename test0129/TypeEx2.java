package test0129;

public class TypeEx2 {

	public static void main(String[] args) {
		float a=2000000000;
		float b=2000000050; //정밀도가 낮아서 20억으로 저장이 됨(50이 잘림)-오차가 엄청 큼
		
		double c=2000000000; //float 보다는 오차가 적음
		double d=2000000050;
		
		System.out.println(a+","+b);
		System.out.println(c+","+d);
		
		System.out.printf("%.2f %.2f\n",a,b); //두 값 모두 20억이 출력
		System.out.printf("%.2f %.2f\n",c,d); //c,d,값이 각각 출력
		
		System.out.println(a==b); //true
		System.out.println(c==d); //false
		
		c=0.015;
		d=0.0000072;
		System.out.println(c+","+d);

		
		
	}

}
