package test0226;

import java.util.PriorityQueue;

public class Queue_Ex4 {
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		// �켱���� ť
		// Compareable �������̽��� ������ ��츸 ����.

		q.offer("�ڹ�");
		q.offer("����Ŭ");
		q.offer("����");
		q.offer("������");
		q.offer("�ȵ���̵�");

		while (q.peek() != null) {
			String s = q.poll();
			System.out.println(s);
		}
	}
}
