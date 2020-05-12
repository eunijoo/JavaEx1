package friend_0224;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

//�������̽� ����
public class FriendImpl implements Friend {
	private List<FriendVO> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
//�����͵��
	@Override
	public void input() {
		// ������ �̸��� ������ ��ȭ��ȣ�� ������ ��ϺҰ�.
		System.out.println("\nģ�����");

		try {
			FriendVO vo = new FriendVO();

			System.out.println("�̸�?");
			vo.setName(sc.next());

			System.out.println("��ȭ��ȣ? ");
			vo.setTel(sc.next());

			if (readFriend(vo.getName(), vo.getTel()) != null) {
				System.out.println("��ϵ� �̸��� ��ȭ��ȣ�Դϴ�.");
				return;
			}
			System.out.println("�ּ�?");
			vo.setCity(sc.next());

			System.out.println("�������? ");
			vo.setBirth(sc.next());

			list.add(vo);
			System.out.println("��ϿϷ�...");

			// } catch (InputMismatchException e) {
			// System.out.println("��ȭ��ȣ�� ������ ���ڸ� �Է°����մϴ�.");

		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
//���������
	@Override
	public void print() {
		System.out.println("\nģ�����");
		// �̸�,��ȭ��ȣ,�ּ�,�������, ����(�޼ҵ� ����)
		for (FriendVO vo : list) {
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getTel() + "\t");
			System.out.print(vo.getCity() + "\t");
			System.out.print(vo.getBirth() + "\t");
			// System.out.print(age);
			System.out.println();
		}
	}
//�̸��˻�
	@Override
	public void findByName() {
		System.out.println("\n�̸��˻�");
		// �պκа� ��ġ�ص� �˻�
		String name;
		System.out.println("�˻��� �̸�?");
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
//������ ����
	@Override
	public void update() {
		System.out.println("\n��������");
		// �̸��� ��ȭ��ȣ�� �Է¹޾� ������ ������ ����
		// �̸�,��ȭ��ȣ,�ּ�,������� ��� ����
		// ��, �̸��� ��ȭ��ȣ�� �ڽ��� �ƴ� �ٸ� ����� ��ġ�ϸ� �����Ұ�.(�̹� �����Ͱ� �����ϸ� �����Ұ�.)

		String name, tel, city, birth;

		System.out.println("������ ����� �̸�?");
		name = sc.next();
		System.out.println("���� �� ����� ��ȭ��ȣ?");
		tel = sc.next();

		FriendVO vo = readFriend(name, tel);
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.");
			return;
		}

		System.out.println("������ �̸�?");
		name = sc.next();
		System.out.println("������ ��ȭ��ȣ?");
		tel = sc.next();

		FriendVO vo2 = readFriend(name, tel);
		if (vo2 != null && vo != vo2) { // vo2!=null �� �̹� ���� ���� ����.
			System.out.println("��ϵ� �ڷ��Դϴ�.\n");
			return;
		}
		System.out.println("�ּ�?");
		city = sc.next();

		System.out.println("�������?");
		birth = sc.next();

		// ���������� ����
		vo.setName(name);
		vo.setTel(tel);
		vo.setCity(city);
		vo.setBirth(birth);

		System.out.println("���� �Ϸ�");
	}
//�����ͻ���
	@Override
	public void delete() {
		System.out.println("\n��������");
		// �̸��� ��ȭ��ȣ�� �Է¹޾� ������ ������ ����
		String name, tel;

		System.out.println("������ �̸�?");
		name = sc.next();
		System.out.println("������ ��ȭ��ȣ?");
		tel = sc.next();

		FriendVO vo = readFriend(name, tel);
		if (vo == null) {
			System.out.println("��ϵ������� �̸� �Ǵ� ��ȭ��ȣ �Դϴ�.");
			return;
		}
		list.remove(vo);
		System.out.println("�����Ϸ�Ǿ����ϴ�.\n");
	}

//�̸�,��ȭ��ȣ ��
	private FriendVO readFriend(String name, String tel) {
		FriendVO vo = null;
		for (FriendVO v : list) {
			if (v.getName().equals(name) && v.getTel().equals(tel)) {
				return v;
			}
		}
		// �̸��� ��ȭ��ȣ�� ������ ģ���� �˻�
		return vo;
	}

//�����Է½� �ٸ���ȣ
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

//����	
	public int toAge(String birth) {
		int age = 0;

		if (!isCheckDate(birth)) {
			throw new RuntimeException("��¥ ���� ����...");
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
			throw new RuntimeException("��¥ ���� ����...");
		}

		return age;
	}
}