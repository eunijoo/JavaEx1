package test0225;

import java.util.HashSet;
import java.util.Set;

public class Collection_Set_HashSet_Ex8 {
	public static void main(String[] args) {
//HashSet : ������ �������� ����ä ��µȴ�. �����ϴ� ������� �����ؼ� �ߺ��� ������� ���� ������ �����͸� �����ȴ�.
	//Set : �ߺ�������. ����������������.
		Set<String> set =new HashSet<String>();
		set.add("����");
		set.add("�λ�");
		set.add("�뱸");
		set.add("��õ");
		set.add("����");
		set.add("����");
		set.add("���");
		set.add("����");
		set.add("����"); //���� ������ �����;
		
		System.out.println(set);
		
		for(String s: set) {
			System.out.print(s+"  ");
		}
		System.out.println();
	}
}
