package test0130;

public class StringEx {
	public static void main(String[] args) {
		String s;
		//���ڿ� + xxxx => ���ڿ�(����)
		s="korea"+9+3;   // �������:("korea"+9) +3
		System.out.println(s); //korea93
		
		s=9+3+"korea"; //����9+����3+korea
		System.out.println(s); //12korea
		
		s="korea"+'A'+3; // ("korea"+'A') +3 => ���ڿ�+���� +����3
		System.out.println(s); //koreaA3
		
		s='A'+'0'+3+"korea";  //����A+����0+����3+korea =>���ڰ� ������ �ٲ��� ��� 65+48+3+korea(������������ҋ��� ���ڰ� ������ �ٲ�
		System.out.println(s); //116korea
		
	}

}
