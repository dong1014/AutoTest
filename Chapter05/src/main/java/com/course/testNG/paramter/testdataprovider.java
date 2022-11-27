package com.course.testNG.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class testdataprovider {

    @Test(dataProvider = "data")
    public void test01(String name,int age){
        System.out.println("这是test01"+"name="+name+"age="+age);
    }
    @Test(dataProvider = "data")
    public void test02(String name,int age){
        System.out.println("这是test02"+"name="+name+"age="+age);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvide(Method method){
        Object[][] result = null;

        if(method.getName().equals("test01")) {
            result = new Object[][]{
                    {"Jenny",18},
                    {"Danny",10}
            };
        } else if (method.getName().equals("test02")) {
            result = new Object[][]{
                    {"mingming",21},
                    {"xiaoli",23}
            };

        }
        return result;

    }
}
