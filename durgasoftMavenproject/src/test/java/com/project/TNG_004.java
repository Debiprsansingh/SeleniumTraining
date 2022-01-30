package com.project;

import org.testng.annotations.Test;

public class TNG_004 {
  @Test
  public void test1() 
  {
	  System.out.println("i m test1: " +Thread.currentThread().getId());
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("i m test2: " +Thread.currentThread().getId());
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("i m test3 : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test4() 
  {
	  System.out.println("i m test4: "+ Thread.currentThread().getId());
  }
  
}
