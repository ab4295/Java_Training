import java.io.IOException;

public class KeyBoardToStringExample {
	public static void main(String[] args) throws IOException
	{
		byte[] bytes = new byte[100];
		
		System.out.print("input: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes,0,readByteNo-1);
		System.out.println(str);
	}
}
