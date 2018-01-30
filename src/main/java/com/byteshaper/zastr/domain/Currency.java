package com.byteshaper.zastr.domain;

import java.util.Locale;
import javax.persistence.Embeddable;

@Embeddable
public class Currency {
    
    /**
     * 2-digit language code as used in {@link Locale}
     */
    private String languageCode;
    
    /**
     * 2-digit country code as used in {@link Locale}
     */
    private String countryCode;
    
    /**
     * 3-digit currency code as in {@link java.util.Currency}
     */
    private String currencyCode;
    
    
}
