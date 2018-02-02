package com.byteshaper.zastr.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Toplevel entity. A user can have 0..n cashbooks to collect different expenses, e.g. private and work-related.
 * Optionally, the user can share a cashbook he owns with one or more other users. 
 * There is no detailed user permission management - users a cashbook is shared with can do all read and write
 * operations except sharing / unsharing the cashbook with other users or kicking out the owner.
 * 
 * @author Henning Schütz
 *
 */
@Entity
public class Cashbook extends AbstractEntity {
  
	@NotNull
	private User owner;
	
	private List<User> sharedWith;
}
