package com.byteshaper.zastr.domain.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class SingleExpense extends AbstractEntity {

  @NotNull
  private LocalDate dayOfExpense;
}
