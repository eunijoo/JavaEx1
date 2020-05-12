package test0225;

import java.util.Iterator;
import java.util.Vector;

public class Collection_Vector_Ex4 {
	public static void main(String[] args) {
		// ArrayList : 동기화지원 안함
		// Vector : 동기화 지원(멀티스레드에서 안전)
		// List<String> list = new Vector<String>(); //이것도 가능
		Vector<String> list = new Vector<String>();

		System.out.println("초기 용량 : " + list.capacity()); // 처음 용량은 10

		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		list.add("a6");
		list.add("a7");
		list.add("a8");
		list.add("a9");
		list.add("a10");
		list.add("a11");
		list.add("a12");
		list.add("a13");
		list.add("a14");
		list.add("a15");

		System.out.println("개수 : " + list.size()); // 15
		System.out.println("용량 : " + list.capacity());// 20 //용량이 부족하면 10개씩 늘어난다.

	// 0인덱스에 korea 추가
		list.add(0, "korea");
		System.out.println(list);
	// 처음 인덱스 출력
		System.out.println("처음 : " + list.get(0));
		System.out.println("처음 : " + list.firstElement());

	// 마지막 인덱스 출력
		System.out.println("마지막 : " + list.get(list.size() - 1));
		System.out.println("마지막 : " + list.lastElement());

	// 처음인덱스 값변경
		list.set(0, "대한민국");
		System.out.println(list);
		
    //전체출력 방법1
		System.out.println("전체 -1");
		for (String s : list) {
			System.out.println(s + " ");
		}
		System.out.println();
		
	//전체출력 방법2
		System.out.println("전체 2");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
		
	//전체출력 방법3
		System.out.println("전체 3");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s + " ");
		}
		System.out.println();
	//역순출력 방법 
		System.out.println("역순");
		for (int i = list.size(); i > 0; i--) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
	//인덱스삭제 
		int idx = list.indexOf("a7");
		System.out.println("a7인덱스 : " + idx);

		list.remove(3);
		list.remove("a7");

	// 전체삭제
		list.clear();

		System.out.println("개수 :" + list.size());
		System.out.println("용량 :" + list.capacity());

	// 용량을 개수로 조정가능.
		list.trimToSize();
		System.out.println("용량 : " + list.capacity());
	}
}
