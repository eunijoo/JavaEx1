package test0210;

public class Array_Array_Ex2 {
	public static void main(String[] args) {
		
		int[][] a=new int[3][];//�ప�� �ְ�,������ ����.
		a[0]=new int[4];//������ �ٸ�����
		a[1]=new int[3];//������ �ٸ�����
		a[2]=new int[5];//������ �ٸ�����
		
		System.out.println("�迭���:"+a.length);
		System.out.println("0�� ����"+a[0].length);
		System.out.println("1�� ����"+a[1].length);
		System.out.println("2�� ����"+a[2].length);
	}

}
