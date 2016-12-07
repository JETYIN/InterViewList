package MARK;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MyDate {
	public static void main(String[] args) {
		
		
	}
public static void show(){
	Date date=new Date();
	SimpleDateFormat sp=new SimpleDateFormat("hh:mm:ss");
	System.out.println(sp.format(date));
}
}
