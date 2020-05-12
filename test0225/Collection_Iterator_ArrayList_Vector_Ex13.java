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
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");

	//��ü���1
		System.out.println("��ü -1");
		for(String s:list) {
			System.out.println(s+"  ");
		}
		System.out.println();
		
	//��ü���2	
		System.out.println("��ü -2");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String s= it.next();
			System.out.println(s+" ");
		}
		System.out.println();
		
	//��ü���3
		System.out.println("��ü -3");
		ListIterator<String> it2=list.listIterator();
		while(it2.hasNext()) {
			String s=it2.next();
			System.out.println(s+" ");
		}
		System.out.println();
		
//Vector		
		Vector<String> v=new Vector<String>();
		v.add("����");
		v.add("���");
		v.add("���");
		
		Enumeration<String> e=v.elements();

	//��ü���1
		System.out.println("���� ��ü1");
		while(e.hasMoreElements()) {
			String s=e.nextElement();
			System.out.println(s+" ");
		}
		System.out.println();
		
	//��ü���2		
		System.out.println("������ü2");
		Iterator<String> vi =v.iterator();
		while(vi.hasNext()) {
			String s=vi.next();
			System.out.println(s+" ");
		}
		System.out.println();
		
	//��ü���3		
		System.out.println("������ü3");
		for(String s:v) {
			System.out.println(s+" ");
		}
		System.out.println();
		
	}
}