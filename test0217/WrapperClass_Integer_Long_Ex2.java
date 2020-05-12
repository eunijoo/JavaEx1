package test0217;

public class WrapperClass_Integer_Long_Ex2 {

	public static void main(String[] args) {
	
		//Long ob1=10; //컴오류 	//클래스단위는 형변환이 안된다.
		//Long ob1=10L; // 가능
		Long ob1=new Long(10); 
		Integer ob2=10;

	//	Long ob3;
		//ob3=ob2; //컴오류.
				   //상하관계가 아닌 경우 객체간에는 형변환 불가.
		//ob3= (Long)ob2; //컴오류
		
		long a;
		a= ob2;  //ob2는 객체 // a=ob2.intValue(); //기본정수값은 a방에 넣을 수 있다.
		
	//	ob3 = new Long(ob2); //가능
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(a);
		
	}

}
