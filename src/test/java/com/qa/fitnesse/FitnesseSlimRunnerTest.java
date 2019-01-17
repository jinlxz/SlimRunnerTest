package com.qa.fitnesse;
import org.junit.runner.RunWith;
import fitnesse.junit.FitNesseRunner;

@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite(systemProperty="suiteToRun")
@FitNesseRunner.FitnesseDir("src/main/resources")
@FitNesseRunner.OutputDir("target")
@FitNesseRunner.SuiteFilter(systemProperty="includeTags")
@FitNesseRunner.ExcludeSuiteFilter(systemProperty="excludeTags", value = "")
public class FitnesseSlimRunnerTest {
	public static void main(String [] args){
		System.currentTimeMillis();
	}
}
