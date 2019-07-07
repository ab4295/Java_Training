
public class type_casting {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = 10;
		byte byteValue2 = (byte)intValue;
		System.out.println(byteValue2);
		
		int intValue2 = 'A';
		char charValue2 = (char)intValue2;
		System.out.println(charValue2);
		
	}

}
