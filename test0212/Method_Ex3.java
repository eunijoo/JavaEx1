package test0212;

public class Method_Ex3 {
	public static void main(String[] args) {
		int []arr= {1,3,5,7,9};
		
		Test3 t=new Test3();
		t.sub(arr); // �Ű������� �迭�̸� ���μ��� �迭�̾���Ѵ�.
					// �Ķ���Ͱ� �迭�̸� �ּҰ� �Ѿ��.
					// �迭�� call by reference���
					// call by reference : ���ĸŰ������� �ǸŰ� ������ ������ ����
		
		System.out.println(arr[2]); //100
		
		//�ڹٴ� �⺻���� �Ķ���� ���޹���� call by value
		//���ĸŰ������� �ǸŰ������� �������� �������� �ʴ´�.
		int n;  //n : main��
		n=0;
		t.sub2(n); 
		System.out.println(n); //0 
		
		int [] aa= {1,3,5,7,9};
		t.sub3(aa);  //�Ʒ� Ŭ�������� aa�� �ּҸ� �Ҿ���� ���ƿ��� ����
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
	
	public void sub2(int n) { //n:sub2��
		n=100;  //sub2�� ����n���� main�� ���� n������ �������� �ʴ´�.
				//main n�� 0�� ������� ��. �ٽ� �������� ������.
	}
	public void sub3(int[] a) { //aa�ּҸ� �޾Ҵµ� aa�� �ּҸ� �Ҿ����.
		a=new int[5];  //a������ �ٽ� ������.
		a[2]=5000;
	}
	
	
	
}
