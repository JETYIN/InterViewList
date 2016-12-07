package MARK;

import java.util.Scanner;
import java.util.regex.Pattern;

public class test {
	 public static final Pattern WIFI_NAME_PATTERN = 
		 Pattern.compile("^(xinlai)[0-9]*$");
	 
public static void main(String[] args) {
	/*String expStr="(xinlai)[0-9]*";
	System.out.println("enter :");
	String str=new Scanner(System.in).next();
	if((Pattern.compile(expStr).matcher(str)).matches()){
		System.out.println("yes");
		
	}*/
	 /* if ((WIFI_NAME_PATTERN.matcher("xinlai")).matches()) {
		  System.out.println("true");
	  }else System.out.println("false");*/
	System.out.println(show("12345"));
	
}
public static  String show(String str){
	int length=str.length();
	String s=str.substring(1,length-2);
	return s;
	
}
}
