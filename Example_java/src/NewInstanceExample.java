
public class NewInstanceExample {
	public static void main(String[] args)
	{
		try {
			Class clazz = Class.forName("Example_java.SendAction.java");
			Action action = (Action)clazz.newInstance();
			action.excute();
		} catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(InstantiationException e)
		{
			e.printStackTrace();
		}
		catch(IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}
}
