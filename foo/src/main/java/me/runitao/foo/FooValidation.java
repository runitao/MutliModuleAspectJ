package me.runitao.foo;

import me.runitao.validation.api.InternalStateValidationException;
import me.runitao.validation.api.Validatable;

public class FooValidation implements Validatable {

  private int foo;

  public FooValidation(int foo) {
    this.foo = foo;
  }

  @Override
  public void validateInternalState() throws InternalStateValidationException {
    if (this.foo < 0) {
      throw new InternalStateValidationException("Foo should be positive");
    }
  }


}
