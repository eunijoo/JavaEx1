package test0226;

import java.util.PriorityQueue;

public class Queue_Ex5 {
	public static void main(String[] args) {
		PriorityQueue<UserVO> q=new PriorityQueue<>();
		q.offer(new UserVO("�ʳʳ�",25));
		q.offer(new UserVO("����",20));
		q.offer(new UserVO("������",23));
		q.offer(new UserVO("����",24));
		
		while(q.peek()!=null) {
			UserVO vo=q.poll();
			System.out.println(vo.getName()+":"+vo.getAge());
		}
		System.out.println();
	}
}

class UserVO implements Comparable<UserVO>{
	private String name;
	private int age;
	
	public UserVO(){
		
	}
	
	public UserVO(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(UserVO o) {	
		//return name.compareTo(o.getName());  //�̸� ������ 
		return age -o.getAge();  //���� ������ 
	}
}
