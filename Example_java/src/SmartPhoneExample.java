
public class SmartPhoneExample {
	public static void main(String[] args)
	{
		SmartPhone myPhone = new SmartPhone("google","Android");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone); /* myPhone.toString()을 자동 호출하여 리턴값을 얻은 후 출력.*/
	}
}
