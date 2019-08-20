import java.io.IOException;

public class StackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("in m3()");
			m1();
			System.out.println("i'm in m3()");
		}
		catch(Exception e)
		{
			System.out.println("..........");
			
			e.printStackTrace();
			System.out.println(e);
			System.out.println("vkujb in m3()");
		}
	}

	static void m1() throws IOException 
	{
		System.out.println("in m1()");
		m2();
	}
	static void m2() throws IOException
	{
		System.out.println("in m2()");
		m3();
	}
	static void m3() throws IOException
	{
		System.out.println("in m3()");
		
		throw new IOException();
		
	}
}
