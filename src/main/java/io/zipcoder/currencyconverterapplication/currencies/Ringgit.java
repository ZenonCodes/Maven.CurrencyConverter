package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.*;

public class Ringgit implements ConvertableCurrency {

    public Ringgit(){

    }
    @Override
    public String toString(){
        return String.valueOf(RINGGIT);
    }
}
