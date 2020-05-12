package test0225;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_ArrayList_Sort_Ex5 {
	public static void main(String[] args) {
//정렬해야하는건 문자열밖에없음/	
		List<String> list = new ArrayList<String>();
		
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		
		System.out.println("기존데이터   : "+list);

	//순차검색  : 처음부터 하나씩 비교함.
		int idx;
		idx = list.indexOf("부산");
		System.out.println("부산위치(indexOf) : "+idx);
	
	//크기순으로 정렬 : Comparable 인터페이스가 구현된 클래스만 가능
		Collections.sort(list);
		System.out.println("정렬 후(sort) : "+list);
		
	// 이분검색(정렬이 되어있어야 가능) : 없으면 -1 
	// 정렬된 것 중에서 갯수의 반을 나눠 좌변우변을 비교한다. 
		idx = Collections.binarySearch(list, "서울");
		System.out.println("서울 위치 (이분검색 binarySearch) : "+idx);
	
	//역순정렬
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("역순 후(Collections.reverseOrder)  : "+list);
	}
}
