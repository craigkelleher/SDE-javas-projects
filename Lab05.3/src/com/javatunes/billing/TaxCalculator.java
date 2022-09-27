/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.billing;

public interface TaxCalculator {

/*
  public static final double BASIC_RATE = 0.17;
  public static final double LUXARY_RATE = 0.25;
  public static final double LUXARY_THRESHOLD = 100.0;
*/

  public double taxAmount(double taxable);

/*
  @Override
  public double taxCalc(double taxable){
    return BASIC_RATE * taxable
        + ((taxable > LUXARY_THRESHOLD) ? (LUXARY_RATE * (taxable - LUXARY_THRESHOLD)): 0);
  }
*/

  static public TaxCalculator getInstance(Location place) {
    TaxCalculator taxCalc = null;

    switch (place){
      case USA:
        taxCalc = new USATax();
        break;
      case EUROPE:
        taxCalc = new EuropeTax();
        break;
      case ONLINE:
        taxCalc = new OnlineTax();
        break;
    }
    return taxCalc;
  }
}