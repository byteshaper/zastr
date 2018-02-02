package com.byteshaper.zastr.domain;

import java.math.BigDecimal;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class MoneyAmount {

	@NotNull
	private BigDecimal amount;

	@NotNull
	private Currency currency;
	
	@SuppressWarnings("unused")
	private MoneyAmount() {}
	
	public MoneyAmount(BigDecimal amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
}
