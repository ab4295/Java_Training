
public class StringSplitExample {
	public static void main(String[] args)
	{
		String text = "Chayo&jijibebe,mola,haha-molala";
		
		String[] names = text.split("&|,|-"); //파이프 기호로 연결한 정규표현식을 사용한다.
		
		for(String name : names)
		{
			System.out.println(name);
		}
	}
}
