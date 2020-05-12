package test0226;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

public class Properties_FileInputStream_Ex7 {
	public static void main(String[] args) {
		String pathname ="subject.properties";
		Properties p=new Properties();
		
		try(FileInputStream fis =new FileInputStream(pathname)) {
			p.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		p.list(System.out);
		String s=p.getProperty("자바");
		System.out.println("자바: "+s);
		
		System.out.println("전체...");
		Iterator<Object> it =p.keySet().iterator();
		
		while(it.hasNext()) {
			String k= (String)it.next();
			String v=p.getProperty(k);
			System.out.println(k+"->"+v);
		}
	}
}
	
