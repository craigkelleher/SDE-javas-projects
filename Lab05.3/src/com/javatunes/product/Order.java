/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import com.javatunes.billing.Location;
import com.javatunes.billing.TaxCalculator;
import java.util.Collection;

public class Order {
  private String id;
  private Location place;
  private double totalCost;
  
  public Order(String id) {
    this.id = id;
  }

  public Order(String id, Location place){
    this.id = id;
    this.place = place;
  }
  
  /**
   * DONE:
   * get the items from the cart and iterate over them, print each item's product code
   * get cart total and print
   */

  public double getTax(){
    TaxCalculator taxCalc = TaxCalculator.getInstance(place);
    return taxCalc.taxAmount(totalCost);
  }

  public void processCart(ShoppingCart<? extends Product> cart) {
    System.out.println("Order: " + getId() + " contains the following:");
    
    Collection<? extends Product> cartItems = cart.allItems();
    for (Product product : cartItems) {
      System.out.println(product.getCode());
    }
    double total = cart.total();
    System.out.println("Order Total: " + total);
    totalCost = total;
  }
  
  public String getId() {
    return id;
  }

  public void setPlace(Location place){
    this.place = place;
  }

  public Location getPlace(){
    return this.place;
  }

  public double getTotalCost() {
    return totalCost;
  }
}