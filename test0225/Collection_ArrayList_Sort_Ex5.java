package test0225;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_ArrayList_Sort_Ex5 {
	public static void main(String[] args) {
//�����ؾ��ϴ°� ���ڿ��ۿ�����/	
		List<String> list = new ArrayList<String>();
		
		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");
		
		System.out.println("����������   : "+list);

	//�����˻�  : ó������ �ϳ��� ����.
		int idx;
		idx = list.indexOf("�λ�");
		System.out.println("�λ���ġ(indexOf) : "+idx);
	
	//ũ������� ���� : Comparable �������̽��� ������ Ŭ������ ����
		Collections.sort(list);
		System.out.println("���� ��(sort) : "+list);
		
	// �̺а˻�(������ �Ǿ��־�� ����) : ������ -1 
	// ���ĵ� �� �߿��� ������ ���� ���� �º��캯�� ���Ѵ�. 
		idx = Collections.binarySearch(list, "����");
		System.out.println("���� ��ġ (�̺а˻� binarySearch) : "+idx);
	
	//��������
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("���� ��(Collections.reverseOrder)  : "+list);
	}
}
