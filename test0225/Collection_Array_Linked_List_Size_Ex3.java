package test0225;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection_Array_Linked_List_Size_Ex3 {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long s, e;
//list1
		s = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add("�׽�Ʈ : " + i);
		}
		e = System.nanoTime();
		System.out.println("ArrayList ���� : " + list1.size() + "," + (e - s) + "nano");

//list2		
		s = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add("�׽�Ʈ : " + i);
		}
		e = System.nanoTime();
		System.out.println("LinkedList ���� : " + list2.size() + "," + (e - s) + "nano");
	}

}