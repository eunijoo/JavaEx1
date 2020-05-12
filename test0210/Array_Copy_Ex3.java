package test0210;
//배열복사//아래와 같은 방식으로하면 주소가 복사되서 값을 변경시에 주소에 저장돼있는 값자체가 변경됨.
//아래같은 방식으로는 복사 잘 안함.
public class Array_Copy_Ex3 {
	public static void main(String[] args) {
		int [][]a= {{10,20,30},{40,50,60}};
		int [][]b=new int[2][3];
		
		//a를 b로 복사(2개 복사됨)
		System.arraycopy(a, 0, b, 0, b.length); //a를 0부터 b를 0부터 b의 길이.//b.length행의 갯수
		
		System.out.println(a[1][1]+":"+b[1][1]);
		
		b[1][1]=500;
		System.out.println(a[1][1]+":"+b[1][1]);
		
	}

}

