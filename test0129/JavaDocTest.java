package test0129;

public class JavaDocTest {
	/** 문서화 주석(doc주석)
	 * 짝수인지 판별하는 메소드
	 * <p> 정수를 2로 나누어 나머지가 0이면 짝수이다.</p>
	 * @param num	짝수인지 판별하기 위한수 <code>int</code>
	 * @return 		짝수 여부를 반환 <code>boolean</code>
	 */
	public boolean isEven(int num) {
		return num % 2 == 0;
		
		
	}
}
