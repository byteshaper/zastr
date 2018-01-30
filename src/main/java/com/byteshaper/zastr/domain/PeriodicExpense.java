package com.byteshaper.zastr.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class PeriodicExpense extends AbstractEntity {

  @ManyToOne
  @NotNull
  private Category category;

  @Embedded
  @NotNull
  private MoneyAmount amount;
  
  private String comment;
  
  @NotNull
  private LocalDate firstOccurence;
  
  @NotNull
  @Enumerated(EnumType.STRING)
  private Frequency frequency;
  
  private LocalDate lastOccurence;
  
  @NotNull
  private LocalDateTime entryTimestamp;
}
