package me.runitao.bar;

import me.runitao.validation.api.InternalStateValidationException;
import me.runitao.validation.api.Validatable;

public class BarValidation implements Validatable {

  private int bar;

  public BarValidation(int bar) {
    this.bar = bar;
  }

  @Override
  public void validateInternalState() throws InternalStateValidationException {
    if (this.bar > 0) {
      throw new InternalStateValidationException("Bar should be negative");
    }
  }


}
