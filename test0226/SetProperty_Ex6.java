package test0226;

import java.io.FileOutputStream;
import java.util.Properties;

public class SetProperty_Ex6 {
	public static void main(String[] args) {
	//Hashtable(�ƹ���) Ŭ������ ��ӹ���
	//Ű�� ���� ���ڿ��� ����
	//���� ���� �� �ҷ����Ⱑ �����ؼ� ȯ�漳�� ��� ���� ���.
		Properties p=new Properties();
		
	//Ű�� ���� ����
	// put() �޼ҵ带 ����Ҽ� ������ �������� ����(�ƹ������� ���� �� �� ������ �׷� �������� ��������� �ƴϱ⶧���� �Ⱦ��°� ����
		p.setProperty("�ڹ�", "80");
		p.setProperty("������", "90");
		p.setProperty("����", "85");
		p.setProperty("����Ŭ", "90");
		p.setProperty("HTML", "100");		
		
		String pathname ="subject.properties";
		try(FileOutputStream fos =new FileOutputStream(pathname)) {
			p.store(fos, "���� ����");
			System.out.println("���Ͽ� ���� �Ϸ�...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	
