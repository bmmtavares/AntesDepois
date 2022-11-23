import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AntesDepois {

	@BeforeEach
	public void before() {
		System.out.println("@Before");
		
	}
	
	@AfterEach
	public void after() {
		System.out.println("@After");
	}
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("@beforeClass");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("@afterClass");
	}
	
	@Test
	void test1() {
		System.out.println("Teste1");
	}
	
	@Test
	void test2() {
		System.out.println("Teste2");
	}
	
	@Test
	void test3() {
		System.out.println("Teste3");
	}

}
