package test0224;

public class Jenerics_Non_Ex1 {
	public static void main(String[] args) {

		Object[] t = new Object[3];

		t[0] = new Integer(100);
		t[1] = new Integer(20);
		t[2] = new String("korea");

		//Arrays.sort(t); //��Ÿ�ӿ���(ClassCastException)
			
		for (Object o : t) {
			//String s=(String)o;  //��Ÿ�ӿ���(ClassCastException)��Ƽ���� ��Ʈ������ ����ȯ �ȵ�. 
			//System.out.println(s.length());
			
//if���� �� �Ⱦ��°� �� ����. �̷������� �ڵ��ѰŴ� �� ���� �ڵ�.			
			if(o instanceof String) {  //instanceof : ���ڿ����� �˻�����.
				String s=(String)o;
				System.out.println(s+":"+s.length());  
			}else if(o instanceof Integer) {
				Integer s=(Integer)0;
				System.out.println("���� : "+s);
			}
			System.out.println(o);
		}
	}
}
