

package test0225;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collection_HashMap_Key_Ex14 {
	public static void main(String[] args) {
		//Map : Ű, �� ����
		// Ű�� �ߺ��� ������� ����. ������ ����
		
		Map<String,Integer> map= new HashMap<>();
		
		//map
		map.put("����",1000);
		map.put("�λ�",350);
		map.put("�뱸",250);
		map.put("��õ",300);
		map.put("����",150);
		map.put("����",350);
		map.put("����",180);
		map.put("����",110);
		map.put("���",20);
		map.put("����",510);
		map.put("����",990); //Ű�� ������ ������ ���.
		System.out.println(map); 
		//map���� Ű�� ��������
		int a=map.get("����");
		System.out.println(a);
		
		//map���� Iterator(�ݺ���)�� ������. ���� for���� ����Ҽ�����.
		//Set<String> set = map.keySet() �� Ű���� Set��ü�� ��ȯ�ϹǷ� 
		// Ű�� Set ��ü�� �̿��Ͽ� ó������ ������ ��ȸ�Ҽ��ִ�.
		Iterator<String> it=map.keySet().iterator();  //Set��ü //�ݺ��� �����ü��ִ�.
		while(it.hasNext()) {
			String key=it.next();
			Integer value = map.get(key);
			System.out.print(key+":"+value+" ");
		}
		System.out.println();
	//containsKey : �������� ���(������ true ,������ false)	
		System.out.println("Ű�� ���� ����?" + map.containsKey("����"));
		System.out.println("Ű�� ��� ����?" + map.containsKey("���"));
		System.out.println("�� 350����?" + map.containsValue(350));
	//��ü ����(size)	
		System.out.println("��ü����: "+map.size());
	//����	
		map.remove("����");
		System.out.println(map);
		
	}
}
