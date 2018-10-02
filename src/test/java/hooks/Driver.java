package hooks;

import com.thoughtworks.gauge.*;

public class Driver {
    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("Code for before suite");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("Code for after suite");
    }

    @BeforeSpec
    public void BeforeSpec() {
        System.out.println("Code for before spec");
    }

    @AfterSpec
    public void AfterSpec() {
        System.out.println("Code for after spec");
    }

    @BeforeScenario
    public void BeforeScenario() {
        System.out.println("Code for before scenario");
    }

    @AfterScenario
    public void AfterScenario() {
        System.out.println("Code for after scenario");
    }

    @BeforeStep
    public void BeforeStep() {
        System.out.println("Code for before step");
    }

    @AfterStep
    public void AfterStep() {
        System.out.println("Code for after step");
    }
}
