package com.kadum.converters;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import com.kadum.Currency;

@Provider
public class CurrencyParamConverterProvider implements ParamConverterProvider {

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {	
		return new ParamConverter<T>() {

			@Override
			public T fromString(String code) {
				Currency currency = null;
				
				switch(code.toUpperCase()) {
					case "EUR": currency = new Currency(code, "Euro"); break;
					case "USD": currency = new Currency(code, "US Dollar"); break;
					case "INR": currency = new Currency(code, "Rupees"); break;
				}
				
				return (T) currency;
			}

			@Override
			public String toString(T currency) {
				return currency.toString();
			}
			
		};
	}
}
