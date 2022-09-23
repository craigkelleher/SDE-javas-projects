/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

//Abstract class cant instantiate, but there can be constructors and abstract methods
public abstract class Product {
  private String code;

  public Product(String code) {
    this.code = code;
  }
  
  public String getCode() {
    return code;
  }
  
  public abstract Double getPrice();
  
  @Override
  public String toString() {
    return getClass().getSimpleName() + "(" + getCode() + ")";
  }
}