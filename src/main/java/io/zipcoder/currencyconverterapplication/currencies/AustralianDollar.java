package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.AUSTRALIAN_DOLLAR;

public class AustralianDollar implements ConvertableCurrency {

    public AustralianDollar(){

    }
    @Override
    public String toString(){
        return String.valueOf(AUSTRALIAN_DOLLAR);
    }
}
