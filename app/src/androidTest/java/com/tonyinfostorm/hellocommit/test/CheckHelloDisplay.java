package com.tonyinfostorm.hellocommit.test;

import com.tonyinfostorm.hellocommit.MainActivity;
import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


public class CheckHelloDisplay extends ActivityInstrumentationTestCase2<MainActivity> {
  	private Solo solo;
  	
  	public CheckHelloDisplay() {
		super(MainActivity.class);
  	}

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
        //Wait for activity: 'com.tonyinfostorm.hellocommit.MainActivity'
		solo.waitForActivity(com.tonyinfostorm.hellocommit.MainActivity.class, 2000);
        //Set default small timeout to 45158 milliseconds
		Timeout.setSmallTimeout(45158);
        //Assert that: 'Hello World!' is shown
		assertTrue("'Hello World!' is not shown!", solo.waitForText(java.util.regex.Pattern.quote("Hello World!"), 1, 20000, true, true));
	}
}
