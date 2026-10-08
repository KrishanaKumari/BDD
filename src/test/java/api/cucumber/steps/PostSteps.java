package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {

    @Given("User should be logged in and should be present at its own wall")
    public void userShouldBeLoggedInAndShouldBePresentAtItsOwnWall() {
        System.out.println("userShouldBeLoggedInAndShouldBePresentAtItsOwnWall");
        System.out.println("ABC Test");
    }

    @When("I type the message in the text box")
    public void iTypeTheMessageInTheTextBox() {
        System.out.println("iTypeTheMessageInTheTextBox");
    }


    @When("^I type the message as \"([^\"]*)\" in the text box$")
    public void i_type_the_message_as_in_the_text_box(String text) {
        System.out.println(text);
    }

    @And("Click on Post button")
    public void clickOnPostButton() {
        System.out.println("clickOnPostButton");
    }

    @Then("the message should get posted")
    public void theMessageShouldGetPosted() {
        System.out.println("theMessageShouldGetPosted");
    }
    @And("should be present on his own wall")
    public void shouldBePresentOnHisOwnWall(){
        System.out.println("shouldBePresentOnHisOwnWall");
    }

    @When("User supply the youtube link in the text box")
    public void user_supply_the_youtube_link_in_the_text_box() {
        System.out.println("user_supply_the_youtube_link_in_the_text_box");
    }
    @Then("then video should get posted on the user wall")
    public void then_video_should_get_posted_on_the_user_wall() {
        System.out.println("then_video_should_get_posted_on_the_user_wall");
    }

    @Then("the video should have proper thumbnail.")
    public void the_video_should_have_proper_thumbnail() {
        System.out.println("the_video_should_have_proper_thumbnail");
    }
    @When("^User supply the youtube link as \"([^\"]*)\" in the text box$")
    public void user_supply_the_youtube_link_as_in_the_text_box(String url) throws Throwable {
        System.out.println(url);
    }

}
