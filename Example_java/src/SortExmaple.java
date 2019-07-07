import java.util.Arrays;
public class SortExmaple {
	public static void main(String[] args)
	{
		int[] scores = { 99,97,98 };
		Arrays.sort(scores);
		for(int i = 0;i<scores.length;i++)
		{
			System.out.println("scores[" + i + "]: " + scores[i]);
		}
		System.out.println();
		
		String[] names = { "Chayo", "Jihye", "DongGun"};
		Arrays.sort(names);
		for(int i = 0;i<names.length;i++)
		{
			System.out.println("names[" + i + "]: " + names[i]);
		}
		System.out.println();
		
		MemberName m1 = new MemberName("Chayo");
		MemberName m2 = new MemberName("Jihye");
		MemberName m3 = new MemberName("DongGun");
		
		MemberName[] members = { m1,m2,m3 };
		Arrays.sort(members);
		
		for(int i = 0;i<members.length;i++)
		{
			System.out.println("members[" + i + "].name: " + members[i].name);
		}
		System.out.println();
		
	}
}
