package test0225;

import java.util.Set;
import java.util.TreeSet;

public class Collection_Set_TreeSet_Ex10 {
	public static void main(String[] args) {

		//Set : 중복허용안함
		// TreeSet : 정렬한다. Comparable 구현 클래스만 가능.
		Set<String> set =new TreeSet<String>();
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
