package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

import static io.zipcoder.currencyconverterapplication.CurrencyType.*;

public class ChineseYR implements ConvertableCurrency {

    public ChineseYR(){

    }
    @Override
    public String toString(){
        return String.valueOf(CHINESE_YR);
    }
}
