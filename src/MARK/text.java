package MARK;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class text {
	
	public static void main(String[] args) {
     show("23:30");
	}

	//9:30-17:30
	public static void show(String str){
		long nd = 1000 * 24 * 60 * 60;
	    long nh = 1000 * 60 * 60;
	    long nm = 1000 * 60;
	    long day,min,hour;
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
		 try {
			Date start=sdf.parse(str);
			Date now=new Date();
			long diff=now.getTime()-start.getTime();
			 day = diff / nd;
			 hour = diff % nd / nh;
			// 计算差多少分钟
		     min = diff % nd % nh / nm;
		     System.out.println(day);
		     System.out.println(hour);
		     System.out.println(min);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
