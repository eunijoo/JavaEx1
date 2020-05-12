package test0130;

public class StringEx {
	public static void main(String[] args) {
		String s;
		//문자열 + xxxx => 문자열(결합)
		s="korea"+9+3;   // 연산순서:("korea"+9) +3
		System.out.println(s); //korea93
		
		s=9+3+"korea"; //정수9+정수3+korea
		System.out.println(s); //12korea
		
		s="korea"+'A'+3; // ("korea"+'A') +3 => 문자열+문자 +정수3
		System.out.println(s); //koreaA3
		
		s='A'+'0'+3+"korea";  //문자A+문자0+정수3+korea =>문자가 정수로 바껴서 계산 65+48+3+korea(정수끼리계산할떄만 문자가 정수로 바뀜
		System.out.println(s); //116korea
		
	}

}
