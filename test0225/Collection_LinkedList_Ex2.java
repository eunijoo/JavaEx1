package test0225;

import java.util.LinkedList;
import java.util.List;

public class Collection_LinkedList_Ex2 {
	public static void main(String[] args) {
		/*
		 * - ArrayList : 추가와 삭제가 빈번한 경우 성능저하 발생
		 * 				  검색시 속도 빠름. 동기화되지 않음.(멀티스레드환경에서 안전하지 않음)
		 * 
		 * - LinkedList : 추가와 삭제가 빈번한 경우 ArrayList보다 빠름
		 * 			            검색시 속도 느림. 동기화되지 않음.(멀티스레드환경에서 안전하지 않음)
		 * 
		 * - ArrayList와 LinkedList 작성할때 방법은 동일하지만 클래스명만 다르게 하면 된다.
		 */
		
		List<String> list =new LinkedList<String>();

		list.add("서울");
		list.add("부산");
		list.add("대구");
		
		System.out.println(list.get(0));

	}	
}