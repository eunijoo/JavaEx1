package score1_0212;
//Á¡¼ö °è»ê
public class Score {

//ÃÑÁ¡	
	public int getTot(int[] s) {
		int result=0;
		
		for(int i=0;i<s.length;i++) { //i:±¹,¿µ,¼ö //s.length : °ú¸ñ °¹¼ö
			result+=s[i]; //±¹,¿µ,¼ö ÇÕ»ê
		}
		return result;
	}

//Æò±Õ
	public int getAve(int[] s) {
		return getTot(s)/s.length; // ÃÑÁ¡/°¹¼ö
	}
	
//ÇÐÁ¡	
	public double grade(int s) {
		double result=0;

		if(s>=95) {
			result=4.5;
		}else if(s>=90){
			result=4.0;	
		}else if(s>=85){
			result=3.5;	
		}else if(s>=80){
			result=3.0;	
		}else if(s>=75){
			result=2.5;
		}else if(s>=70){
			result=2.0;
		}else if(s>=65){
			result=1.5;
		}else if(s>=60){
			result=1.0;
		}		
		return result;
	}	
}
