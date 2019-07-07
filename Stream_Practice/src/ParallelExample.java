import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList(
				"Chayo1", "Chayo2", "Chayo3", "Chayo4", "Chayo5");
		
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
		System.out.println();
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
	} 
	
	public static void print(String str)
	{
		System.out.println(str + ":" + Thread.currentThread().getName());
	}
}
