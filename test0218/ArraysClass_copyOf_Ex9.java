package test0218;

import java.util.Arrays;
//�迭����
public class ArraysClass_copyOf_Ex9 {
		public static void main(String[] args) {
			int []aa= {10,20,30,40,50};
			
	//Arrays.copyOf(�迭����-1)
								//���,  ���ο����
			int []bb=Arrays.copyOf(aa, aa.length);
			System.out.println(aa==bb);	 //false (���� ������ �ּҴ� �ٸ�. "==" : �ּҺ�)
			System.out.println(Arrays.toString(bb)); 	//a�� �迭 [10, 20, 30, 40, 50] b�� ����
		
			int []bb1=Arrays.copyOf(aa, aa.length-1);
			System.out.println(aa==bb1);	 
			System.out.println(Arrays.toString(bb1)); 	//a�� �迭 [10, 20, 30, 40, 50] b�� ����
			
			int []bb2=Arrays.copyOf(aa, aa.length+2);
			System.out.println(aa==bb2);	 
			System.out.println(Arrays.toString(bb2)); 	//a�� �迭 [10, 20, 30, 40, 50] b�� ����
		
			int []bb3=Arrays.copyOf(aa, 4);
			System.out.println(aa==bb3);	
			System.out.println(Arrays.toString(bb3)); 	//a�� �迭 [10, 20, 30, 40, 50] b�� ���� //4������
		
			int []bb4=Arrays.copyOf(aa, 7);
			System.out.println(aa==bb4);	 
			System.out.println(Arrays.toString(bb4)); 	//a�� �迭[10, 20, 30, 40, 50, 0, 0] b�� ����
														//5�������ϰ� ������ 0ó��
	//Arrays.copyOfRange	
									// ��� ,from,to-1����
			int [] cc=Arrays.copyOfRange(aa, 1, 4);
			System.out.println(Arrays.toString(cc)); // [20, 30, 40] (to)4 -1=3���� 
			
	//arraycopy		
			int [] dd= new int[aa.length];
			System.arraycopy(aa,0,dd,0,aa.length); //arraycopy�� �迭�����
			System.out.println(Arrays.toString(cc)); // [20, 30, 40] 
}
}
