package test0226;

import java.util.PriorityQueue;

public class Queue_Ex4 {
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		// 우선순위 큐
		// Compareable 인터페이스가 구현된 경우만 가능.

		q.offer("자바");
		q.offer("오라클");
		q.offer("서블릿");
		q.offer("스프링");
		q.offer("안드로이드");

		while (q.peek() != null) {
			String s = q.poll();
			System.out.println(s);
		}
	}
}
