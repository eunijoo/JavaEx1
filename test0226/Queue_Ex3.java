package test0226;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Ex3 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();

		q.offer("�ڹ�"); // ť�� �������� ��� ����
		q.offer("����Ŭ");
		q.offer("����");
		q.offer("������");
		q.offer("�ȵ���̵�");

		// peek() : head ��ȯ. ������ null
		// pool() : head ��ȯ ��, ����

		while (q.peek() != null) {
			String s = q.poll();
			System.out.println(s);
		}
	}
}
