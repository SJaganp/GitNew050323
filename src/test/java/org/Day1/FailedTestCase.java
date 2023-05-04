package org.Day1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedTestCase implements IAnnotationTransformer {

	public void transform(ITestAnnotation test, Class testClass, Constructor testConstructor, Method testMethod) {
		
		IRetryAnalyzer res = test.getRetryAnalyzer();
		
		if (res == null) {
			
			 test.setRetryAnalyzer(RerunFailedTestCase.class);
		} 
		
	}

	

		
	
}
