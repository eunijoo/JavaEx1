package test0224;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class Collection_List_Ex11 {
	public static void main(String[] args) {
		// ArrayList : List 인터페이스 구현클래스
		// 배열과 가장 유사.
		List<String> list = new ArrayList<>(); // 업캐스팅
		String s;

		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");

		System.out.println("개수 : " + list.size());

	// 처음
		s = list.get(0); // 인덱스로 접근 가능
		System.out.println("처음: " + s);

	// 두번째
		s = list.get(1); // 인덱스로 접근 가능
		System.out.println("두번째: " + s);

	// 마지막
		s = list.get(list.size() - 1); // 전체사이즈는에서 -1을 해야 인덱스번호가 나옴.
		System.out.println("마지막: " + s);

	// 처음에 한국을 추가.
		list.add(0, "한국");
		System.out.println(list);

	// 한국을 대한민국으로 변경(0번째 인덱스 변경)
		list.set(0, "대한민국");
		System.out.println(list);

	//인천 인덱스 확인(인천이 어디에 저장되어있는지 찾기)
		System.out.println("인천인덱스: " +list.indexOf("인천"));
		
	//세종인덱스 확인(indexOf : 해당 인덱스가 없으면 -1이 출력됨)
		System.out.println("세종인덱스: " +list.indexOf("세종"));
		
	//부산 존재 여부 (있으면 true, 없으면 false)
		System.out.println("부산 있나? "+list.contains("부산"));
		
	//대한민국 삭제(list.remove(0);   //list.remove("대한민국"); 둘가 가능.)
		list.remove(0);
	//list.remove("대한민국");
		System.out.println(list);
		
	//전체출력1(1-2번은 꼭 알아두기. 3번은 hashMap을 많이씀.)	
		System.out.println("전체출력 방법1");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
	//전체출력	2
		System.out.println("전체출력 방법2");
		for(String str:list) {		
			System.out.print(str+"  ");
		}
		System.out.println();
	//전체출력	3
		System.out.println("전체출력 방법3");
		Iterator<String> it = list.iterator(); //Iterator:처음부터 하나씩 가져올수있게하는거. 반복자
		while(it.hasNext()) {  				//데이터 있니?  //마지막엔 false를 리턴해줌
			String str=it.next();			//현재위치데이터를 가지고 다음간다. 다음간다... 마지막엔 데이터가 없음.
			System.out.print(str+"  ");
		}
		System.out.println();
		
	//역순출력	
		System.out.println("역순출력 방법1");
		for(int i=list.size()-1;i>=0;i--) { 
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
	
		System.out.println("역순출력 방법2");
		ListIterator<String> it2= list.listIterator(list.size()); //ListIterator : 역으로 데이터가져오는걸 가능하게함.
																//	size를 줘서 뒤에서부터 시작함.// size안넣어주면 처음부터 시작함.					
		while(it2.hasPrevious()) {
			String str=it2.previous();
			System.out.print(str+"  ");
		}
		System.out.println();
		}
}
