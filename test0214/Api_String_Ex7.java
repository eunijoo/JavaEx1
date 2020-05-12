package test0214;
/*
 1~100까지 수를 한줄에 10개씩 출력하되, 
 수 중 3,6,9가 존재하는 경우 숫자대신
 3,6,9 숫자만큼   * 출력

=> 3,6,9 게임
*/
public class Api_String_Ex7 {
	public static void main(String[] args) {
		
		String s;
	//3,6,9를 *로 바꿈	
		for(int i=1; i<=100;i++) {
			s=Integer.toString(i);
			s=s.replaceAll("3|6|9", "*");
		
	//0부터 찾아서, 숫자를 삭제함
			if(s.indexOf("*")>=0) {	
				s=s.replaceAll("\\d","");							
			}
	//출력	
			System.out.printf("%5s",s);
			
	//10개마다 엔터
			if(i%10==0) { 
				System.out.println();
			}
		}
		
	}
}
