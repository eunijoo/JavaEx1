package test0218;

import java.util.Arrays;

public class ArraysClass_equals_Ex10 {
		public static void main(String[] args) {
			int [] a= {1,2,3};
			int [] b= {1,2,3};
			int [] c= {1,2,3,4,5,6};
			
		//�ּҺ�
			System.out.println(a==b);	 	//false
			System.out.println(a==c);		//false
			System.out.println(a.equals(b));	//false

		//����
			System.out.println(Arrays.equals(a, b)); 	//true
			System.out.println(Arrays.equals(a, c));	//false
			
		//2�����迭 �ּҺ�(���� ��)
			int [][] aa= {{1,2,3},{4,5,6}};
			int [][] bb= {{1,2,3},{4,5,6}};
			System.out.println(Arrays.equals(aa, bb));	//false			
														//2���� �迭������ 1������ ���� �ּҸ� ���ϹǷ� false
		
		//2�����迭 ����(������)
			System.out.println(Arrays.deepEquals(aa, bb)); //true
														   //2�����迭������ 1������ ���� �ּ��� �� ��
		}
}
