package tt;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class time {

	public static void main(String[] args) {
		
//		// TODO Auto-generated method stub
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//    //    System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
//        System.out.println(dtf.format(LocalDateTime.now()));
//        System.out.println(LocalDateTime.now());
//		Date date = new Date();
//		System.out.print(date);
		String months[] = {
			      "01", "02", "03", "04",
			      "05", "06", "07", "08",
			      "09", "10", "11", "12"};
			      
			      String year;
			     
			      GregorianCalendar gcalendar = new GregorianCalendar();
			      System.out.print(gcalendar.get(Calendar.YEAR)+months[gcalendar.get(Calendar.MONTH)]+gcalendar.get(Calendar.DATE) + "");
//			      System.out.print(1);
//			      System.out.print( gcalendar.get(Calendar.DATE) + " ");
			      
		

	}

}
