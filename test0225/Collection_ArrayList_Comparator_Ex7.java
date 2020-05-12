package test0225;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_ArrayList_Comparator_Ex7 {
	public static void main(String[] args) {

		List<UserDTO> list = new ArrayList<UserDTO>();

		list.add(new UserDTO("������", "010", 25));
		list.add(new UserDTO("������", "011", 20));
		list.add(new UserDTO("������", "012", 22));
		list.add(new UserDTO("������", "013", 25));
		list.add(new UserDTO("������", "014", 23));

		print("������...", list);

	// ũ�� ������ ����
	// �̸� ����
	// Comparator �������̽� ���� : ���� ���� ����
		Comparator<UserDTO> comp = new Comparator<UserDTO>() {

			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		};

		Collections.sort(list, comp);
		print("\n�̸� ���� ��...", list);
		
	//��������
		Comparator<UserDTO> comp2 =new Comparator<UserDTO>() {

			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				
				return o1.getAge()-o2.getAge();
			}		
		};
		
		Collections.sort(list, comp2);
		print("\n���� ���� ��...", list);
	}
//���
	public static void print(String title, List<UserDTO> list) {
		System.out.println(title);

		for (UserDTO vo : list) {
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getTel() + "\t");
			System.out.print(vo.getAge() + "\t\n");
		}
	}
}

class UserDTO {// Comparable�������̽��� �̹� ������ ����.
	private String name;
	private String tel;
	private int age;

//���ھ��� ������ 
	public UserDTO() {

	}

	public UserDTO(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

//getter,setter ȣ��.
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
}