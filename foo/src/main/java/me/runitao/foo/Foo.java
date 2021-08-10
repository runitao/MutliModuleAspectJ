package me.runitao.foo;

public class Foo {

  public static void main(String[] args) {
    FooValidation fv = new FooValidation(3);
    fv.validateInternalState();
    System.out.println("Validate Foo");
  }
}
