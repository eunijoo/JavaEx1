package test0218;

import java.util.Arrays;
import java.util.Collections;

public class ArraysClass_sort_Ex8 {
		public static void main(String[] args) {
			
			String[] ss= {"자바","CSS","HTML","스프링","AI"};
			Arrays.sort(ss);
			System.out.println("-오름차순-");
			for(String s:ss) {
				
				System.out.println(s+" ");
			}
			System.out.println();
			
			Arrays.sort(ss,Collections.reverseOrder());
			System.out.println("-내림차순-");
			for(String s:ss) {
				
				System.out.println(s+" ");
			}
			System.out.println();
	
			
			int []nn= {10,5,80,70};
			//String s=nn.toString();		// toString : [I@15db9742 형식으로 출력
			String s=Arrays.toString(nn);	//toString : [10, 5, 80, 70] 배열로 출력

			System.out.println("toString :"+s); 

	}
}
