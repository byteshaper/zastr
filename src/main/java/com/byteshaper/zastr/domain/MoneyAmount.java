package com.byteshaper.zastr.domain;

import java.math.BigDecimal;
import javax.persistence.Embeddable;

@Embeddable
public class MoneyAmount {
    
    private BigDecimal amount;
    
    public String getFormatted() {
        return ""; // TODO get locale somehow from cashbook and use NumberFormat.getCurrencyInstance(locale)
    }
}
