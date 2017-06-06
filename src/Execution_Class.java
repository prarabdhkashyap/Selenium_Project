import java.io.IOException;

public class Execution_Class {

	public static void main(String[] args) throws IOException {

		Common_Methods
				.openBrowser("firefox", Common_Methods.getProperty("URL"));
		Common_Methods.findElement("id", "email");
		Common_Methods.typeAndEnter("deepak2020rana@gmail.com");

	}

}
