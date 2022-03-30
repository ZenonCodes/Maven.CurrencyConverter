package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.*;

public class Rupee implements ConvertableCurrency {

    public Rupee(){

    }
    @Override
    public String toString(){
        return String.valueOf(RUPEE);
    }
}
