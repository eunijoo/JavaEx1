package test0210;
//���߹迭 ���� ����� �� �� ���� ���� ���ϴ� ���α׷�.
public class Array_Array_EXQuiz1 {
	public static void main(String[] args) {
		int [][] arr1=new int[2][4];
		int[][] arr2=new int[3][];//�ప�� �ְ�,������ ����.
		
		arr2[0]=new int[4];//������ �ٸ�����
		arr2[1]=new int[3];//������ �ٸ�����
		arr2[2]=new int[5];//������ �ٸ�����
		
		System.out.println("arr1.length : "+arr1.length);
		System.out.println("arr1[0].length : "+arr1[0].length);
		System.out.println("arr1[1].length : "+arr1[1].length);
		System.out.println("======================");
		System.out.println("�迭���arr2.length:"+arr2.length);
		System.out.println("0�� ����arr2[0].length : "+arr2[0].length);
		System.out.println("1�� ����arr2[1].length : "+arr2[1].length);
		System.out.println("2�� ����arr2[2].length : "+arr2[2].length);
		
		
	}

}
