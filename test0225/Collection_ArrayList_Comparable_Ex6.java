package test0225;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_ArrayList_Comparable_Ex6 {
	public static void main(String[] args) {

		List<UserVo> list = new ArrayList<UserVo>();

		list.add(new UserVo("������", "010", 25));
		list.add(new UserVo("������", "011", 20));
		list.add(new UserVo("������", "012", 22));
		list.add(new UserVo("������", "013", 25));
		list.add(new UserVo("������", "014", 23));

		print("������...", list);

		// Collections ���� //�����ؾ��ϴ°� ����.���ڰ� ����(��ɷ� �����ؾ��ϴ��� ��)
		// ũ�� ������ ���� : Comparable�������̽��� ������ Ŭ������ ����.
		Collections.sort(list);

		print("���� ��...", list);
	}

	public static void print(String title, List<UserVo> list) {
		System.out.println(title);

		for (UserVo vo : list) {
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getTel() + "\t");
			System.out.print(vo.getAge() + "\t\n");
		}
	}
}

class UserVo implements Comparable<UserVo> {//Comparable�������̽��� �̹� ������ ����.
	private String name;
	private String tel;
	private int age;

//���ھ��� ������ 
	public UserVo() {

	}

	public UserVo(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//compareTo : comparable �޼ҵ�� ���ı����� �����Ѵ�.
	//�̸������� �������ϰ����(���ڿ��� ��) :compareTo�� ���ڿ���
	@Override
	public int compareTo(UserVo o) {
		//StringŬ������ compareTo() : ���ڿ��� ���������� ��
	//	return name.compareTo(o.getName());  //�̸� ��������
	//	return -name.compareTo(o.getName()); //�̸� ��������
		return age - o.getAge(); //���� ��������
		
	}
}