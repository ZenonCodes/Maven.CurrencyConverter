package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.*;

public class Franc implements ConvertableCurrency {
    public Franc(){

    }
    @Override
    public String toString(){
        return String.valueOf(FRANC);
    }
}
