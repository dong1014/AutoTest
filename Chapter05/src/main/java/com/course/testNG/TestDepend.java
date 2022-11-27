package com.course.testNG;

import org.testng.annotations.Test;

public class TestDepend {

    @Test
    public void test01(){
        System.out.println("测试方法1");
//        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test01"})
    public void test02(){
        System.out.println("测试方法2");
    }

}
