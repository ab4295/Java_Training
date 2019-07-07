import java.time.*;
import java.time.chrono.*;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args)
	{
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println("시작일: " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2019, 6,18,10,0,0);
		System.out.println("종료일: " + endDateTime);
		
		if(startDateTime.isBefore(endDateTime))
		{
			System.out.println("proccessing....." + "\n");
		}
		else if(startDateTime.isEqual(endDateTime))
		{
			System.out.println("The end." + "\n");
		}
		else if(startDateTime.isAfter(endDateTime))
		{
			System.out.println("ended." + "\n");
		}
		
		System.out.println("[종료까지 남은 시간]");
		long remainYear = startDateTime.until(endDateTime,ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시간: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond);
		
		System.out.println("[종료까지 남은 기간]");
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print(period.getMonths() +"달");
		System.out.println(period.getDays() + "일\n");
		
		Duration duration = Duration.between(startDateTime.toLocalTime(),endDateTime.toLocalTime());
		System.out.println("남은 초: " + duration);
	}
}
