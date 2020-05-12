package test0225;

import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_Set_LinkedHashSet_Ex9 {
	public static void main(String[] args) {

	//Set : 중복허용안함
	// LinkedHashSet : 순서를 유지한다.
		
		Set<String> set =new LinkedHashSet<String>();
		set.add("서울");
		set.add("부산");
		set.add("대구");
		set.add("인천");
		set.add("광주");
		set.add("대전");
		set.add("울산");
		set.add("세종");
		set.add("서울"); //중복은 무시된다.
		
		System.out.println(set);
		
		for(String s: set) {
			System.out.print(s+"  ");
		}
		System.out.println();
	}
}
