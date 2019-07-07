import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args)
	{
		List<Member> list = Arrays.asList(
				new Member("Chayo1",Member.MALE,30),
				new Member("Chayo2",Member.FEMALE,20),
				new Member("Chayo3",Member.MALE,40),
				new Member("Chayo4",Member.FEMALE,10),
				new Member("Chayo5",Member.MALE,50)
				);
		
		double ageAvg = list.stream()
				.filter(m->m.getSex() == Member.MALE)
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		
		System.out.println("Average Male: " + ageAvg);
	}
}
