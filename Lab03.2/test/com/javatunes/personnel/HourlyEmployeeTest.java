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
    emp = new HourlyEmployee("Steve Jobs", new Date(120, 2, 15));
  }

  // Junit in control here, Junit invokes pay as a test, not me.
  @Test
  public void testPay() {
    fail("Test not yet implemented"); //TODO Implement test of HourleyEmployee.pay()
  }

  @Test
  public void testPayTaxes() {
  }
}