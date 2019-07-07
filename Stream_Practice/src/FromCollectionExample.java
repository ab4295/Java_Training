import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
	public static void main(String[] args)
	{
		List<Student> studentList = Arrays.asList(
				new Student("Chayo1",10),
				new Student("Chayo2",20),
				new Student("Chayo3",30));
		
		Stream<Student> stream = studentList.stream();
		stream.forEach(s->System.out.println(s.getName()));
	}
}
