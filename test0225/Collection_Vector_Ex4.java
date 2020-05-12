package test0225;

import java.util.Iterator;
import java.util.Vector;

public class Collection_Vector_Ex4 {
	public static void main(String[] args) {
		// ArrayList : ����ȭ���� ����
		// Vector : ����ȭ ����(��Ƽ�����忡�� ����)
		// List<String> list = new Vector<String>(); //�̰͵� ����
		Vector<String> list = new Vector<String>();

		System.out.println("�ʱ� �뷮 : " + list.capacity()); // ó�� �뷮�� 10

		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		list.add("a5");
		list.add("a6");
		list.add("a7");
		list.add("a8");
		list.add("a9");
		list.add("a10");
		list.add("a11");
		list.add("a12");
		list.add("a13");
		list.add("a14");
		list.add("a15");

		System.out.println("���� : " + list.size()); // 15
		System.out.println("�뷮 : " + list.capacity());// 20 //�뷮�� �����ϸ� 10���� �þ��.

	// 0�ε����� korea �߰�
		list.add(0, "korea");
		System.out.println(list);
	// ó�� �ε��� ���
		System.out.println("ó�� : " + list.get(0));
		System.out.println("ó�� : " + list.firstElement());

	// ������ �ε��� ���
		System.out.println("������ : " + list.get(list.size() - 1));
		System.out.println("������ : " + list.lastElement());

	// ó���ε��� ������
		list.set(0, "���ѹα�");
		System.out.println(list);
		
    //��ü��� ���1
		System.out.println("��ü -1");
		for (String s : list) {
			System.out.println(s + " ");
		}
		System.out.println();
		
	//��ü��� ���2
		System.out.println("��ü 2");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
		
	//��ü��� ���3
		System.out.println("��ü 3");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s + " ");
		}
		System.out.println();
	//������� ��� 
		System.out.println("����");
		for (int i = list.size(); i > 0; i--) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
	//�ε������� 
		int idx = list.indexOf("a7");
		System.out.println("a7�ε��� : " + idx);

		list.remove(3);
		list.remove("a7");

	// ��ü����
		list.clear();

		System.out.println("���� :" + list.size());
		System.out.println("�뷮 :" + list.capacity());

	// �뷮�� ������ ��������.
		list.trimToSize();
		System.out.println("�뷮 : " + list.capacity());
	}
}
