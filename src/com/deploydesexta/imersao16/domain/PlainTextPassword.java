package com.deploydesexta.imersao16.domain;

public record PlainTextPassword(String value) implements Password {

	@Override
	public boolean validate(final String password) {
		return value().equals(password);
	}

}
