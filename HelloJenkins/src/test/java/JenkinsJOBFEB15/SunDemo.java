package JenkinsJOBFEB15;
 import org.junit.*;
 
public class SunDemo {

	@Before
	public void login()
	{
		 System.out.println("Login window of web");
	}
	@Test
	public void addTocart()
	{
		System.out.println("Add to shopping cart");
	}
	@After
	public void logout()
	{
		System.out.println("logout");
	}
}
