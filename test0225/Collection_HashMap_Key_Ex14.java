

package test0225;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collection_HashMap_Key_Ex14 {
	public static void main(String[] args) {
		//Map : 키, 값 구조
		// 키는 중복을 허용하지 않음. 순서가 없음
		
		Map<String,Integer> map= new HashMap<>();
		
		//map
		map.put("서울",1000);
		map.put("부산",350);
		map.put("대구",250);
		map.put("인천",300);
		map.put("광주",150);
		map.put("광명",350);
		map.put("마포",180);
		map.put("대전",110);
		map.put("울산",20);
		map.put("수원",510);
		map.put("서울",990); //키가 같으면 기존값 덮어씀.
		System.out.println(map); 
		//map에서 키값 가져오기
		int a=map.get("서울");
		System.out.println(a);
		
		//map에는 Iterator(반복자)가 없으며. 향상된 for문도 사용할수없다.
		//Set<String> set = map.keySet() 는 키에서 Set객체를 반환하므로 
		// 키의 Set 객체를 이용하여 처음부터 끝까지 순회할수있다.
		Iterator<String> it=map.keySet().iterator();  //Set객체 //반복자 가져올수있다.
		while(it.hasNext()) {
			String key=it.next();
			Integer value = map.get(key);
			System.out.print(key+":"+value+" ");
		}
		System.out.println();
	//containsKey : 존재유무 출력(있으면 true ,없으면 false)	
		System.out.println("키로 서울 존재?" + map.containsKey("서울"));
		System.out.println("키로 경기 존재?" + map.containsKey("경기"));
		System.out.println("값 350존재?" + map.containsValue(350));
	//전체 개수(size)	
		System.out.println("전체개수: "+map.size());
	//삭제	
		map.remove("세종");
		System.out.println(map);
		
	}
}
