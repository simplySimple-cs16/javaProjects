package com.kadum.converters;

import javax.ws.rs.ext.ParamConverter;

import com.kadum.Currency;


public class CurrencyParamConverter implements ParamConverter<Currency>{

	@Override
	public Currency fromString(String code) { //code is the value of query param
		Currency currency = null;
		
		switch(code.toUpperCase()) {
			case "EUR": currency = new Currency(code, "Euro"); break;
			case "USD": currency = new Currency(code, "US Dollar"); break;
			case "INR": currency = new Currency(code, "Rupees"); break;
		}
		
		return currency;
	}

	@Override
	public String toString(Currency currency) {
		return currency.toString();
	}
	

}
