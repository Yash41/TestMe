import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class yash {
	@Given("^I have some cakes in my hand$")
	public void i_have_some_cakes_in_my_hand() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("given");
	}

	@When("^I wait for some hour$")
	public void i_wait_for_some_hour() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("when");
	}

	@Then("^my cakes will disapper$")
	public void my_cakes_will_disapper() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("then");
	}
}
