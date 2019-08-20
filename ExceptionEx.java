import java.io.*;
public class ExceptionEx {
	static void m1() throws FileNotFoundException //throws IOException
	{
		System.out.println("in method");
		throw new FileNotFoundException();
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		m1();
		//ExceptionEx ex=new ExceptionEx();
		//ex.m1();
		//System.out.println("main ends");
	}

}
