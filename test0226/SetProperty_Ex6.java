package test0226;

import java.io.FileOutputStream;
import java.util.Properties;

public class SetProperty_Ex6 {
	public static void main(String[] args) {
	//Hashtable(아버지) 클래스를 상속받음
	//키와 값이 문자열만 가능
	//파일 저장 및 불러오기가 간단해서 환경설정 등에서 많이 사용.
		Properties p=new Properties();
		
	//키와 값을 저장
	// put() 메소드를 사용할수 있지만 권장하지 않음(아버지꺼를 전부 쓸 순 있지만 그런 목적으로 만들어진게 아니기때문에 안쓰는게 좋음
		p.setProperty("자바", "80");
		p.setProperty("스프링", "90");
		p.setProperty("서블릿", "85");
		p.setProperty("오라클", "90");
		p.setProperty("HTML", "100");		
		
		String pathname ="subject.properties";
		try(FileOutputStream fos =new FileOutputStream(pathname)) {
			p.store(fos, "과목별 성적");
			System.out.println("파일에 저장 완료...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	
