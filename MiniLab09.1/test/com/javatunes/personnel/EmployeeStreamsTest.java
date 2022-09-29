/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Before;
import org.junit.Test;

public class EmployeeStreamsTest {

  private Collection<Employee> allEmployees;

  @Before
  public void setUp() {
    allEmployees = Department.getDepartment().getEmployees();
  }

  /**
   * TASK: find all Employees with salary < 40000.0 and sort them by natural order.
   * Employee implements Comparable: natural order is id increasing.
   *
   * RESULT: Employees 2 and 15, in that order.
   */
  @Test
  public void testSalaryLessThanSortNaturalOrder() {
    List<Employee> employees = allEmployees //collection, all collections can be turned into strings
        .stream()                           //because Collections has a streams method
        .filter(emp -> emp.getSalary() < 40000.0)  //do some filtering (nothing happened yet)
        .sorted()  // natural order
        .collect(Collectors.toList()); //nothing happened until this terminal operation

    assertEquals(2, employees.size());
    // employee is a list
    assertEquals(Long.valueOf(2),  employees.get(0).getId());
    assertEquals(Long.valueOf(15), employees.get(1).getId()); //employees: size =2
  }
}