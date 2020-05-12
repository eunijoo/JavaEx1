package test0214;

public class Sub_String_Ex4 {
	public static void main(String[] args) {
		String s="seoul korea";
		System.out.println(s);
		
		//���ڿ� ����
		System.out.println("���� : "+s.length());
		
		//kor�� ���
		//�ε����� 0����
		System.out.println("substring(6,9) : "+s.substring(6,9));//kor  //���ڿ� ���̳�ġ�� ����.(���� ���ڰ� Ŀ�ߵ�)
			//substring(s,e) : s �ε������� e-1 �ε������� s<=e �̰�, e<length()�ƾ���
		System.out.println("substring(6) : "+s.substring(6)); //korea
			//substring(s) :s�ε������� ������
		
		char c=s.charAt(6); //�ش� �ε����� ����
		System.out.println(c);
		
		System.out.println("equals : "+s.equals("seoul korea")); //���ڿ� ��
		System.out.println("equals : "+s.equals("Seoul KOREA")); //��ҹ��� ����
		System.out.println("equalsIgnoreCase : "+s.equalsIgnoreCase("Seoul KOREA")); //��ҹ��ڱ������� ����.
		
		// ���ڿ��� "seoul"�� ���� ����
		System.out.println("startsWith : "+s.startsWith("seoul"));
		
		//���ڿ��� "korea"�� �������� ����
		System.out.println("endsWith : "+s.endsWith("korea"));
		
	//"seoul korea"�� "seoul corea"�� ���� �� Ŭ��?
		//������ �迭 (ASCII�ڵ� ����)
		System.out.println("compareTo : "+s.compareTo("seoul corea"));
		//���ڿ��� >,<,== ���� �񱳺Ұ� (>,<�� ���� ���ϴ°�, ==�� �ּҺ�)
		
		//"kor"�� ��ġ�� �����?
		System.out.println("indexOf : "+s.indexOf("kor"));
		System.out.println("indexOf : "+s.indexOf("busan"));
				//������ 0���� , ������ -1  //indexOf : �ֳľ��� ã�°�
		
		//ó������ ã�´�.
		System.out.println("indexOf : "+s.indexOf("o"));
		
		//�ε��� 3���� ã�´�.
		System.out.println("indexOf : "+s.indexOf("o",3));
		
		//�ڿ��� ���� ã�´�. //lastIndexOf : Ȯ���� ã�� �� ���̾�.
		System.out.println("lastIndexOf : "+s.lastIndexOf("o"));
		
		//�ѱ��� �ѹ����� ����
		s="�츮���� ���ѹα� ���ѵ��� ���� ������ �Ǿ�";
		s=s.replaceAll("����", "����");
		//System.out.println(s.replaceAll("����", "����"));
		System.out.println("replaceAll(����-> ���� ����) : "+s);
		
		//�߰��� ���ڻ��� 
		//���Խ� : ���ϰ˻��ϴ� �� (\d�� �ν�)  //replace�� ���Խ��� ��������.
		s="�츮123���� ����56�α�";
		s=s.replaceAll("\\d", ""); //���� ����  ( \\d : ���ڸ� �ǹ��ϴ� ��.)
		System.out.println(s);
		
		//���� ����
		s="�ڹ� 123 ������ 345 HTML";
		s=s.replaceAll("[0-9]", ""); // ���� ����;.
		System.out.println("[0-9] : "+s);
		
		//����,���� ����
		s="�ڹ� 123 ������ 345 HTML";
		s=s.replaceAll("\\d|\\s", ""); //  \\d|\\s  : ���� �Ǵ� ����
		System.out.println("\\d|\\s : "+s);
		
		//����,����,���� ����
		s="�ڹ� 123 ������ 345 HTML";
		s=s.replaceAll("\\w|\\s", ""); // \\w|\\s :������� �Ǵ� ����
		System.out.println("\\w|\\s : "+s);
		
		//���ڸ� ���
		s="�ڹ� 123 ������ 345 HTML";
		s=s.replaceAll("[^0-9]", ""); //  [^0-9]  :���ڸ� ��������
		System.out.println("[^0-9] : "+s);
		
		//���ڿ��� �������� �и��Ͽ� �迭 ��ȯ.
		String[] ss="java,html,css".split(",");//split ���ԽĻ�밡��
		for(String a:ss) {
			System.out.print(a+"  ");
		}
		System.out.println();
		
		String[] ss2="010-0000-1111".split("-");
		for(String a:ss2) {
			System.out.print(a+"  ");
		}
		System.out.println();

	}
}
