
public class ThreadA extends Thread {
	/*public ThreadA() 
	{
		setName("ThreadA");
	}
	
	public void run()
	{
		for(int i = 0;i<2;i++)
		{
			System.out.println(getName() + "가 출력한 내용");
		}
	}*/
	public boolean stop = false;
	public boolean work = true;
	
	public void run()
	{
		while(!stop)
		{
			if(work)
			{
				System.out.println("ThreadA 작업 내용");
			}
			else
			{
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료.");
	}
}
