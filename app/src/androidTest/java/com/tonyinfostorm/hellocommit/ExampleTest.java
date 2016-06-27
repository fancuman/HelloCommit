package com.tonyinfostorm.hellocommit;

import android.test.InstrumentationTestCase;

/**
 * Created by higer on 2016/6/26.
 */
public class ExampleTest extends InstrumentationTestCase{
    public void testCase1(){
        final int expected = 1;
        final int reality = 1;
        assertEquals(expected, reality);
    }
}
