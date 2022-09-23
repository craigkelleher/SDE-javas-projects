/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.Collection;

public class Order {
  private String id;
  
  public Order(String id) {
    this.id = id;
  }


  public void processCart(ShoppingCart<? extends Product> cart) {
    System.out.println("Order: " + getId() + " contains:");

    Collection<? extends Product> cartItems = cart.allItems();
    for (Product product : cartItems){
      System.out.println(product.getCode());
    }
    System.out.println("Order Total: " + cart.total());
  }
  
  public String getId() {
    return id;
  }
}