package test0225;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_ArrayList_Comparable_Ex6 {
	public static void main(String[] args) {

		List<UserVo> list = new ArrayList<UserVo>();

		list.add(new UserVo("도도도", "010", 25));
		list.add(new UserVo("후후후", "011", 20));
		list.add(new UserVo("가가가", "012", 22));
		list.add(new UserVo("마마마", "013", 25));
		list.add(new UserVo("마가가", "014", 23));

		print("정렬전...", list);

		// Collections 정렬 //정렬해야하는게 문자.숫자가 있음(어떤걸로 정렬해야하는지 모름)
		// 크기 순으로 정렬 : Comparable인터페이스가 구현된 클래스만 가능.
		Collections.sort(list);

		print("정렬 후...", list);
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

class UserVo implements Comparable<UserVo> {//Comparable인터페이스를 이미 가지고 있음.
	private String name;
	private String tel;
	private int age;

//인자없는 생성자 
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
	
	//compareTo : comparable 메소드로 정렬기준을 설정한다.
	//이름순으로 나오게하고싶음(문자열을 비교) :compareTo로 문자열비교
	@Override
	public int compareTo(UserVo o) {
		//String클래스의 compareTo() : 문자열을 사전식으로 비교
	//	return name.compareTo(o.getName());  //이름 오름차순
	//	return -name.compareTo(o.getName()); //이름 내림차순
		return age - o.getAge(); //나이 오름차순
		
	}
}