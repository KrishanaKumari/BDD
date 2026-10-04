package api.cucumber.hooks;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CucumberHooks {
    @Before
    public void setUp(){
        System.out.println("---before hook---");
    }
    @After
    public void tearDown(){
        System.out.println("---After hook---");
    }

    @BeforeStep
    public void setupSteps(){
        System.out.println("---BeforeStep---");
    }
    @AfterStep
    public void tearDownStep(){
        System.out.println("--AfterStep--");
    }
}
