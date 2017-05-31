import java.io.IOException;


public class Execution_Class extends Common_Methods {

	public static void main(String[] args) throws IOException {
		Execution_Class test = new Execution_Class();
		
		test.openBrowser("firefox", test.getProperty("URL"));
		test.findElement("id", "email");
		test.typeAndEnter("deepak2020rana@gmail.com");
		
	}

}
