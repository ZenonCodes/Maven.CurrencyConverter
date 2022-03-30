package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.*;

public class USDollar implements ConvertableCurrency {

    public USDollar(){

    }
    @Override
    public String toString(){
        return String.valueOf(US_DOLLAR);
    }
}
