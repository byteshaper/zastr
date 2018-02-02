package com.byteshaper.zastr.domain;

import javax.persistence.Embeddable;

@Embeddable
public enum Currency {
    
    EUR, 
    JPY, 
    CAD, 
    CHF,
    USD, 
    GBP; // to be continued

}
