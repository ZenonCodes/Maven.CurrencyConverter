package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.CANADIAN_DOLLAR;

public class CanadianDollar implements ConvertableCurrency {
    public CanadianDollar(){

    }
    @Override
    public String toString(){
        return String.valueOf(CANADIAN_DOLLAR);
    }
}
