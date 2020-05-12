package test0225;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_ArrayList_Comparator_Ex7 {
	public static void main(String[] args) {

		List<UserDTO> list = new ArrayList<UserDTO>();

		list.add(new UserDTO("도도도", "010", 25));
		list.add(new UserDTO("후후후", "011", 20));
		list.add(new UserDTO("가가가", "012", 22));
		list.add(new UserDTO("마마마", "013", 25));
		list.add(new UserDTO("마가가", "014", 23));

		print("정렬전...", list);

	// 크기 순으로 정렬
	// 이름 정렬
	// Comparator 인터페이스 구현 : 정렬 기준 설정
		Comparator<UserDTO> comp = new Comparator<UserDTO>() {

			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		};

		Collections.sort(list, comp);
		print("\n이름 정렬 후...", list);
		
	//나이정렬
		Comparator<UserDTO> comp2 =new Comparator<UserDTO>() {

			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				
				return o1.getAge()-o2.getAge();
			}		
		};
		
		Collections.sort(list, comp2);
		print("\n나이 정렬 후...", list);
	}
//출력
	public static void print(String title, List<UserDTO> list) {
		System.out.println(title);

		for (UserDTO vo : list) {
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getTel() + "\t");
			System.out.print(vo.getAge() + "\t\n");
		}
	}
}

class UserDTO {// Comparable인터페이스를 이미 가지고 있음.
	private String name;
	private String tel;
	private int age;

//인자없는 생성자 
	public UserDTO() {

	}

	public UserDTO(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

//getter,setter 호출.
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