package suiteB;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestB1 {
  @Test
  public void f() throws InterruptedException 
  {
	  System.out.println("Starting of TestB1");
	  Thread.sleep(4000);
	  System.out.println("Ending of TestB1");
  }
  
  }


