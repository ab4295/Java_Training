
public class Car {
	String company = "현대자동차.";
	String model = "그랜저.";
	String color = "Black";
	int maxSpeed = 350;
	int speed;
	int gas;
	
	Car() {}
	Car(String model) /* 생성자 오버로딩 */
	{
		this(model,"은색", 150); //this() 는 생성자의 첫줄에서만 허용-> 다른 자기자신의 생성자를 호출하는 코드.
	}
	Car(String model,String color)
	{
		this(model, color,250);
	}
	Car(String model, String color, int maxSpeed)
	{
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void setGas(int gas)
	{
		this.gas = gas;
	}
	
	boolean isLeftGas()
	{
		if(gas == 0)
		{
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true;
	}
	
	void run()
	{
		while(true)
		{
			if(gas > 0)
			{
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -=1;
			}
			else
			{
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;
			}
		}
	}
}
