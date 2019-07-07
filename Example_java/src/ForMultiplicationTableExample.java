
public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int i = 2;i<10;i++)
		{
			System.out.println("******" + i +"*******");
			for(int j = 1;j<10;j++)
			{
				int result = i * j;
				System.out.println(i + "*" + j + "=" + result);
			}
			System.out.println();
		}
	}

}
