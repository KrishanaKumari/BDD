package api.cucumber.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"C:\\Users\\rajee\\IdeaProjects\\BDD\\src\\test\\java\\api\\cucumber\\features\\posts.feature"},glue = {"api.cucumber.steps"},
       // plugin = {"pretty","html:target/HtmlReports"})
 //plugin = {"pretty","json:target/Report.json"})
 plugin = {"pretty","junit:target/Report.xml"}, tags = "@SmokeTest")


public class PostRunner {
}
