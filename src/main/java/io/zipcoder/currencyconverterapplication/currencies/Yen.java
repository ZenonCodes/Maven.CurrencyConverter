package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.YEN;

public class Yen implements ConvertableCurrency {

    public Yen(){

    }
    @Override
    public String toString(){
        return String.valueOf(YEN);
    }
}
