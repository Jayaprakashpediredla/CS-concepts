import java.io.IOException;

class MyException extends Exception{
	String s1;
	MyException(String s2){
		s1=s2;
	}
	public String toString() {
		return ("Exception : "+s1);
	}
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new MyException("user defined exception my exception");
		}
		catch(MyException e)
		{
			System.out.println("Exception Handler");
			System.out.println(e);
		}
	}

}
