package com.byteshaper.zastr.domain;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import org.junit.Test;

public class PlaygroundTest {

    @Test
    public void bla() {
        BigDecimal amount = new BigDecimal("2.4567");
        BigDecimal amount2 = new BigDecimal("5");
        BigDecimal product = amount.multiply(amount2);
        System.out.println(product);
        System.out.println(product.setScale(2, BigDecimal.ROUND_HALF_DOWN));
        System.out.println(NumberFormat.getCurrencyInstance().format(product));
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("de", "CH")).format(product));
        System.out.println(new BigDecimal("1.8050").setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal("1.8049").setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal("5.00").divide(new BigDecimal(3), BigDecimal.ROUND_HALF_UP));
        System.out.println(5d / 3d);
        Currency.getAvailableCurrencies().forEach(System.out::println);
    }
}
