package test0225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection_ArrayList_Ex1 {
	public static void main(String[] args) {
		List<String> list1 =new ArrayList<String>();
		list1.add("서울");
		list1.add("부산");
		list1.add("대구");
		
		List<String> list2=new ArrayList<String>();
		list2.add("강원");
		list2.add("경기");
		list2.add("경상");
		
	//list2에 list1의 모든 데이터를 추가
		list2.addAll(list1);  //addAll : 모든데이터 추가
		
		System.out.println("모든 데이터 추가(addAll) : "+list2);
		
	//List => String[]로 변환
		String[] ss= list2.toArray(new String[list2.size()]);//toArray : String을 가지고 있었는데   String배열로 바꿔줌
		System.out.print("리스트를 배열로(toArray) : ");
		for(String s:ss) {
			System.out.print(s+ " ");
		}
		System.out.println();
		
	//String[] => List로 변환
		List<String> list3= Arrays.asList(ss);//asList : 배열을 리스트로 바꿀수있음.
		System.out.println("배열을 리스트로 변환 후(asList) : "+list3);
		
	//특정위치
	//subList(a,b) : a인덱스에서 b-1부분의 List
		List<String> list4 =list2.subList(2, 5);
		System.out.println("a인덱스에서 b-1부분의 List(subList) : "+list4);
		
	//전체삭제
		list1.clear();
		System.out.println("전체삭제(사이즈출력) : "+list1.size());
		
	//list3의 경상,서울,부산삭제
		System.out.println("삭제 전 "+list2);
		list2.subList(2, 5).clear();
		System.out.println("삭제 후(subList(a,b).clear()) : "+list2);
	}	
}