package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.*;

public class UniversalCurrency implements ConvertableCurrency {

    public UniversalCurrency(){

    }
    @Override
    public String toString(){
        return String.valueOf(UNIVERSAL_CURRENCY);
    }
}
