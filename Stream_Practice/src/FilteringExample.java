import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Chayo1","Chayo1","CSong","hehe","Wisdom");
		
		names.stream()
		.distinct()
		.forEach(n->System.out.println(n));
		System.out.println();
		
		names.stream()
		.filter(n->n.startsWith("C"))
		.forEach(n->System.out.println(n));
		System.out.println();
		
		names.stream()
		.distinct()
		.filter(n->n.startsWith("C"))
		.forEach(n->System.out.println(n));
	}
}
