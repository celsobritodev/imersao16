package com.deploydesexta.imersao16.domain;

public record SHA1Password(String value) implements Password {

	public static SHA1Password create (String plainPassword) {
		return new SHA1Password(hash(plainPassword));
	}
	
	
	@Override
	public boolean validate(final String password) {

		return value().equals(password);
	}
	
	
	
	private static String hash(final String plainText) {

		return Hashing.sha1().hashString(plainText,StandardCharset.UTF_8).toString();
	}


}
