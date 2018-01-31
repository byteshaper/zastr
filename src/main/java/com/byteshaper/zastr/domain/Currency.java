package com.byteshaper.zastr.domain;

import java.util.Arrays;
import java.util.Locale;
import javax.persistence.Embeddable;

@Embeddable
public enum Currency {
    
    EUR("DE"), 
    JPY("JP"), 
    CAD("CA"), 
    CHF("CH"),
    USD("US"), 
    GBP("GB"); // to be continued

    private final Locale locale;
    
    private Currency(String uppercaseTwoDigitCountryCode) {
        locale = Arrays
                .stream(Locale.getAvailableLocales())
                .filter(loc -> loc.getCountry().equals(uppercaseTwoDigitCountryCode))
                .findAny()
                .orElseThrow(() -> 
                    new IllegalArgumentException("No locale found for countrycode " + uppercaseTwoDigitCountryCode));
    }
    
    public Locale getLocale() {
        return locale;
    }
}
