package test0225;

import java.util.HashSet;
import java.util.Set;

public class Collection_Set_HashSet_Ex8 {
	public static void main(String[] args) {
//HashSet : 순서를 유지하지 않은채 출력된다. 삽입하는 순서대로 저장해서 중복이 있을경우 먼저 삽입한 데이터만 유지된다.
	//Set : 중복허용안함. 순서유지하지않음.
		Set<String> set =new HashSet<String>();
		set.add("서울");
		set.add("부산");
		set.add("대구");
		set.add("인천");
		set.add("광주");
		set.add("대전");
		set.add("울산");
		set.add("세종");
		set.add("서울"); //이전 서울을 덮어쓴다;
		
		System.out.println(set);
		
		for(String s: set) {
			System.out.print(s+"  ");
		}
		System.out.println();
	}
}
