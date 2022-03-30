package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.*;

public class Euro implements ConvertableCurrency {
    public Euro(){

    }
    @Override
    public String toString(){
        return String.valueOf(EURO);
    }
}
