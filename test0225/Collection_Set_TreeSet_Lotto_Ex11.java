package test0225;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
//LottoÃâ·Â
public class Collection_Set_TreeSet_Lotto_Ex11 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		Random rd = new Random();
		
		int num;
		
		while(set.size()<6) {
			num =rd.nextInt(45)+1;
			set.add(num);
		}
		System.out.println(set);
	}
}
