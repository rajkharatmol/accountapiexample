package code.codility.app;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

public class AppConfiguratiojn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="011001";
		int testInt = Integer.parseInt(s);
		
		int num = 28;
		
		int div = num % 2;
		
		System.out.println("||"+div+"||");
		
		
		 int dividend = 10, divisor = 5;

	        int quotient = dividend / divisor;
	        int remainder = dividend % divisor;

	        System.out.println("The Quotient is = " + quotient);
	        System.out.println("The Remainder is = " + remainder);
	        
	        Properties props = System.getProperties();
	        props.setProperty("server.port", "8080");
	        
	        
	        Map<String, String> env = System.getenv();
	     
	        for(String key:env.keySet()) {
	        	System.out.println(key+"                  "+env.get(key));
	        }
	        
	        System.out.println(" ----------------------------------------------------------                 ");
	        
	        Properties prop = System.getProperties();
	       Enumeration enum1= prop.keys();
	       
	        while(enum1.hasMoreElements()) {
	        	String keyval= (String)enum1.nextElement();        	
	        	System.out.println(keyval+"                  "+prop.get(keyval));
	        }
	}

}
