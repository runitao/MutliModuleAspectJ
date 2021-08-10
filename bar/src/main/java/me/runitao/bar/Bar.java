package me.runitao.bar;

import me.runitao.validation.api.InternalStateValidationException;

public class Bar {

  public static void main(String[] args) {
    try {
      BarValidation bv = new BarValidation(3);
      bv.validateInternalState();
    } catch (InternalStateValidationException e) {
      e.printStackTrace();
    }
    System.out.println("Validate Bar");
  }
}
