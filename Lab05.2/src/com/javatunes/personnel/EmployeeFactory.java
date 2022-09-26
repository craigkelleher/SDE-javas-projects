/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.sql.Date;
import java.util.Map;

public class EmployeeFactory {
  
  // prevent direct instantiation - this is an all-static factory class
  private EmployeeFactory() {
  }
  
  /**
   * TODO: given the input map, create and return the correct object (with its properties set).
   * If the input map's "type" value is not "HE" or "SE", throw IllegalArgumentException with a suitable message.
   */
  public static Employee createEmployee(Map<String,String> inputMap)
  throws IllegalArgumentException {
    // return value
    Employee emp = null;

    //reads a map and tries to create correct Employee type via type entry
    String type = inputMap.get("type");
    //TODO if type is not equal to HE or SE then trhow illegalargument exception
    //TODO read the name and hireDate form inputMap.
    // take a string and make it an instance of double class
    // the map are strings, but hireDate is java.sql.Date
    //TODO if type is HE, then read and parse rate and hours from inputMap
    //TODO if type is equal to SE, then read and parse salary from inputMap
    //TODO create an instance of HourlyEmployee or SalariedEmployee, with the values read from inputting
    //   the values read from inputMap

    if ("SE".equals(type)){
      SalariedEmployee salariedEmp = new SalariedEmployee();
      salariedEmp.setName(inputMap.get("name"));
      salariedEmp.setHireDate(Date.valueOf(inputMap.get("hireDate")));
      salariedEmp.setSalary(Double.valueOf(inputMap.get("salary")));
      emp = salariedEmp;
    }
    else if ("HE".equals(type)) {
      HourlyEmployee hourleyEmp = new HourlyEmployee();
      hourleyEmp.setName(inputMap.get("name"));
      hourleyEmp.setHireDate(Date.valueOf(inputMap.get("hireDate")));
      hourleyEmp.setRate(Double.valueOf(inputMap.get("rate")));
      hourleyEmp.setHours(Double.valueOf(inputMap.get("hours")));
      emp = hourleyEmp;
    }
    else{
      throw new IllegalArgumentException("Invalid type: " + type);
    }

    return emp;
  }
}