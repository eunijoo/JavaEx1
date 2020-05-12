package test0226;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Ex3 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();

		q.offer("자바"); // 큐의 마지막에 요소 삽입
		q.offer("오라클");
		q.offer("서블릿");
		q.offer("스프링");
		q.offer("안드로이드");

		// peek() : head 반환. 없으면 null
		// pool() : head 반환 후, 삭제

		while (q.peek() != null) {
			String s = q.poll();
			System.out.println(s);
		}
	}
}
