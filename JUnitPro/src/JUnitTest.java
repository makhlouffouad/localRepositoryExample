import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitTest {

	public static boolean dbConnection(){
		return false;
	}
	
	@BeforeClass
	public static void seleniumSetup(){
		System.out.println("starting selenium server");
		//Assume.assumeTrue(dbConnection());
	}
	
	@Before
	public void testOpenBrowser(){
		System.out.println("opening firefox");
	}
	
	@Test
	
	public void testNavigation(){
		System.out.println("Opening the website");
	}
	
	//@Ignore
	@Test
	public void testLoginDetails(){
		System.out.println("login details");
	}
	
	@After
	public void testCloseBrowser(){
		System.out.println("close browser");
		
	}	
	
	@AfterClass
	public static void seleniumShuttdown(){
		System.out.println("shutting down selenium");
	}
}






