package com.byteshaper.zastr.domain;

import java.math.BigDecimal;
import java.text.NumberFormat;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class MoneyAmount {
    
	@NotNull
    private BigDecimal amount;
    
	@NotNull
    private Currency currency;
    
    public String getAmountFormatted() {
        return NumberFormat.getCurrencyInstance(currency.getLocale()).format(amount); 
    }
}
