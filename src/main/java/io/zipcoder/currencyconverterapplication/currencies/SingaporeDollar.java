package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.*;

public class SingaporeDollar implements ConvertableCurrency {
    public SingaporeDollar(){

    }
    @Override
    public String toString(){
        return String.valueOf(SINGAPORE_DOLLAR);
    }
}
