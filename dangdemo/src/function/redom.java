package function;

public class redom {

	 
	     public  String romder(){
	    	 String sum = "100";
	    	   int a[] = new int[10];
	           for (int i = 0; i <= 3; i++) {
	               a[i] = (int) (Math.random() * 10); 
	               sum += a[i++]; 
	           } 
			return sum;
	    	 
	     }
	     

}
