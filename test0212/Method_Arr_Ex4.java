
package test0212;

public class Method_Arr_Ex4 {
	public static void main(String[] args) {
		int []aa;
		Test4 t=new Test4();
		
		aa=t.random(10); //�迭�� �̸��� ����(�迭�ּҸ� ����)
		for(int a:aa) {  //���� �ּҸ� for�� ���� (int[10])
			System.out.println(a+" "); //0-9���� a�� ���
		}
		System.out.println();
	}
}

class Test4{
	public int[] random(int n) { //aa=t.random(10);�� �� 10�� (int n)�� n���� ����.
		if(n<1) {
			return null;
		}
		int[] a=new int[n]; //���ο� �迭����(int[10]�� �� // a(�迭�̸�): �ּ� =>�迭�̸��� �ּҰ���.
		
		for(int i=0;i<n;i++) { 
			a[i] =(int)(Math.random()*100)+1;
		}
		return a; //����Ÿ���� �迭�̿��� �����°͵� �迭.�޴°͵� �迭//�迭�� �ּҸ� ����
	}
}
	
	

