package test0225;

import java.util.LinkedList;
import java.util.List;

public class Collection_LinkedList_Ex2 {
	public static void main(String[] args) {
		/*
		 * - ArrayList : �߰��� ������ ����� ��� �������� �߻�
		 * 				  �˻��� �ӵ� ����. ����ȭ���� ����.(��Ƽ������ȯ�濡�� �������� ����)
		 * 
		 * - LinkedList : �߰��� ������ ����� ��� ArrayList���� ����
		 * 			            �˻��� �ӵ� ����. ����ȭ���� ����.(��Ƽ������ȯ�濡�� �������� ����)
		 * 
		 * - ArrayList�� LinkedList �ۼ��Ҷ� ����� ���������� Ŭ������ �ٸ��� �ϸ� �ȴ�.
		 */
		
		List<String> list =new LinkedList<String>();

		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		
		System.out.println(list.get(0));

	}	
}