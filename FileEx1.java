import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream obj=new FileInputStream("C:\\Users\\JAYAPRAKASH\\eclipse-workspace\\FileHandlingEx\\src\\inputoutput.java");
		System.out.println(obj.available());
	}

}
