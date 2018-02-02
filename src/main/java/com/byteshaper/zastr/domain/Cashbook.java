package com.byteshaper.zastr.domain;

import javax.persistence.Entity;

/**
 * Toplevel entity. A user can have 0..n cashbooks to collect different expenses, e.g. private and work-related.
 * 
 * @author Henning Schütz
 *
 */
@Entity
public class Cashbook extends AbstractEntity {
  
}
