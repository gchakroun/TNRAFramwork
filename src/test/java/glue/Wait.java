package glue;

import io.cucumber.java.en.When;

public class Wait {

	@When("^Wait for \"(.*)\" seconds$")
	public void wait_for_x_seconds(String miliseconds) throws Throwable {
//		System.out.println("Wait for : " + miliseconds + " seconds");
		Thread.sleep(Integer.parseInt(miliseconds) * 1000);

	}
}
