public class Ex004_break {
	public static void main(String[] args) {
/*
		break label ¿¹Á¦
*/

/*		
        int i, j, k;
        i = j = k = 0;
        
	    while(true) {
	    	i++;
	        while(true) {
	        	j++;
	            while(true) {
	            	k++;
	                if ((i+j+k) >= 10) break;
	                System.out.println(i+", "+j+", "+k);
	            }
	            break;
	        }
	        break;
	    }
*/

        int i, j, k;
        i = j = k = 0;
        
        gogo :
	    while(true) {
	    	i++;
	        while(true) {
	        	j++;
	            while(true) {
	            	k++;
	                if ((i+j+k) >= 10) break gogo;
	                System.out.println(i+", "+j+", "+k);
	            }
	        }
	    }
		
	}
}
