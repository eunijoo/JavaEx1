package friend_0224;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

//인터페이스 구현
public class FriendImpl implements Friend {
	private List<FriendVO> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
//데이터등록
	@Override
	public void input() {
		// 동일한 이름과 동일한 전화번호가 있으면 등록불가.
		System.out.println("\n친구등록");

		try {
			FriendVO vo = new FriendVO();

			System.out.println("이름?");
			vo.setName(sc.next());

			System.out.println("전화번호? ");
			vo.setTel(sc.next());

			if (readFriend(vo.getName(), vo.getTel()) != null) {
				System.out.println("등록된 이름과 전화번호입니다.");
				return;
			}
			System.out.println("주소?");
			vo.setCity(sc.next());

			System.out.println("생년월일? ");
			vo.setBirth(sc.next());

			list.add(vo);
			System.out.println("등록완료...");

			// } catch (InputMismatchException e) {
			// System.out.println("전화번호와 생일은 숫자만 입력가능합니다.");

		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
//데이터출력
	@Override
	public void print() {
		System.out.println("\n친구출력");
		// 이름,전화번호,주소,생년월일, 나이(메소드 만들어서)
		for (FriendVO vo : list) {
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getTel() + "\t");
			System.out.print(vo.getCity() + "\t");
			System.out.print(vo.getBirth() + "\t");
			// System.out.print(age);
			System.out.println();
		}
	}
//이름검색
	@Override
	public void findByName() {
		System.out.println("\n이름검색");
		// 앞부분과 일치해도 검색
		String name;
		System.out.println("검색할 이름?");
		name = sc.next();


		for(FriendVO vo: list) {
			if(vo.getName().startsWith(name)) {
				System.out.print(vo.getName() +  "\t");
				System.out.print(vo.getTel()  +  "\t");
				System.out.print(vo.getCity() +  "\t");
				System.out.print(vo.getBirth() + "\t");
				// System.out.print(age);
			}
		}

		System.out.println();
	}
//데이터 수정
	@Override
	public void update() {
		System.out.println("\n정보수정");
		// 이름과 전화번호를 입력받아 동일한 데이터 수정
		// 이름,전화번호,주소,생년월일 모두 수정
		// 단, 이름과 전화번호가 자신이 아닌 다른 사람과 일치하면 수정불가.(이미 데이터가 존재하면 수정불가.)

		String name, tel, city, birth;

		System.out.println("수정할 사람의 이름?");
		name = sc.next();
		System.out.println("수정 할 사람의 전화번호?");
		tel = sc.next();

		FriendVO vo = readFriend(name, tel);
		if (vo == null) {
			System.out.println("등록된 자료가 아닙니다.");
			return;
		}

		System.out.println("수정할 이름?");
		name = sc.next();
		System.out.println("수정할 전화번호?");
		tel = sc.next();

		FriendVO vo2 = readFriend(name, tel);
		if (vo2 != null && vo != vo2) { // vo2!=null 은 이미 같은 값이 있음.
			System.out.println("등록된 자료입니다.\n");
			return;
		}
		System.out.println("주소?");
		city = sc.next();

		System.out.println("생년월일?");
		birth = sc.next();

		// 원래데이터 수정
		vo.setName(name);
		vo.setTel(tel);
		vo.setCity(city);
		vo.setBirth(birth);

		System.out.println("수정 완료");
	}
//데이터삭제
	@Override
	public void delete() {
		System.out.println("\n정보삭제");
		// 이름과 전화번호를 입력받아 동일한 데이터 삭제
		String name, tel;

		System.out.println("삭제할 이름?");
		name = sc.next();
		System.out.println("삭제할 전화번호?");
		tel = sc.next();

		FriendVO vo = readFriend(name, tel);
		if (vo == null) {
			System.out.println("등록되지않은 이름 또는 전화번호 입니다.");
			return;
		}
		list.remove(vo);
		System.out.println("삭제완료되었습니다.\n");
	}

//이름,전화번호 비교
	private FriendVO readFriend(String name, String tel) {
		FriendVO vo = null;
		for (FriendVO v : list) {
			if (v.getName().equals(name) && v.getTel().equals(tel)) {
				return v;
			}
		}
		// 이름과 전화번호가 동일한 친구를 검색
		return vo;
	}

//생일입력시 다른기호
	public boolean isCheckDate(String birth) {
		birth = birth.replaceAll("(\\-|\\.|/)", "");
		if (birth.length() != 8) {
			return false;
		}

		try {
			int y = Integer.parseInt(birth.substring(0, 4));
			int m = Integer.parseInt(birth.substring(4, 6));
			int d = Integer.parseInt(birth.substring(6));

			if (m < 1 || m > 12) {
				return false;
			}

			Calendar cal = Calendar.getInstance();
			cal.set(y, m - 1, 1);
			int days = cal.getActualMaximum(Calendar.DATE);
			if (d < 1 || d > days) {
				return false;
			}

		} catch (Exception e) {
			return false;
		}

		return true;
	}

//나이	
	public int toAge(String birth) {
		int age = 0;

		if (!isCheckDate(birth)) {
			throw new RuntimeException("날짜 형식 오류...");
		}

		birth = birth.replaceAll("(\\-|\\.|/)", "");

		try {
			int y = Integer.parseInt(birth.substring(0, 4));
			int m = Integer.parseInt(birth.substring(4, 6));
			int d = Integer.parseInt(birth.substring(6));

			Calendar now = Calendar.getInstance();

			age = now.get(Calendar.YEAR) - y;
			if (m > now.get(Calendar.MONTH) + 1
					|| m == now.get(Calendar.MONTH) + 1 && d > now.get(Calendar.DAY_OF_MONTH)) {
				age--;
			}
		} catch (Exception e) {
			throw new RuntimeException("날짜 형식 오류...");
		}

		return age;
	}
}