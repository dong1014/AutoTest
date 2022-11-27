package com.course.testNG.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("这是beforesuit");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("这是aftersuite");
    }
}
