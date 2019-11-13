package src;
import org.junit.Test;

import junit.framework.TestCase;


public class HelloWorldTest extends TestCase {

	public static void main (String[] args) {
		System.out.println("Test");
	}
	
	@Test
	public void testCase1() {
		HelloWorld world = new HelloWorld();
		assertEquals("Test case 1 Passed","Hello Capco", world.sayHello());
	}
	
	@Test
	public void testCase2() {
		HelloWorld world = new HelloWorld();
		assertEquals("Test case 2 Passed","HELLO CAPCO", world.sayHello().toUpperCase());
	}

}
