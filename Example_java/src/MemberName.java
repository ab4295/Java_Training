
public class MemberName implements Comparable<MemberName>
{
	String name;
	MemberName(String name)
	{
		this.name = name;
	}
	@Override
	public int compareTo(MemberName o)
	{
		return name.compareTo(o.name);
	}
}
