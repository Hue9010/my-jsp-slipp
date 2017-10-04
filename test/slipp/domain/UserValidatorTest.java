package slipp.domain;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserValidatorTest {

	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Test
	public void userIdIsNull() {
		User user = new User(null, "password", "name", "");
		Set<ConstraintViolation<User>> constrationViolations = validator.validate(user);
		assertEquals(1, constrationViolations.size());
		System.out.println(constrationViolations.iterator().next().getMessage());
	}

	@Test
	public void userIdLength() throws Exception{
		User user = new User("us", "password", "name", "");
		Set<ConstraintViolation<User>> constrationViolations = validator.validate(user);
		assertEquals(1, constrationViolations.size());
		System.out.println(constrationViolations.iterator().next().getMessage());
		
		user = new User("us12345678910", "password", "name", "");
		constrationViolations = validator.validate(user);
		assertEquals(1, constrationViolations.size());
		System.out.println(constrationViolations.iterator().next().getMessage());
	}
	
	@Test
	public void email() throws Exception{
		User user = new User("user", "password", "name", "email");
		Set<ConstraintViolation<User>> constrationViolations = validator.validate(user);
		assertEquals(1, constrationViolations.size());
		System.out.println(constrationViolations.iterator().next().getMessage());
	}

	@Test
	public void invalIdUser() throws Exception{
		User user = new User("us", "password", "name", "email");
		Set<ConstraintViolation<User>> constrationViolations = validator.validate(user);
		assertEquals(2, constrationViolations.size());
		Iterator<ConstraintViolation<User>> violations = constrationViolations.iterator();
		while(violations.hasNext()) {
			ConstraintViolation<User> each = violations.next();
			System.out.println(each.getPropertyPath() + " : " +  each.getMessage());
		}
	}

}
