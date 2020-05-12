package test0210;

public class Array_Copy_Ex1 {
	public static void main(String[] args) {
		int [] a= new int[] {10,20,30};
		int [] b= new int[a.length];  //new int[3]; 이랑 같은말
		int [] c= a; //c와 a는 같은 배열(같은 곳을 참조)
		
		System.out.println(a==c); //true(주소비교)
		System.out.println(a==b); //false(주소비교)
		
		//b[0]=a[0]; b[0]=a[0]; b[0]=a[0];
		//원본배열, 복사할 원본시작위치, 대상 배열, 복사시킬 위치, 복사개수
		System.arraycopy(a, 0, b, 0, a.length); 
		
		System.out.println("a배열");
		for(int n:b) {
			System.out.println(n+" ");
		}
		System.out.println();
		System.out.println("b배열");
		for(int n:b) {
			System.out.println(n+" ");
		}
		
		a[1]=200;
		System.out.println(a[1]+":"+b[1]+":"+c[1]); //200:20:200
	}

}

