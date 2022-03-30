package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.*;

public class Pound implements ConvertableCurrency {

    public Pound(){

    }
    @Override
    public String toString(){
        return String.valueOf(POUND);
    }
}
