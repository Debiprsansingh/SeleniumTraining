package suiteA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestA2 {
  @Test
  public void f() throws InterruptedException 
  {
	  System.out.println("Starting of TestA2");
	  Thread.sleep(4000);
	  System.out.println("Ending of TestA2");
  }
  
  }


