import java.text.MessageFormat;

public class MessageFormatExample {
	public static void main(String[] args)
	{
		String id = "java";
		String name = "Chayo";
		String tel = "010-3630-4295";
		
		String text = "회원ID:{0} \n회원 이름: {1} \n회원 전화 {2}";
		String result = MessageFormat.format(text,id,name,tel);
		System.out.println(result);
		System.out.println();
		
		String sql = "insert into number values ({0},{1},{2})";
		Object[] arguments = { "'java'", "'Chayo'", "'010-3630-4295'" };
		String result2 = MessageFormat.format(sql,arguments);
		System.out.println(result2);
	}
}
