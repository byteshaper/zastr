package com.byteshaper.zastr.domain;

import javax.persistence.Embeddable;

/**
 * Encapsulates a money amount. The {@link #amount} property represents the amount as subunit (e.g. Cent in case of EUR or USD).
 * 
 * @author Henning Schütz
 *
 */
@Embeddable
public class MoneyAmount {

  private long amount;
  
  public MoneyAmount() {}
  
  public MoneyAmount(long amount) {
    this.amount = amount;
  }

  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }
}
