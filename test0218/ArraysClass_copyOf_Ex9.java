package test0218;

import java.util.Arrays;
//배열복사
public class ArraysClass_copyOf_Ex9 {
		public static void main(String[] args) {
			int []aa= {10,20,30,40,50};
			
	//Arrays.copyOf(배열복사-1)
								//대상,  새로운길이
			int []bb=Arrays.copyOf(aa, aa.length);
			System.out.println(aa==bb);	 //false (값은 같으나 주소는 다름. "==" : 주소비교)
			System.out.println(Arrays.toString(bb)); 	//a의 배열 [10, 20, 30, 40, 50] b로 복사
		
			int []bb1=Arrays.copyOf(aa, aa.length-1);
			System.out.println(aa==bb1);	 
			System.out.println(Arrays.toString(bb1)); 	//a의 배열 [10, 20, 30, 40, 50] b로 복사
			
			int []bb2=Arrays.copyOf(aa, aa.length+2);
			System.out.println(aa==bb2);	 
			System.out.println(Arrays.toString(bb2)); 	//a의 배열 [10, 20, 30, 40, 50] b로 복사
		
			int []bb3=Arrays.copyOf(aa, 4);
			System.out.println(aa==bb3);	
			System.out.println(Arrays.toString(bb3)); 	//a의 배열 [10, 20, 30, 40, 50] b로 복사 //4개복사
		
			int []bb4=Arrays.copyOf(aa, 7);
			System.out.println(aa==bb4);	 
			System.out.println(Arrays.toString(bb4)); 	//a의 배열[10, 20, 30, 40, 50, 0, 0] b로 복사
														//5개복사하고 나머지 0처리
	//Arrays.copyOfRange	
									// 대상 ,from,to-1까지
			int [] cc=Arrays.copyOfRange(aa, 1, 4);
			System.out.println(Arrays.toString(cc)); // [20, 30, 40] (to)4 -1=3까지 
			
	//arraycopy		
			int [] dd= new int[aa.length];
			System.arraycopy(aa,0,dd,0,aa.length); //arraycopy도 배열복사됨
			System.out.println(Arrays.toString(cc)); // [20, 30, 40] 
}
}
