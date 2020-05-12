package test0213;

public class Varargs_EX5 {
	public static void main(String[] args) {
		int s;
		
		Test5 ob=new Test5();
		
		
		s=ob.sum(1,2,3,4,5);
		System.out.println(s);
		
		s=ob.sum(2,4,6,8,10,12,14,16,18,20);
		System.out.println(s);
	}
}

class Test5{
	public int sum(int ...n) {  //���������� (��ȣ �ӿ��ִ� ���ڰ� ����)  (...):������ȣ
		int s=0;
		for(int i:n) {
			s+=i;
		}
		
/*	���������ڴ� ���������� �迭�̱⶧���� �迭�� ó���Ҽ��ִ�. => �迭�ǰ����� �ٸ��� ����ϱ� ����.
		for(int i=0;i<n.length;i++) {
			s+=n[i];
		}
*/	
		return s;
	}
}

	
	

