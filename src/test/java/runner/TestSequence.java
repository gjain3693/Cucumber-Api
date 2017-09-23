package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:features/_1api.feature"},glue={"testsuite"},format={"pretty"})


public class TestSequence {
	


}
