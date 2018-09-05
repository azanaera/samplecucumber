package stepdefs;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IsItFriday {
    private String today;
    private String actualAnswer;
    
    static String isItFriday(String today) {
        return "Nope";
    }
	
	
    @Given("^today is Sunday$")
    public void today_is_Sunday() {
        this.today = "Sunday";
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_is_s_Friday_yet() {
        this.actualAnswer = isItFriday(today);
    }

	@Then("I should be told {string}")
	public void i_should_be_told(String expectedAnswer) {
			assertEquals(expectedAnswer,actualAnswer);
	}

}
