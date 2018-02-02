package com.byteshaper.zastr.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public abstract class AbstractExpense extends AbstractEntity {

	@ManyToOne
	@NotNull
	protected Category category;

	@Embedded
	@NotNull
	@Valid
	protected MoneyAmount amount;

	protected String comment;

	@NotNull
	private LocalDateTime entryTimestamp;
}
