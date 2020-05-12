package test0225;

import java.util.Set;
import java.util.TreeSet;

public class Collection_Set_TreeSet_Comparable_Ex12 {
	public static void main(String[] args) {
		Set<TestVO> set =new TreeSet<TestVO>();
		
		set.add(new TestVO("�ʳʳ�",20));
		set.add(new TestVO("������",20));
		set.add(new TestVO("�ٹٹ�",20));
		
		for(TestVO vo:set) {
			System.out.println(vo.getName()+"\t"+vo.getAge());
		}
		System.out.println();
	}
}

class TestVO implements Comparable<TestVO>{
	private String name;
	private int age;
	
	public TestVO(){
		
	}
	public TestVO(String name,int age) {
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
	public int compareTo(TestVO o) {//compareTo : Comparable��
		//�̸���(��������)
		return name.compareTo(o.getName()); //compareTo : String��
	}
}
