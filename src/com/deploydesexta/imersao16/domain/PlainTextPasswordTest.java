package com.deploydesexta.imersao16.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlainTextPasswordTest {
	
	@Test
	public void deveriaCriarUmPlainPassword() {
		
		final var expectedPassord = "123456";
		
		var password = new PlainTextPassword(expectedPassord);
		
		Assertions.assertTrue(password.validate(expectedPassord));
		
		
	}

}
