package test0224;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class Collection_List_Ex11 {
	public static void main(String[] args) {
		// ArrayList : List �������̽� ����Ŭ����
		// �迭�� ���� ����.
		List<String> list = new ArrayList<>(); // ��ĳ����
		String s;

		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");

		System.out.println("���� : " + list.size());

	// ó��
		s = list.get(0); // �ε����� ���� ����
		System.out.println("ó��: " + s);

	// �ι�°
		s = list.get(1); // �ε����� ���� ����
		System.out.println("�ι�°: " + s);

	// ������
		s = list.get(list.size() - 1); // ��ü������¿��� -1�� �ؾ� �ε�����ȣ�� ����.
		System.out.println("������: " + s);

	// ó���� �ѱ��� �߰�.
		list.add(0, "�ѱ�");
		System.out.println(list);

	// �ѱ��� ���ѹα����� ����(0��° �ε��� ����)
		list.set(0, "���ѹα�");
		System.out.println(list);

	//��õ �ε��� Ȯ��(��õ�� ��� ����Ǿ��ִ��� ã��)
		System.out.println("��õ�ε���: " +list.indexOf("��õ"));
		
	//�����ε��� Ȯ��(indexOf : �ش� �ε����� ������ -1�� ��µ�)
		System.out.println("�����ε���: " +list.indexOf("����"));
		
	//�λ� ���� ���� (������ true, ������ false)
		System.out.println("�λ� �ֳ�? "+list.contains("�λ�"));
		
	//���ѹα� ����(list.remove(0);   //list.remove("���ѹα�"); �Ѱ� ����.)
		list.remove(0);
	//list.remove("���ѹα�");
		System.out.println(list);
		
	//��ü���1(1-2���� �� �˾Ƶα�. 3���� hashMap�� ���̾�.)	
		System.out.println("��ü��� ���1");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
	//��ü���	2
		System.out.println("��ü��� ���2");
		for(String str:list) {		
			System.out.print(str+"  ");
		}
		System.out.println();
	//��ü���	3
		System.out.println("��ü��� ���3");
		Iterator<String> it = list.iterator(); //Iterator:ó������ �ϳ��� �����ü��ְ��ϴ°�. �ݺ���
		while(it.hasNext()) {  				//������ �ִ�?  //�������� false�� ��������
			String str=it.next();			//������ġ�����͸� ������ ��������. ��������... �������� �����Ͱ� ����.
			System.out.print(str+"  ");
		}
		System.out.println();
		
	//�������	
		System.out.println("������� ���1");
		for(int i=list.size()-1;i>=0;i--) { 
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
	
		System.out.println("������� ���2");
		ListIterator<String> it2= list.listIterator(list.size()); //ListIterator : ������ �����Ͱ������°� �����ϰ���.
																//	size�� �༭ �ڿ������� ������.// size�ȳ־��ָ� ó������ ������.					
		while(it2.hasPrevious()) {
			String str=it2.previous();
			System.out.print(str+"  ");
		}
		System.out.println();
		}
}
