import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args)
	{
		List<Student> studentList = Arrays.asList(
				new Student("chayo1",92),
				new Student("chayo2",73),
				new Student("chayo3",65)
				);
		int sum1 = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		
		int sum2 = studentList.stream()
				.map(Student::getScore)
				.reduce((a,b)->a+b)
				.get();
		
		int sum3 = studentList.stream()
				.map(Student::getScore)
				.reduce(0,(a,b)->a+b);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}
