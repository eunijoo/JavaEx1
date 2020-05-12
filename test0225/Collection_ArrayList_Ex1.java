package test0225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection_ArrayList_Ex1 {
	public static void main(String[] args) {
		List<String> list1 =new ArrayList<String>();
		list1.add("����");
		list1.add("�λ�");
		list1.add("�뱸");
		
		List<String> list2=new ArrayList<String>();
		list2.add("����");
		list2.add("���");
		list2.add("���");
		
	//list2�� list1�� ��� �����͸� �߰�
		list2.addAll(list1);  //addAll : ��絥���� �߰�
		
		System.out.println("��� ������ �߰�(addAll) : "+list2);
		
	//List => String[]�� ��ȯ
		String[] ss= list2.toArray(new String[list2.size()]);//toArray : String�� ������ �־��µ�   String�迭�� �ٲ���
		System.out.print("����Ʈ�� �迭��(toArray) : ");
		for(String s:ss) {
			System.out.print(s+ " ");
		}
		System.out.println();
		
	//String[] => List�� ��ȯ
		List<String> list3= Arrays.asList(ss);//asList : �迭�� ����Ʈ�� �ٲܼ�����.
		System.out.println("�迭�� ����Ʈ�� ��ȯ ��(asList) : "+list3);
		
	//Ư����ġ
	//subList(a,b) : a�ε������� b-1�κ��� List
		List<String> list4 =list2.subList(2, 5);
		System.out.println("a�ε������� b-1�κ��� List(subList) : "+list4);
		
	//��ü����
		list1.clear();
		System.out.println("��ü����(���������) : "+list1.size());
		
	//list3�� ���,����,�λ����
		System.out.println("���� �� "+list2);
		list2.subList(2, 5).clear();
		System.out.println("���� ��(subList(a,b).clear()) : "+list2);
	}	
}