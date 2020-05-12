package test0217;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormat_Ex11 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
//SimpleDateFormat : ��¥�� ->���ڷ� /����->��¥�� ��ȯ�ϴµ� ���� Ŭ����
		
/* �������� �ʴ´�.		
		int y=d1.getYear()+1900;
		int m=d1.getMonth()+1;
		int d=d1.getDate();   //�۾����� �� : �Լ��� ��������� ���µ� ������ ����� ���� å�Ӿ����ڴٴ� ��.(�ڹٰ� ���°� ������ ����)
		System.out.println(y+"-"+m+"-"+d);
*/
		
		//1970�� 1�� 1�� 0�� 0�� 0�� �������� ms�� ��ȯ
		long t=d1.getTime();
		System.out.println(t);
		
		Date d2=new Date(158190878880L);
		System.out.println(d2);
		
		System.out.println(d1.after(d2));//d1�� d2���� �ڿ� �ִ�? (true/false)
		
	//Date���� String���� ��ȯ (Date�� ���� ���ϴ¼������� ����ϰ� ����)
		SimpleDateFormat f=new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		String s=f.format(d1);
		System.out.println(s);
		
	//String�� Date������ ��ȯ
		//String s2 = "2000-10-20"; �� SimpleDateFormat("yyyy-MM-dd"); ������ ���ƾ���.
		String s2 = "2000-10-20";
		SimpleDateFormat f2=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date=f2.parse(s2);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		} //parse :���輺����(��ȯ�� �� ���� �ְ�,�� �ɼ��� ����)=>������ �´��� �˻�(if��)=>(����ó���ؾ���)

		
		
	}
}
