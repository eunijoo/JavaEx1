package test0210;
//�迭����//�Ʒ��� ���� ��������ϸ� �ּҰ� ����Ǽ� ���� ����ÿ� �ּҿ� ������ִ� ����ü�� �����.
//�Ʒ����� ������δ� ���� �� ����.
public class Array_Copy_Ex3 {
	public static void main(String[] args) {
		int [][]a= {{10,20,30},{40,50,60}};
		int [][]b=new int[2][3];
		
		//a�� b�� ����(2�� �����)
		System.arraycopy(a, 0, b, 0, b.length); //a�� 0���� b�� 0���� b�� ����.//b.length���� ����
		
		System.out.println(a[1][1]+":"+b[1][1]);
		
		b[1][1]=500;
		System.out.println(a[1][1]+":"+b[1][1]);
		
	}

}

