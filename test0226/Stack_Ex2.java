package test0226;

import java.util.Stack;

//STACK :LIFO����
public class Stack_Ex2 {
	public static void main(String[] args) {
	//Stack : Vector�� ����Ŭ����
		Stack<String> st= new Stack<>();
		
	//���ÿ� �������߰�:push
	
		st.push("����");
		st.push("���");
		st.push("���");
		st.push("û��");
		st.push("����");
	
		//���� ������ ��������
		//pop() : top ��� ��ȯ ��, ����
		//peek() : top ��� ��ȯ ��, �������� ����.
		while(! st.empty()) {
			String s=st.pop(); //���� top ��� ��ȯ �� ����
			System.out.println(s+" ");
		}
		System.out.println();
	}
}
