package com.project;

import java.util.Arrays;

import org.testng.TestNG;
import org.testng.xml.internal.TestNamesMatcher;

public class SuiteparallelRun {

	public static void main(String[] args) {
		//String s1[]= {"r1","r2"};
		
		//String s[]=new String[2];
		//s[0]="r1";
		//s[1]="r2";
		
		//String s3[]=new String[] {"r1","r2"};
		
		TestNG obj=new TestNG();
		obj.setTestSuites(Arrays.asList(new String[]{System.getProperty("user.dir")+"//megasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();

	}

}
