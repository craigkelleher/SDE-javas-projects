package com.javatunes.personnel;

import static gov.irs.TaxPayer.SALARIED_TAX_RATE;
import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee emp;

  @Before
  public void setUp(){
    emp = new SalariedEmployee("Steven Jobless", new Date(120, 2, 15), 15000000D);
  }

  @Test
  public void testPay() {
    // because we are returning double, how many decimals points of accuracy to compare
    assertEquals(15000000D, emp.pay(), 0.001);
  }

  @Test
  public void testPayTaxes() {
    double expected = SALARIED_TAX_RATE * 15000000D;
    //get actual value of taxes, invoke method of test
    double actual = emp.payTaxes();
    // expected always first, actual second, and a tolerance last (delta)
    assertEquals(expected, actual, 0.001);
  }
}