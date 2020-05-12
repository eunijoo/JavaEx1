package test0220;

public class Interface_EX6 {
	public static void packing(Fruit f) {
							//�������̽��� ������ (Fruit f) ���  (Apple f)�̳� (Orange f)��� ���� ����������.
							//packing�� interface���� �������踦 �����ִ�.
		System.out.println(f.getName()+ ":"+ f.getPrice());
	}
	
	public static void main(String[] args) {
		Apple a=new Apple();  //����󸶴�?
		packing(a);
		
		Orange o=new Orange(); //������ �󸶴�?
		packing(o);
	}
}
//��޼ҵ尡 �ʿ����� �������ش�.
interface Fruit{  //�ڽ��� 2���ִ�(���,������)
	public int getPrice();  // ������
	public String getName(); //����������
}

//��� Ʋ �������ִ� Ŭ����
class Apple implements Fruit{

	@Override
	public int getPrice() {		
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}
}
//������ Ʋ �������ִ� Ŭ����
class Orange implements Fruit {

	@Override
	public int getPrice() {		
		return 500;
	}

	@Override
	public String getName() {	
		return "������";
	}
	
	
}
