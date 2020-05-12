package test0213;

public class Recursive_EX3 {
	public static void main(String[] args) {
		Test3 t=new Test3();
		t.print(5);
		
		int s=t.sum(5);
		System.out.println(s);
		
		System.out.println(t.pow(2,4));
	 
	}
}

class Test3{
	public void print(int n) {  //print : 메소드이름
		if(n>1) {
			print(n-1);  	//print부름.(자기가 자기자신을 부름) : 재귀호출. 스택을 활용(LIFO구조)
							//스택:(제일먼저저장)5 4 3 2 
							//잘못작성하면 StackOverflowError 가 발생.
		}
		System.out.println(n); //1 ->(스택에서 가져옴)2->3->4->5(가장 먼저 저장된 값이 가장 늦게 출력됨)
	}

	public int sum(int n) {
		return n>1 ? n+sum(n-1) : n; //5+4+3+2+1
			// 5=> 5+sum(4)
			// 4=> 	   4+sum(3)
			// 3=> 			3+sum(2)
			// 2=> 				2+sum(1)
			// 1=> 					1
	}
	
	//단, y는 0이상
	//x의 y승 계산
	public int pow(int x,int y) {
		return y>=1 ? x*pow(x,y-1)  : 1;	
			// 4 => 2*pow(2,3) 8
			// 3 => 2*pow(2,2)  4
			// 2 => 2*pow(2,1)   2
			// 1 => 1*pow(2,0)     1
			// 0 =>					 1			
		
	}
}

