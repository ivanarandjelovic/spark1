package org.aivan.spark1;

import static spark.Spark.*;
import static org.aivan.spark1.util.JsonUtil.*;

public class Spark1 {
	public static void main(String[] args) {
		staticFiles.location("/public");
		get("/hello", (req, res) -> dataToJson(new Hello("ola")));
	}
}

class Hello {

	String message;

	public Hello(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}