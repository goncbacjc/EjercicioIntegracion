package com.springboot.backend.apirest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBackendApirestApplicationTests {

	@InjectMocks
	private BCryptPasswordEncoder passwordEncoder;

	@Test
	public void runTest() {
		/**
		 * Método que verifica que coincidan los primeros 7 digitos del password
		 * **/

		// Given
		String password = "12345";
		String expected = "$2a$10$";

		//When
		String passwordBcrypt = passwordEncoder.encode(password);

		//Then
		assertEquals(expected, passwordBcrypt.substring(0,7));
		}



}
