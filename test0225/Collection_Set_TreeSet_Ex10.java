package test0225;

import java.util.Set;
import java.util.TreeSet;

public class Collection_Set_TreeSet_Ex10 {
	public static void main(String[] args) {

		//Set : �ߺ�������
		// TreeSet : �����Ѵ�. Comparable ���� Ŭ������ ����.
		Set<String> set =new TreeSet<String>();
		set.add("����");
		set.add("�λ�");
		set.add("�뱸");
		set.add("��õ");
		set.add("����");
		set.add("����");
		set.add("���");
		set.add("����");
		set.add("����"); //�ߺ��� ���õȴ�.
		
		System.out.println(set);
		
		for(String s: set) {
			System.out.print(s+"  ");
		}
		System.out.println();
	}
}
