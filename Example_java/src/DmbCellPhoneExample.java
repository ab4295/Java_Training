
public class DmbCellPhoneExample {
	public static void main(String[] args)
	{
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바","black",10);
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		System.out.println("채널: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
	}
}
