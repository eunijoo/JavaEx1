package bank2_0218;

public class User {	//�������� �����ϴ� �����ͺ��̽�
	
	//�迭�� 10�� �����Ұ���
	private UserVO[] list; 	//��������ȣ�� private
							//������ϸ� ���� null(�ּҰ��� ������ ���� ����) //list : �ּҰ��� ����
	private int count; 		//�迭�� �󸶳� ä�����ִ���
	
	
	public int getCount() {
		return count;
	}
	
	public User(){		 //������ ���ÿ� �ʱ�ȭ����
		list =new UserVO[10];
		count=0;

	}

	public UserVO[] getList() {
		return list;
	}
	
//UserVO��ü�� �迭�� �߰��ϴ� �޼���	
	public void append(UserVO vo) { //(UserVO vo) : �Ű������� ȣ���ؿ���
		//10�� �����ȵǴϱ�
		if(count>=10) {
			System.out.println("������ �ʰ�");
		}
		list[count]=vo;	 // �ο���
		count++;
	}
	
	
	
}