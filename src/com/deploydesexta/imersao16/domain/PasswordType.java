package com.deploydesexta.imersao16.domain;

public class PasswordType {
	
	public static String create(String passwordType, String password) {
		
		Password passwordStrategy = new PlainTextPassword("123456");
		
		var plainPass = switch (passwordStrategy) { 
		case PlainTextPassword(String pass) -> pass;
		case SHA1Password(String pass) -> pass;
		//default -> throw new IllegalArgumentException("Unexpected value: " + passwordStrategy);
		};
		
		  
		return plainPass;
		
		}
		
		
	}
	


