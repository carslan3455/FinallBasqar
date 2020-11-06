package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class _00_Hooks {

    @Before
    public void before(Scenario scenario){

        System.out.println(scenario.getName() + " : has been started");
    }

    @After
    public void after(Scenario scenario){

        System.out.println(scenario.getName() + " : " + scenario.getStatus());

    }

}
