package com.byteshaper.zastr.domain;

import javax.persistence.ManyToOne;

/**
 * Categories belongs either to a project (meaning they are toplevel categories) or to a parent category.
 * {@link SingleExpense}s always belong to a {@link Category}.
 * 
 * So exactly either {@link #cashbook} or {@link #parent} need to be non-null
 * 
 * @author Henning Schütz
 *
 */
public class Category extends AbstractEntity {

  @ManyToOne
  private Cashbook cashbook;
  
  @ManyToOne
  private Category parent;
}
