package test0225;

import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_Set_LinkedHashSet_Ex9 {
	public static void main(String[] args) {

	//Set : �ߺ�������
	// LinkedHashSet : ������ �����Ѵ�.
		
		Set<String> set =new LinkedHashSet<String>();
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
