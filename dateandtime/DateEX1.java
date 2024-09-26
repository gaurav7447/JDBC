package com.dateandtime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Date */
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate yesterday=today.minusDays(1);//getting yesterday by using minus to current date
		System.out.println(yesterday);
		
		boolean leap=today.isLeapYear(); //checking leap year or not
		System.out.println(leap);
		
		int day=today.getDayOfYear(); //getting count of present day in this year
		System.out.println(day);
		
		LocalDate nextday=today.plusDays(4);   //getting nextday which we want
		System.out.println(nextday);
		System.out.println("-----------------------------------------------");
		
		
		/*TIME */
		LocalTime time=LocalTime.now(); //getting current time
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.plusHours(5));//increase hour by specifying additional time
		System.out.println(time.minusHours(12));  //minus the hours 
		System.out.println(time.NOON); //show in which duration we are now like 6 12 18 00
		
		
		/*local data and time*/
		
		LocalDateTime dnt=LocalDateTime.now();
		System.out.println(dnt);  //it show current date and time as yyyy-mm-dd T time   T separates date and time which refers time.
        System.out.println(dnt.toString());  //give time in sting format
        System.out.println("-----------------------------------------------");
        
        //converting string to date
        String randomDate="1996-04-14";
        DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd");  //here we take M capital because small m identify minutes and big M denotes Months.And this date format should match which we are giving.
        LocalDate day1=LocalDate.parse(randomDate,format);
        System.out.println(day1);//it prints date in date format not in string format.
        System.out.println(day1.isLeapYear());//check leap or not.
        
        System.out.println("-----------------------------------------------");
        
        /*time zone*/
        
        ZonedDateTime zn=ZonedDateTime.now(); //gives time and date with time zone IST
        System.out.println(zn);
        
        ZoneId india=ZoneId.of("Asia/Calcutta");
        ZoneId japan=ZoneId.of("Asia/Tokyo");
        
        LocalTime t1=LocalTime.now(india);
        LocalTime t2=LocalTime.now(japan);
        
        System.out.println(t1); //show time zone id
        System.out.println(t2);
        
        System.out.println(t2.isAfter(t1)); //print boolean value on condition check t1 and after or not
        
        System.out.println("-----------------------------------------------");
        /*Random value with of method*/
        LocalDate d2=LocalDate.of(2020, 02, 05);
        System.out.println(d2);
        
        LocalDateTime dandt=LocalDateTime.of(1996, 04, 14, 21, 28);  
        System.out.println(dandt);
      
        
	

	}

}
