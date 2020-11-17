package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  
  /**
  * @param this parm is bla bla
  * @return this returns blabla
  */
  public final String greet(final String someone) {
    return String.format("Hello you, %s!", someone);
  }
}
