package demo.dd3;

import static spark.Spark.*;

public class DemoDD3 {

	public static void main(String args[]) {
		initializeApp();
	}
	
	public static void initializeApp() {
		 get("/hello", (req, res) -> "Hello World");
	}
}
