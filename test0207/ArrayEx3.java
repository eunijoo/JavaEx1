package test0207;

public class ArrayEx3 {

	public static void main(String[] args) {
		int []a= new int[3]; //new �ѹ������� ��1���� ����
		int []b=a;  //�迭�� ��������.
					//a�� b ���������� �ϳ��� �迭�� ����.(���� 1���� �̸��� 2��)
		 			//a�濡 �ִ� ���� ��������, b���� �����.
		a[0]=10;a[1]=20;a[2]=30;
		b[1]=200;
		
		System.out.println("a�迭 ����..");
		for(int n : a) {
			System.out.println(n+"  "); //10 200 30
		}
		System.out.println();
		
		System.out.println("b�迭 ����..");
		for(int n : b) {
			System.out.println(n+"  "); //10 200 30
		}
		System.out.println();
	}

}
