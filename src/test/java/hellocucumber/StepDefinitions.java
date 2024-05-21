package hellocucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today)? "TGIF" : "Nope";
    }
}

class IsItSaturday{
    static String isItSaturday(String today) {
        return "Saturday".equals(today)? "Nice" : "Nope";
    }
}

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void todayIs(String today) {
        this.today = today;
    }

    @When("I ask whether it´s Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @When("I ask whether it´s Saturday yet")
    public void iAskWhetherItSSaturdayYet() {
        actualAnswer = IsItSaturday.isItSaturday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectAnswer) {
        assertEquals(expectAnswer, actualAnswer);
    }

}
