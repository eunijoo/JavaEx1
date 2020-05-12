
package test0212;

public class Method_Arr_Ex4 {
	public static void main(String[] args) {
		int []aa;
		Test4 t=new Test4();
		
		aa=t.random(10); //배열의 이름을 받음(배열주소를 받음)
		for(int a:aa) {  //받은 주소를 for문 돌림 (int[10])
			System.out.println(a+" "); //0-9까지 a값 출력
		}
		System.out.println();
	}
}

class Test4{
	public int[] random(int n) { //aa=t.random(10);의 값 10이 (int n)의 n으로 들어옴.
		if(n<1) {
			return null;
		}
		int[] a=new int[n]; //새로운 배열생성(int[10]이 됨 // a(배열이름): 주소 =>배열이름이 주소가됨.
		
		for(int i=0;i<n;i++) { 
			a[i] =(int)(Math.random()*100)+1;
		}
		return a; //리턴타입이 배열이여서 보내는것도 배열.받는것도 배열//배열의 주소를 보냄
	}
}
	
	

