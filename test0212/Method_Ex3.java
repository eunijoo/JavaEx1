package test0212;

public class Method_Ex3 {
	public static void main(String[] args) {
		int []arr= {1,3,5,7,9};
		
		Test3 t=new Test3();
		t.sub(arr); // 매개변수가 배열이면 실인수도 배열이어야한다.
					// 파라미터가 배열이면 주소가 넘어간다.
					// 배열은 call by reference방식
					// call by reference : 형식매개변수와 실매개 변수가 기억공간 공유
		
		System.out.println(arr[2]); //100
		
		//자바는 기본적인 파라미터 전달방식은 call by value
		//형식매개변수와 실매개변수는 기억공간을 공유하지 않는다.
		int n;  //n : main꺼
		n=0;
		t.sub2(n); 
		System.out.println(n); //0 
		
		int [] aa= {1,3,5,7,9};
		t.sub3(aa);  //아래 클래스에서 aa값 주소를 잃어버려 돌아오지 않음
		System.out.println(aa[2]); //5
	}
}

class Test3{
	public void sub(int[] a) {
		if(a==null || a.length==0) {
			return;
		}
		a[2]=100;
	}
	
	public void sub2(int n) { //n:sub2꺼
		n=100;  //sub2의 변수n값은 main의 변수 n값으로 돌려주지 않는다.
				//main n이 0을 보내기는 함. 다시 돌려주지 않을뿐.
	}
	public void sub3(int[] a) { //aa주소를 받았는데 aa의 주소를 잃어버림.
		a=new int[5];  //a값으로 다시 생성됨.
		a[2]=5000;
	}
	
	
	
}
