package test0225;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Collection_Iterator_ArrayList_Vector_Ex13 {
	public static void main(String[] args) {
		
//ArrayList	
		List<String> list =new ArrayList<String>();
		list.add("서울");
		list.add("서울");
		list.add("서울");
		list.add("서울");
		list.add("서울");

	//전체출력1
		System.out.println("전체 -1");
		for(String s:list) {
			System.out.println(s+"  ");
		}
		System.out.println();
		
	//전체출력2	
		System.out.println("전체 -2");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String s= it.next();
			System.out.println(s+" ");
		}
		System.out.println();
		
	//전체출력3
		System.out.println("전체 -3");
		ListIterator<String> it2=list.listIterator();
		while(it2.hasNext()) {
			String s=it2.next();
			System.out.println(s+" ");
		}
		System.out.println();
		
//Vector		
		Vector<String> v=new Vector<String>();
		v.add("강원");
		v.add("경기");
		v.add("경상");
		
		Enumeration<String> e=v.elements();

	//전체출력1
		System.out.println("벡터 전체1");
		while(e.hasMoreElements()) {
			String s=e.nextElement();
			System.out.println(s+" ");
		}
		System.out.println();
		
	//전체출력2		
		System.out.println("벡터전체2");
		Iterator<String> vi =v.iterator();
		while(vi.hasNext()) {
			String s=vi.next();
			System.out.println(s+" ");
		}
		System.out.println();
		
	//전체출력3		
		System.out.println("벡터전체3");
		for(String s:v) {
			System.out.println(s+" ");
		}
		System.out.println();
		
	}
}