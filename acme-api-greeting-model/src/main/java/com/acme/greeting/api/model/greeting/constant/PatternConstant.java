package com.acme.greeting.api.model.greeting.constant;

public final class PatternConstant {

	private PatternConstant() {

	}

	public static final String ALPHABETIC_CHARACTER_ONLY = "[a-zA-Z]+";
	public static final String NUMERIC_CHARACTER_ONLY = "[0-9]+";
	public static final String ALPHABETIC_CHARACTER_AND_NUMERIC = "[A-Za-z0-9\\-]+";

	public static final String E_MAIL = "^(.+)@(.+)$";
	public static final String PHONE_INTERNATIONAL = "^\\+(?:[0-9] ?){6,14}[0-9]$";
	public static final String ANY = "[\\s\\S]+";
	public static final String URL = "^(http|https):\\/\\/(.*)";

	public static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss";

}
