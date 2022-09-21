package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {

  private HourlyEmployee emp;

  @Before
  public void setUp(){
    // constructor is deprecated, if we gave it a long, it wouldn't be deprecated
    // if you put numbers after, an Int, and autoboxes it, it gets an Int
    // but an integer object does not have an is-a relationship with double, so
    // double cant be autoboxes, need to be moved from 25 to 25.0 or 25D
    // or even ,(double) 25, 40.0
    emp = new HourlyEmployee("Steve Jobs", new Date(120, 2, 15), 25D, 40.0);
  }

  // Junit in control here, Junit invokes pay as a test, not me.
  @Test
  public void testPay() {
    // java compiler, by default, it will treat decimals as double. if you want float or long, need l or f at end
    assertEquals(1000, emp.pay(), 0.001);
  }

  @Test
  public void testPayTaxes() {
    double expected = 250;
    //get actual value of taxes, invoke method of test
    double actual = emp.payTaxes();
    // expected always first, actual second, and a tolerance last (delta)
    assertEquals(expected, actual, 0.001);
    // assertEquals(250, emp.payTaxes(), 0.001);
  }
}