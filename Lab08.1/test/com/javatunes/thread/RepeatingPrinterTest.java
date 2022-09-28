/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class RepeatingPrinterTest {

  //these each threads are sleeping for about a second and run asyoncronously.
  // these threads are running at the same time.
  public static void main(String[] args) {
    Thread thd1 = new Thread(new RepeatingPrinter());
    thd1.start();
    
    // initialize the 'printer' reference variable with a block lambda
    // hint: you can copy / paste the *contents* of RepeatingPrinter's run() method
    // note: change the sysout to show "block-lambda"
    Runnable printer = () -> {
      //statement lambda to be our implementation of runnable
      while (true) {
        System.out.println("block-lambda");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          // Ignore exception; not serious
        }
      }
    };
    
    // create another Thread, passing in the 'printer' reference as its Runnable - then start it
    // create another thread, using this runnable and start it
    new Thread(printer).start();
  }
}