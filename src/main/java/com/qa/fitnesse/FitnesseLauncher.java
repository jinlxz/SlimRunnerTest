package com.qa.fitnesse;
import java.util.Arrays;

import org.apache.commons.lang3.Validate;

import fitnesseMain.FitNesseMain;

public class FitnesseLauncher {

  public static void main(String[] args) throws Exception {
    Validate.isTrue(args.length > 0 && args[0] != null, "Environment is needed as argument");
    String environmentId = args[0];
    System.setProperty("environmentId", environmentId);
    FitNesseMain.main(getFitNesseArguments(args));
  }

  private static String[] getFitNesseArguments(String[] args) {
    return Arrays.copyOfRange(args, 1, args.length);
  }

}