package bank2_0218;

public class UserVO {  //������ ������ �Է��ϴ� Ŭ����
/*
 *��ȭ��ȣ
 *���¹�ȣ
 *�ܾ�
 */
	private String name;
	private String tel;
	private String account;
	private int money;
	
//���ͼ��ͷ� �ҷ���
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
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	public String toString() {
		return "UserVO [name=" + name + ", tel=" + tel + ", account=" + account + ", money=" + money + "]";
	}
}
