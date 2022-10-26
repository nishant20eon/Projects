package com.eon.spring.springcore.properties;

import java.util.Properties;

public class CountriesandLanguages {
	private Properties CountryAndLangs;

	public Properties getCountryAndLangs() {
		return CountryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		CountryAndLangs = countryAndLangs;
	}
	
	@Override
	public String toString() {
		return "CountriesandLanguages [CountryAndLangs=" + CountryAndLangs + "]";
	}

}
