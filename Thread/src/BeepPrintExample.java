import java.awt.*;
//use main thread.
public class BeepPrintExample {
	public static void main(String[] args)
	{
		/*Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0;i<5;i++)
		{
			toolkit.beep();
			try { Thread.sleep(500);} catch(Exception e) {}
		}*/
		
		Runnable beepTask = new BeepTask(); //interface객체 먼저 생성.
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i = 0;i<5;i++)
		{
			System.out.println("beep!!");
			try { Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
