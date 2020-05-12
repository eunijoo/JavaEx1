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
	public void print(int n) {  //print : �޼ҵ��̸�
		if(n>1) {
			print(n-1);  	//print�θ�.(�ڱⰡ �ڱ��ڽ��� �θ�) : ���ȣ��. ������ Ȱ��(LIFO����)
							//����:(���ϸ�������)5 4 3 2 
							//�߸��ۼ��ϸ� StackOverflowError �� �߻�.
		}
		System.out.println(n); //1 ->(���ÿ��� ������)2->3->4->5(���� ���� ����� ���� ���� �ʰ� ��µ�)
	}

	public int sum(int n) {
		return n>1 ? n+sum(n-1) : n; //5+4+3+2+1
			// 5=> 5+sum(4)
			// 4=> 	   4+sum(3)
			// 3=> 			3+sum(2)
			// 2=> 				2+sum(1)
			// 1=> 					1
	}
	
	//��, y�� 0�̻�
	//x�� y�� ���
	public int pow(int x,int y) {
		return y>=1 ? x*pow(x,y-1)  : 1;	
			// 4 => 2*pow(2,3) 8
			// 3 => 2*pow(2,2)  4
			// 2 => 2*pow(2,1)   2
			// 1 => 1*pow(2,0)     1
			// 0 =>					 1			
		
	}
}

