package com.byteshaper.zastr.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Expense extends AbstractEntity {

  @ManyToOne
  @NotNull
  private Category category;
  
  @Embedded
  private MoneyAmount amount;
  
  private String comment;
  
  private LocalDate dayOfExpense;
  
  private LocalDateTime entryTimestamp;
}
