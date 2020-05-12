package test0211;

public class Class_Arr_Ex5 {  
	public static void main(String[] args) { //클래스변수 (static)
		//객체 배열 
		Test5[] tt=new Test5[5];
		//Test5 t1,t2,t3,t4,t5;와 유사 //Test5객체를 저장할수있는 5개 선언하라는 말.
		//tt[2].print();//런타임오류
		
		//System.out.println("end...");
		//객체의 메모리 할당
		for(int i=0;i<tt.length;i++) {
			tt[i]=new Test5(); //생성자를 불러야 객체가 생성됨.
		}
		tt[0].b=200; 
		tt[0].print(); //10:200
		tt[2].print(); //10:5
	}
}

class Test5{
	int a=10;
	int b=5;
	
	public void print() {
		System.out.println(a+":"+b);
	}
}