import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args)
	{
		int[] scores = { 99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: " + index);
		
		String[] names= { "Chayo", "Jihye", "DongGun"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "Jihye");
		System.out.println("찾은 인덱스: " + index);
		
		MemberName m1 = new MemberName("Chayo");
		MemberName m2 = new MemberName("Jihye");
		MemberName m3 = new MemberName("DongGun");
		
		MemberName[] members = { m1,m2,m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: " + index);
	}
}
