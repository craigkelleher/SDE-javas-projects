package com.javatunes.accounting;

import java.sql.Date;

import com.galvanize.SalariedEmployee;

public class SalariedCitizenPayCalculator
implements PayCalculator {
  private static final Date bonusBeforeDate = Date.valueOf("2010-12-31");
  private static final double bonusFactor = 0.1;
  private SalariedEmployee emp;  // back-reference to Employee
  
  public SalariedCitizenPayCalculator(SalariedEmployee emp) {
    this.emp = emp;
  }
  
  @Override
  public double amount() {
    double salary = emp.getSalary();
    Date hireDate = emp.getHireDate();
    
    if (hireDate.compareTo(bonusBeforeDate) < 0) {
      salary = salary * (1.0 + bonusFactor);
    }
    return salary;
  }
}