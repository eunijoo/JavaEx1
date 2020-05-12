package test0218;

import java.util.Arrays;

public class ArraysClass_equals_Ex10 {
		public static void main(String[] args) {
			int [] a= {1,2,3};
			int [] b= {1,2,3};
			int [] c= {1,2,3,4,5,6};
			
		//주소비교
			System.out.println(a==b);	 	//false
			System.out.println(a==c);		//false
			System.out.println(a.equals(b));	//false

		//값비교
			System.out.println(Arrays.equals(a, b)); 	//true
			System.out.println(Arrays.equals(a, c));	//false
			
		//2차원배열 주소비교(얕은 비교)
			int [][] aa= {{1,2,3},{4,5,6}};
			int [][] bb= {{1,2,3},{4,5,6}};
			System.out.println(Arrays.equals(aa, bb));	//false			
														//2차원 배열에서는 1차원이 가진 주소를 비교하므로 false
		
		//2차원배열 값비교(깊은비교)
			System.out.println(Arrays.deepEquals(aa, bb)); //true
														   //2차원배열에서는 1차원이 가진 주소의 값 비교
		}
}
